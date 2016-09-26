import java.util.Scanner;

class min2 {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    int[] a = new int[5];
    System.out.println("Enter the array:");
    for (int i=0; i < a.length; i++) {
      a[i] = scan.nextInt();
    }
    int c = a[0];
    for (int i=1; i<a.length; i++) {
      if (a[i]<c) {
        c=a[i];
      }
    }
    System.out.print("Result:");
    System.out.println(c);
  }
}
