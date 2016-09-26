  import java.util.Scanner;

class peresech_mas {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    int[] a = new int[5];
    int[] b = new int[5];
    System.out.println("Enter the array_a:");
    for (int i = 0; i < a.length; i++) {
      a[i] = scan.nextInt();
    }
    System.out.println("Enter the array_b:");
    for (int j = 0; j < b.length; j++) {
      b[j] = scan.nextInt();
    }
    System.out.println("Peresechenie massivov:");
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < b.length; j++) {
        if (b[j]==a[i]) {
          System.out.println(b[j]);
        }
      }
    }
  }
}
