package me.utku;

public class Person {
    public String name;
    public String surname;
    public int age;
    public int phone;

    public void print(){
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
        System.out.println("Phone: " + phone);
    }

    public static PersonBuilder builder(){
        return new PersonBuilder();
    }

    public static class PersonBuilder{
        private Person person = new Person();

        public PersonBuilder name(String name){
            person.name = name;
            return this;
        }

        public PersonBuilder surname(String surname){
            person.surname = surname;
            return this;
        }

        public PersonBuilder age(int age){
            person.age = age;
            return this;
        }

        public PersonBuilder phone(int phone){
            person.phone = phone;
            return this;
        }

        public Person build(){
            return person;
        }
    }
}
