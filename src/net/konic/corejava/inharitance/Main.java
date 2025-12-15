package net.konic.corejava.inharitance;

public class Main {

	public static void main(String[] args) {
        Student s = new Student();
        s.name = "Rahul";
        s.age = 20;
        s.rollNo = 101;

        System.out.println("Name: " + s.name);
        System.out.println("Age: " + s.age);
        System.out.println("Roll No: " + s.rollNo);
    }
}
