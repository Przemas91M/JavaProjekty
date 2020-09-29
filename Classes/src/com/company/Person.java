package com.company;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }
    public void setFirstName(String name){
        this.firstName = name;
    }
    public void setLastName(String name){
        this.lastName = name;
    }
    public void setAge(int age){
        if(age < 0 || age > 100){
            this.age = 0;
            return;
        }
        this.age = age;
    }
    public boolean isTeen(){
        return (this.age > 12 && this.age < 20);
    }
    public String getFullName(){
        if(firstName.isEmpty() && lastName.isEmpty()){
            return "";
        }
        else if(firstName.isEmpty()){
           return this.lastName;
        }
        else if(lastName.isEmpty()){
            return this.firstName;
        }
        return this.firstName + " " + this.lastName;
    }
}
