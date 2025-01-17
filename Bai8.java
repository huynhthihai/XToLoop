package lec5;

public class Bai8 {

  public static void main(String[] args) {
    int[] number = { 10, 25, 45, 20, 5 };
    for (int i = 0; i < 5; i++) {
      for (int j = i + 1; j < 5; j++) {
        if (number[i] < number[j]) {
          int temp = number[j];
          number[j] = number[i];
          number[i] = temp;
        }
      }
    }
    System.out.println("largest " + number[0]);

  }
}