import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

//import bank;

public class Main {
    public static void main(String[] args) {

        /*
        *
        * Learning JAVA
        *
        */

        System.out.println("Hello Java!"); //space after line
        System.out.print("hiiii"); //no space after line

        //Variables
        String name = "Roopal";
        int age = 24;
        System.out.println(name);

        //Types
        //Primative
        byte a = 12;
        int phone = 98765;
        long phone2 = 9602529740L;
        float pi = 3.14F;
        char letter = '(';
        boolean isAdult = false;

        //Non-Primative
        String fname = "Rupu";
        System.out.println(fname.length());

        String friend = new String("keshu");

        //Strings
        //concatenate
        String name3 = fname + " and " + friend;
        System.out.println(name3);

        //charAt
        System.out.println(fname.charAt(1));

        //replace
        System.out.println(fname.replace('u','l'));

        //substring
        System.out.println(fname.substring(0,2));

        ///////////////////////////////////////////////////////////////////////////

        //Arrays
        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 98;
        marks[2] = 95;

        System.out.println(marks[0]);

        //length
        System.out.println(marks.length);

        //sort
        Arrays.sort(marks);
        System.out.println(marks[0]);

        int[] height = {18, 15, 2};
        System.out.println(height[1]);

        //2D Array

        int[][] finalMarks = {{97,96,95},{94,93,98}};
        System.out.println(finalMarks[1][0]);


        /////////////////////////////////////////////////////

        //Casting

        //Implicit Casting
        double Price = 100.0;
        double finalPrice = Price + 18;
        System.out.println(finalPrice);

        //Explicit Casting
        int p = 100;
        int fp = p + (int)18.99; //truncate all the digits after decimal
        System.out.println(fp);


        /////////////////////////////////////////////////////

        //constants
        final float PI = 3.14F;

        //////////////////////////////////////////////////////
        //Maths

        System.out.println(Math.max(8.9,3));
        System.out.println(Math.min(8.9,3));
        System.out.println((int)( Math.random() * 100));

        //////////////////////////////////////////////////////
        //INPUTS

        Scanner sc = new Scanner(System.in);
//        System.out.println("Input your age: ");
//        int Age = sc.nextInt();
//        System.out.println(Age);


        //string as token as Input
//        System.out.println("Enter your name: ");
//        String Name = sc.next();
//        System.out.println(Name);

        //long line as input
//        System.out.println("Enter about you: ");
//        String about = sc.nextLine();
//        System.out.println(about);

//        Student s1 = new Student("Roopal");
//        s1.Name = "hi";
//        System.out.println(s1.Name);
//        s1.printName();

        Student s1 = new Student();
        s1.Name = "AA";
        System.out.println(s1.Name);

        Student s2 = new Student(s1);
        s2.printName();


        Student.school = "MPS";
        Student s3 = new Student();
        s3.Name = "s3";
        System.out.println(s3.school);

        s3.changeSchool();

        System.out.println(s3.school);

//        bank.Account account1 = new bank.Account();
//        account1.name = "c1";


        Horse h1 = new Horse();
        h1.walk();
        h1.eat();

//        Animal a1 = new Animal();
//        a1.walk();


        Triangle t = new Triangle();
        t.color();



        //Sting Builder
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //char at index 0
        System.out.println(sb.charAt(0));

        //set chat at index 1
        sb.setCharAt(1,'a');
        System.out.println(sb);

        //insert at 2 index
        sb.insert(2,'n');
        System.out.println(sb);


        //delete index 2 and 3
        sb.delete(2,4);
        System.out.println(sb);

        //append 'ab' at last
        sb.append('a');
        sb.append('b');
        System.out.println(sb);

        System.out.println(sb.length());


    }
}

class Student{

    String Name;
    static String school;

    public void printName(){
        System.out.println(this.Name);
    }

    public static void changeSchool(){
        school = "MGPS";
    }

    //NON Parameterized constructor
    Student(){
        System.out.println("NON Parameterized constructor");
    }

    //Parameterized constructor
//    Student(String Name){
//        System.out.println("Parameterized constructor");
//        this.Name = Name;
//    }


    //Copy Constructor
    Student(Student s){
        this.Name = s.Name;
    }

}

//Abstract Classes
abstract class Animal{
     abstract void walk();
    public void eat() {
        System.out.println("eat");
    }
}
class Horse extends Animal{
    public void walk(){
        System.out.println("4 legs");
    }
}


//Interfaces

interface Shape{
    void color();
}

interface  Herbivore{
    void food();
}

class Triangle implements Shape, Herbivore{
    public void color(){
        System.out.println("pink");
    }
    public void food(){
        System.out.println("food");
    }
}