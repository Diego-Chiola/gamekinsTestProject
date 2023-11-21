package com.unige.gamekins_plugin_test;

public class Person {
    private String firstname;
    private String familyname;
    private int age;
    private Person spouse;

    public Person(String firstname, String familyname, int age){
        this.firstname = firstname;
        this.familyname = familyname;
        this.age = age;
        this.spouse = null;
    }

    public Person(){};

    public boolean Marry(Person to){
        if(this.isMarried() || to.isMarried()){
            System.out.println("One of the person is already married");
            return false;
        }
        this.spouse = to;
        to.spouse = this;
        return true;
    }

    public Person getSpouse() {
        if(this.isMarried()) return spouse;
        return null;
    }

    public String getFirstname() { return firstname; }

    public String getFamilyName() { return familyname; }

    public int getAge() { return age; }

    private boolean isMarried() { return this.getSpouse() != null ? true : false; }
}
