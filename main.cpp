#include <iostream>
#include <unordered_map>
#include <limits>
#include <numbers>
#include <numeric>
#include <cmath>

#include "antlr4-runtime.h"
#include "TLexer.h"
#include "TParser.h"
#include "TParserBaseVisitor.h"
#include <functional>

using namespace antlrcpptest;
using namespace antlr4;

class ExpressionVisitor : public antlrcpptest::TParserVisitor {
public:

    ExpressionVisitor(std::unordered_map<std::string, double>&& vals) : values(std::move(vals)) {}

    virtual std::any visitRoot(TParser::RootContext *context) override {
        std::cout << context->getText() << std::endl;
        std::any childResult = context->children[0]->accept(this);
        double result = std::any_cast<double>(childResult);

        return result;
    }

    virtual std::any visitFunction(TParser::FunctionContext *context) override {
        return context->children[0]->accept(this);
    }

    virtual std::any visitBrackets_operation(TParser::Brackets_operationContext *context) override {
        return context->children[1]->accept(this);
    }

    virtual std::any visitIdential(TParser::IdentialContext *context) override {

        std::string val = context->getText();
        if (values.contains(val)) {
            return values[val];
        }

        throw "visitIdential";
    }

    virtual std::any visitValue(TParser::ValueContext *context) override {
        return std::stod(context->getText());
    }

    virtual std::any visitUnary_operation(TParser::Unary_operationContext *context) override {
        std::string op = std::any_cast<std::string>(context->children[0]->accept(this));
        double a = std::any_cast<double>(context->children[1]->accept(this));

        if (op == "-") return -a;

        throw "visitUnary_operation";
    }

    virtual std::any visitBinary_operation(TParser::Binary_operationContext *context) override {
        double a = std::any_cast<double>(context->children[0]->accept(this));
        double b = std::any_cast<double>(context->children[2]->accept(this));
        std::string op = std::any_cast<std::string>(context->children[1]->accept(this));

        if (op == "+") return a + b;
        if (op == "-") return a - b;
        if (op == "*") return a * b;
        if (op == "/") return a / b;
        if (op == "<") return static_cast<double>(a < b);
        if (op == ">") return static_cast<double>(a > b);
        if (op == "<=") return static_cast<double>(a <= b);
        if (op == ">=") return static_cast<double>(a >= b);
        if (op == "==") return static_cast<double>(a == b);
        if (op == "&&") return static_cast<double>(a && b);
        if (op == "||") return static_cast<double>(a || b);

        throw "visitBinary_operation";
    }

    virtual std::any visitTernary_operation(TParser::Ternary_operationContext *context) override {
        double a = std::any_cast<double>(context->children[0]->accept(this));
        double b = std::any_cast<double>(context->children[2]->accept(this));
        double c = std::any_cast<double>(context->children[4]->accept(this));
        return (a ? b : c);
    }

    virtual std::any visitUn_op(TParser::Un_opContext *context) override {
        return context->getText();
    }

    virtual std::any visitBin_op(TParser::Bin_opContext *context) override {
        return context->getText();
    }

    virtual std::any visitFunc(TParser::FuncContext *context) override {
        std::string functionName = std::any_cast<std::string>(context->children[0]->getText());
        std::vector<double> arguments;

        for (int i = 2; i < context->children.size(); i += 2) {
            std::cout << context->children[i]->getText() << std::endl;
            double temp = std::any_cast<double>(context->children[i]->accept(this));
            arguments.push_back(temp);
        }

        if (functionName == "sin") return std::sin(arguments[0]);
        if (functionName == "cos") return std::cos(arguments[0]);
        if (functionName == "Gamma") return Gamma(arguments[0]);
        if (functionName == "Beta") return Beta(arguments[0], arguments[1]);
        if (functionName == "lgamma") return std::lgamma(arguments[0]);
        if (functionName == "log") return std::log(arguments[0]);
        if (functionName == "pow") return std::pow(arguments[0], arguments[1]);
        
        throw "visitFunc";
    }

private:

    static constexpr double Gamma(double x) {
        return x > 0 
            ? std::tgamma(x) 
            : -std::numbers::pi_v<double> / (x * std::sin(std::numbers::pi_v<double> * x) * std::tgamma(-x));
    }

    static double Beta(double x, double y) {
        double res = Gamma(x) * Gamma(y) / Gamma(x + y);
        if (std::isnan(res)) {
            res = std::numeric_limits<double>::infinity();
        }
        return res;
    }

    std::unordered_map<std::string, double> values;
};

int main(int, const char **) {
    ANTLRInputStream input("0.001 * Gamma(2.0 - alpha) * pow(x - a, alpha) * (log(x - a) + 1)");
    TLexer lexer(&input);
    CommonTokenStream tokens(&lexer);

    tokens.fill();
    for (auto token : tokens.getTokens()) {
        std::cout << token->toString() << std::endl;
    }

    TParser parser(&tokens);
    antlrcpptest::TParser::RootContext *tree = parser.root();
    std::cout << tree->toStringTree(&parser, true) << std::endl;
    
    ExpressionVisitor visitor({{"x", 3.0}, {"a", 1.0}, {"alpha", 1.5}});
    std::any result = tree->accept(dynamic_cast<antlr4::tree::ParseTreeVisitor*>(&visitor));

    std::cout << std::any_cast<double>(result) << std::endl;

    return 0;
}
