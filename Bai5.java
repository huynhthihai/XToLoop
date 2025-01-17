package lec5;

import java.util.Scanner;

public class Bai5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("nhap n: ");
    int n = scanner.nextInt();
    int dem = 0;
    while (n != 0) {
      n /= 10;
      dem++;
    }
    System.out.print("so chu so = " + dem);
  }
}