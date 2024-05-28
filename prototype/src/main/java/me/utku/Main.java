package me.utku;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Utku");
        person.setSurname("Sen");
        person.setAge(25);
        person.setPhone(1234567890);

        Person person2 = person.clone();
        System.out.println(person2.getName());
        System.out.println(person2.getSurname());
        System.out.println(person2.getAge());
        System.out.println(person2.getPhone());
    }
}