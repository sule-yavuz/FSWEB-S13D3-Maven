package org.example;

public class Person {
    String firstName;
    String lastName;

    int age;

    double salary;

    boolean isMarried;

    String[] hobbies;


    public Person(String firstName,String lastName,int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
   public  Person(String firstName, String lastName, int age, double salary, boolean isMarried, String[] hobbies) {
        this(firstName,lastName,age);
        this.salary = salary;
        this.isMarried = isMarried;
        this.hobbies = hobbies;
   }

   public String getFirstName(){
        return this.firstName;
   }

   public String getLastName(){
        return this.lastName;
   }

   public int getAge(){
        return this.age;
   }

   public boolean isTeen(){
        return this.age>13 && age <= 19;
   }

   public String[] getHobbies(){
        return this.hobbies;
   }
}
