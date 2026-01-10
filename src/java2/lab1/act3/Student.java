package java2.lab1.act3;

import java.util.Scanner;

public class Student extends Person {
    private int mark;
    private String grade;

    public Student() {
        super();
    }

    public Student(String id, String name, int age, int mark) {
        super(id, name, age);
        this.mark = mark;
        calGrade();
    }
    public int getMark() {
        return mark;
    }
    public void setMark(int mark) {
        this.mark = mark;
        calGrade();
    }
    public String getGrade() {
        return grade;
    }
    public void calGrade() {
        if (mark >= 8) {
            grade = "distinction";
        } else if (mark >= 7) {
            grade = "credit";
        } else if (mark >= 5) {
            grade = "pass";
        } else {
            grade = "fail";
        }
    }

    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap diem: ");
        mark = sc.nextInt();
        calGrade();
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Diem: " + mark);
        System.out.println("Xep loai: " + grade);
    }
    public static void main(String[] args) {
        Student s = new Student();

        System.out.println("Nhap thong tin sinh vien:");
        s.input();

        System.out.println("Thong tin sinh vien da nhap:");
        s.display();
    }
}
