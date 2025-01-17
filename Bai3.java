package lec5;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap n: ");
        int n = scanner.nextInt();
        int sum = 0;
        int giaithua = 1;
        for (int i = 1; i <= n; i++) {
            giaithua *= i;
            sum += giaithua;
        }
        System.out.print("tong giai thua = " + sum);
    }
}