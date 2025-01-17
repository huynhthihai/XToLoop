package lec5;

import java.util.Scanner;

public class Bai9 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("nhap n: ");
    int n = scanner.nextInt();
    int sogoc = n;
    int daonguoc = 0;
    while (n != 0) {
      int chuso = n % 10;
      daonguoc = daonguoc * 10 + chuso;
      n /= 10;
    }
    if (sogoc == daonguoc) {
      System.out.println("la so doi xung");
    } else {
      System.out.println("khong phai la so doi xung");
    }
  }
}