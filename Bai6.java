package lec5;

public class Bai6 {

  public static void main(String[] args) {
    System.out.println("cac so nguyen to tu 1 den 100 la: ");
    for (int i = 1; i <= 100; i++) {
      bool songuyento = true;
      for (int j = 2; j <= Math.sqrt(i); j++) {
        if (i % j == 0) {
          songuyento = false;
          break;
        }
        if (songuyento) {
          System.out.print(i + " ");
        }
      }
    }
  }
}