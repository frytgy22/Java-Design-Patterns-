package org.mystat.Lebedeva;

import java.util.Stack;
//split string, parse
interface Expression {
    int interptret(Expression context);
}

public class InterpreterLesson {
    public static void main(String[] args) {
        String expression = "1+2+3-4";//2
        Expression evaluator = new Evaluate(expression);
        System.out.println(evaluator.interptret(evaluator));
    }
}

class Number implements Expression {
    int number;

    public Number(int number) {
        this.number = number;
    }

    @Override
    public int interptret(Expression context) {
        return number;
    }
}

class Plus implements Expression {
    Expression expressionLeft;
    Expression expressionRight;

    public Plus(Expression expressionLeft, Expression expressionRight) {
        this.expressionLeft = expressionLeft;
        this.expressionRight = expressionRight;
    }

    @Override
    public int interptret(Expression context) {
        return expressionLeft.interptret(context) + expressionRight.interptret(context);
    }
}

class Minus extends Plus {
    public Minus(Expression expressionLeft, Expression expressionRight) {
        super(expressionLeft, expressionRight);
    }

    @Override
    public int interptret(Expression context) {
        return expressionLeft.interptret(context) - expressionRight.interptret(context);
    }
}

class Evaluate implements Expression {
    Expression evaluate;

    public Evaluate(String expression) {
        Stack<Expression> expressions = new Stack<>();
        String expressionRevert = new StringBuilder(expression).reverse().toString();
        for (String s : expressionRevert.split("\\D")) {
            expressions.push(new Number(Integer.parseInt(s)));
        }
        for (String s : expression.split("\\d")) {
            if (s.equals("+")) {
                expressions.push(new Plus(expressions.pop(), expressions.pop()));
            } else if (s.equals("-")) {
                expressions.push(new Minus(expressions.pop(), expressions.pop()));
            }
        }
        evaluate = expressions.pop();
    }

    @Override
    public int interptret(Expression context) {
        return evaluate.interptret(context);
    }
}