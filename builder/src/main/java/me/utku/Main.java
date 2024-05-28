package me.utku;

public class Main {
    public static void main(String[] args) {
        Person person = Person.builder()
                .name("Utku")
                .surname("Sahin")
                .age(25)
                .phone(123456789)
                .build();
        person.print();
    }
}