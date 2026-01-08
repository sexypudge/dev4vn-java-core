package Lab8;

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
    }

    public String getGrade() {
        return grade;
    }


    public void calGrade() {
        if (mark >= 8) grade = "distinction";
        else if (mark >= 7) grade = "credit";
        else if (mark >= 5) grade = "pass";
        else grade = "fail";
    }


    @Override
    public void input() {
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập điểm: ");
        mark = sc.nextInt();
        calGrade();
    }


    @Override
    public void display() {
        super.display();
        System.out.println("Điểm: " + mark + ", Xếp loại: " + grade);
        System.out.println("Xếp loại: "+grade);
    }




}
