package com.company;
public class Main {

    public static void main(String[] args) {
	Calculate c = new Calculate();
    c.sumWholeNumbers();
    Person p= new  Person("sofia",25);
    p.doWork();
    System.out.println("Company Name is "+ Person.companyName);
    Person.justSayHello();
    }
}
