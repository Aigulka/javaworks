import java.util.Scanner;

class sum_glav {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    int [][] a = new int[3][3];
    int sum = 0;
    int i,j;
    System.out.println("Vvedite massiv:");
    for (i = 0; i < 3; i++) {
      for (j = 0; j < 3; j++) {
        a[i][j] = scan.nextInt();
      }
    }
    for (i = 0; i < 3; i++) {
      for (j = 0; j < 3; j++) {
        if (j > i) {
          sum = sum + a[i][j];
        }
      }
    }
    System.out.println("summa=" + sum);
  }
}
