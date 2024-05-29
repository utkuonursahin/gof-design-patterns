package me.utku;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<RoleExpression> createExpressionTree(String formula){
        List<RoleExpression> tree = new ArrayList<>();
        for(char c : formula.toCharArray()){
            if(c == 'A') tree.add(new TerminalExpression.ArchitectureExpression());
            else if(c == 'C') tree.add(new TerminalExpression.ConsultantExpression());
            else if(c == 'S') tree.add(new TerminalExpression.SeniorExpression());
            else if(c == 'D') tree.add(new TerminalExpression.DeveloperExpression());
        }
        return tree;
    }

    static void runExpression(Context context){
        for(RoleExpression expression : createExpressionTree(context.formula)){
            expression.interpret(context);
        }
        System.out.println(STR."Cost point for \{context.formula}: \{context.totalPoint}");
    }

    public static void main(String[] args) {
        System.out.println("Architecture: 5, Consultant: 10, Senior: 15, Developer: 20");
        Context context = new Context();
        context.setFormula("ACSSDDDD");
        runExpression(context);
    }
}