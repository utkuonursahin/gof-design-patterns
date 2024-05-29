package me.utku;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();

        System.out.println("First state is: "+ context.getLampState().getClass().getSimpleName());

        context.onOpen();
        System.out.println(context.toString());

        context.onOpen();
        System.out.println(context.toString());

        context.onClose();
        System.out.println(context.toString());

        context.onClose();
        System.out.println(context.toString());
    }
}