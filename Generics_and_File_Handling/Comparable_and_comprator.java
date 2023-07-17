package Generics_and_File_Handling;

import javax.swing.event.SwingPropertyChangeSupport;
import java.util.*;

class Student
{
    int marks;
    int age;
    String name;
    public Student(int marks , int age , String name){
        this.marks = marks;
        this.age = age;
        this.name = name;

    }
    public int getMarks() {
        return marks;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public String toString()
    {
        return "" + marks + " _ " + age + " _ " + name;
    }
}
public class Comparable_and_comprator {
    public static void main(String[] args) {





    }
}
