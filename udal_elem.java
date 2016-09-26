import java.util.Scanner;

class udal_elem {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    int[] a = new int[5];
    System.out.println("Enter the array:");
    for (int i = 0; i < a.length; i++) {
      a[i] = scan.nextInt();
    }
    System.out.println("Vvedite indeks:");
    int i = scan.nextInt();
    for (int l = i; l < a.length-1; l++) {
      a[l]=a[l+1];
    }
    System.out.println("vash otvet:");
    for (int l = 0; l < a.length-1; l++) {
      System.out.println(a[l]);
    }
  }
}
