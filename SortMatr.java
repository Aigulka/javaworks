import java.util.Scanner;

class SortMatr {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    int[][] a = new int[3][3];
    int i,j,k;
    System.out.println("Enter the array:");
    for (i = 0; i < a.length; i++) {
      for (j = 0; j < a.length; j++) {
        a[i][j] = scan.nextInt();
      }
    }

    for (i = 0; i < a.length; i++) {
      for (k = a[i].length-1; k > -1; k--) {
        for (j = 0; j < a.length-1; j++) {
          if (a[i][j] > a[i][j+1]) {
            int d = a[i][j];
            a[i][j] = a[i][j+1];
            a[i][j+1] = d;
          }
        }
      }
    }
    System.out.println("The right array:");
    for (i = 0; i < a.length; i++) {
      for (j = 0; j < a[i].length; j++) {
        System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }
  }
}
