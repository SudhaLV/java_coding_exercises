package com.techreturners.exercise002;

public class Person {

    //Person p1 = new Person("Peter", "Smith", "Manchester", 17);
    //Person p2 = new Person("Francis", "Farmer", "Leeds", 18);

    private String fname;
    private String lname;
    private String city;
    private int age;

    public Person(String fname, String lname, String city, int age) {
        this.fname = fname;
        this.lname = lname;
        this.city = city;
        this.age = age;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getCity() {
        return city;
    }

    public int getAge() { return age; }
}