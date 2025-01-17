package lec5;

import java.util.Scanner;

public class Bai2 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("nhap n: ");
    int n = scanner.nextInt();
    int a = 0, b = 1;
    System.out.print("0 1 ");
    for (int i = 2; i < n; i++) {
      int temp = a + b;
      System.out.print(temp + " ");
      a = b;
      b = temp;
    }
  }
}