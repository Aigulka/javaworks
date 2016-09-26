import java.util.Scanner;

class min_vishe_gl {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    int [][] a = new int[3][3];
    int sum = 0;
    int i,j,min;
    System.out.println("Vvedite massiv:");
    for (i = 0; i < 3; i++) {
      for (j = 0; j < 3; j++) {
        a[i][j] = scan.nextInt();
      }
    }
    min = a[1][2];
    for (i = 0; i < 3; i++) {
      for (j = 0; j < 3; j++) {
        if (j > i & a[i][j] < min) {
          min = a[i][j];
        }
      }
    }
    System.out.println("min_elem=" + min);
  }
}
