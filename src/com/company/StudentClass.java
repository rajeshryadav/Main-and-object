package com.company;

public class StudentClass {
    String Name;
    String ClassName;
    int RollNumber;
    int Division;

    public void setName(String name) {
        Name = name;
    }

    public void setClassName(String className) {
        ClassName = className;
    }

    public void setRollNumber(int rollNumber) {
        RollNumber = rollNumber;
    }

    public void setDivision(int division) {
        Division = division;
    }

    public String getName() {
        return Name;
    }

    public String getClassName() {
        return ClassName;
    }

    public int getRollNumber() {
        return RollNumber;
    }

    public int getDivision() {
        return Division;
    }
}
