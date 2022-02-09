package com.company;

public class Person {
    private String name;
    private String designation;


    public Person(String name, String designation) {
        this.name = name;
        this.designation = designation;

    }

    public void learn () {
        System.out.println(name+ " diligently teaches own profession");
    }

    public void walk () {
        System.out.println(name+" like to walk in his free time");
    }

    public void eat () {
        System.out.println(name+" eats to gain strenght ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }


    @Override
    public String toString() {
        return "Person " +
                "name='" + name + '\'' +
                ", designation='" + designation + '\'' +
                " ";
    }
}
