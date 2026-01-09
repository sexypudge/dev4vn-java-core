package lab9;

import java.util.Scanner;

public class vdmang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum = 0;

        System.out.println(" Nhập số nguyên");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }
        System.out.println("Tổng các số vừa nhập là: " + sum);

        System.out.println(" nhập phần tử thứ 6");
        try {
            System.out.print("nhập giá trị cho pt thứ 6: ");
            int value = scanner.nextInt();


            numbers[5] = value;

        } catch (Exception e) {

            System.out.println(" Mảng  có 5 pt, không nhập được pt 6");
        } finally {
            System.out.println("Kết thúc ct");
            scanner.close();
        }
    }
}
