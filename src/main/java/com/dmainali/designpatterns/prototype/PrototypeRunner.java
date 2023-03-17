package com.dmainali.designpatterns.prototype;

public class PrototypeRunner {
    public static void main(String[] args) {
        Person prototype = new Person("John", 30, "123 Main St.");

        Person person1 = prototype.clone();
        Person person2 = prototype.clone();

        person1.setName("Jane");
        person1.setAge(25);
        person1.setAddress("456 Elm St.");

        person2.setName("Jim");
        person2.setAge(35);
        person2.setAddress("789 Oak St.");

        System.out.println(person1.getName() + " is " + person1.getAge() + " years old and lives at " + person1.getAddress());
        System.out.println(person2.getName() + " is " + person2.getAge() + " years old and lives at " + person2.getAddress());
    }
}
