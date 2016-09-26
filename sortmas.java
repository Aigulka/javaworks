import java.util.Scanner;

class sortmas {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    int[] a = new int[5];
    System.out.println("Enter the array:");
    for (int i = 0; i < a.length; i++) {
      a[i] = scan.nextInt();
    }
    int d = 0;
    for (int i = a.length-1; i > -1; i--) {
      for (int j = 0; j < a.length-1; j++) {
        if (a[j] > a[j+1]) {
          d = a[j];
          a[j] = a[j+1];
          a[j+1] = d;
      }
    }
  }
  System.out.println("vash otvet:");
    for (int i = 0; i < a.length; i++) {
      System.out.println(a[i]);
    }
  }
}
