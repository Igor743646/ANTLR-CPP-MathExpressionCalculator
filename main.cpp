#include <iostream>

#include "MathExpressionCalculator.h"

using namespace antlrcpptest;
using namespace antlr4;

int main(int, const char **) {
    ANTLRInputStream input("0.001 * Gamma(2.0 - alpha) * pow(x - a, alpha) * (log(x - a) + 1)");
    TLexer lexer(&input);
    CommonTokenStream tokens(&lexer);

    tokens.fill();
    for (auto token : tokens.getTokens()) {
        std::cout << token->toString() << std::endl;
    }

    TParser parser(&tokens);
    TParser::RootContext *tree = parser.root();
    std::cout << tree->toStringTree(&parser, true) << std::endl;
    
    ExpressionVisitor visitor({{"x", 3.0}, {"a", 1.0}, {"alpha", 1.5}});
    std::any result = tree->accept(dynamic_cast<tree::ParseTreeVisitor*>(&visitor));

    std::cout << std::any_cast<double>(result) << std::endl;

    return 0;
}
