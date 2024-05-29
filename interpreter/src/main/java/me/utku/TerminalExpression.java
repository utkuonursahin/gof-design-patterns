package me.utku;

public class TerminalExpression {
    public static class ArchitectureExpression implements RoleExpression{
        public void interpret(Context context){
            if(context.getFormula().contains("A")) context.totalPoint += 5;
        }
    }

    public static class ConsultantExpression implements RoleExpression{
        public void interpret(Context context){
            if(context.getFormula().contains("C")) context.totalPoint += 10;
        }
    }

    public static class SeniorExpression implements RoleExpression{
        public void interpret(Context context){
            if(context.getFormula().contains("S")) context.totalPoint += 15;
        }
    }

    public static class DeveloperExpression implements RoleExpression{
        public void interpret(Context context){
            if(context.getFormula().contains("D")) context.totalPoint += 20;
        }
    }
}
