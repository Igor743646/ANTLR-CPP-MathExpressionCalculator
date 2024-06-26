CMAKE_MINIMUM_REQUIRED(VERSION 3.22 FATAL_ERROR)
project(ExpressionParser CXX)

list(APPEND CMAKE_MODULE_PATH ${CMAKE_CURRENT_SOURCE_DIR}/cmake)

# compiler must be 23
set(CMAKE_CXX_STANDARD 23)

# required if linking to static library
add_definitions(-DANTLR4CPP_STATIC)

# using /MD flag for antlr4_runtime (for Visual C++ compilers only)
set(ANTLR4_WITH_STATIC_CRT OFF)
# add external build for antlrcpp
include(ExternalAntlr4Cpp)
include(FindANTLR)
# add antrl4cpp artifacts to project environment
include_directories(${ANTLR4_INCLUDE_DIRS})

# set variable pointing to the antlr tool that supports C++
# this is not required if the jar file can be found under PATH environment
set(ANTLR_EXECUTABLE ${CMAKE_CURRENT_SOURCE_DIR}/bin/antlr-4.13.1-complete.jar)

# add macros to generate ANTLR Cpp code from grammar
find_package(ANTLR REQUIRED)

# Call macro to add lexer and grammar to your build dependencies.
antlr_target(SampleGrammarLexer "grammar/TLexer.g4" LEXER
             PACKAGE antlrcpptest)
antlr_target(SampleGrammarParser "grammar/TParser.g4" PARSER
             PACKAGE antlrcpptest
             DEPENDS_ANTLR SampleGrammarLexer
             COMPILE_FLAGS -visitor -listener -lib ${ANTLR_SampleGrammarLexer_OUTPUT_DIR})

# include generated files in project environment
include_directories(${ANTLR_SampleGrammarLexer_OUTPUT_DIR})
include_directories(${ANTLR_SampleGrammarParser_OUTPUT_DIR})
include_directories(${ANTLR_SampleGrammarVisitor_OUTPUT_DIR})

add_library(MathExpressionCalculator STATIC OBJECT 
    MathExpressionCalculator.cpp
    ${ANTLR_SampleGrammarLexer_CXX_OUTPUTS}
    ${ANTLR_SampleGrammarParser_CXX_OUTPUTS}
    ${ANTLR_SampleGrammarVisitor_CXX_OUTPUTS}
)
message("${antlr4_static}")
target_link_libraries(MathExpressionCalculator PUBLIC antlr4_static)

# add generated grammar to demo binary target
add_executable(main main.cpp)
target_link_libraries(main antlr4_static MathExpressionCalculator)