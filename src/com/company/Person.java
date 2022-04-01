package com.company;
public class Person {
    private String name;
    private int age;
    public static String companyName = "Pragra";
    public void doWork()
    {
        System.out.println("working");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println(name+" "+age);
    }
    public static void justSayHello()
    {
        System.out.println("hello"+ companyName);
    }
}
