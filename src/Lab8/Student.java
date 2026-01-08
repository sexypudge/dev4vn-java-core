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
        super.display(); // In ra id, name, age từ class cha
        System.out.println("Điểm: " + mark + ", Xếp loại: " + grade);
    }


    public static void main(String[] args) {
        Student st = new Student();
        System.out.println("Nhập thông tin sinh viên ");
        st.input();

        System.out.println("\n Thông tin sinh viên vừa nhập");
        st.display();
    }

}
