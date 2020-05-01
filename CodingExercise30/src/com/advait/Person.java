package com.advait;

public class Person {

    private String firstName;
    private String lastName;
    private int age;
    private String Eesthamoku;

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getAge() {
        return this.age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if(age < 0 || age > 100) {
            age = 0;
            this.age = age;
        } else {
            this.age = age;
        }
    }

    public boolean isTeen() {
        if(age > 12 && age < 20) {
            return true;
        } return false;
    }

    public String getFullName() {
        if(getFirstName().isEmpty() && getLastName().isEmpty()) {
            return "";
        }

        if (getLastName().isEmpty()) {
            return getFirstName();
        }
        if (getFirstName().isEmpty()) {
            return getLastName();
        }
        else {
            return (firstName + " " + lastName);
        }
    }


}
