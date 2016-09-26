import java.util.Scanner;

class locmin {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    int[] a = new int[5];
    System.out.println("Enter the array:");
    for (int i=0; i < a.length; i++) {
      a[i] = scan.nextInt();
    }
    int c = a[1];
    for (int i=2; i<a.length-1; i++) {
      if (a[i]<a[i+1] & a[i]<c) {
        c=a[i];
      }
    }
    System.out.print("Result:");
    System.out.println(c);
  }
}
