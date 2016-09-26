import java.util.Scanner;

class prostie {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    int[] a = new int[5];
    int i,l;
    System.out.println("Enter the array:");
    for (i = 0; i < a.length; i++) {
      a[i] = scan.nextInt();
    }
    for (i = 0; i < 5; i++) {
      for (l = 2; l*l < a[i]; l++) {
        if (a[i] % l == 0) {
          break;
        }
       System.out.println("prostie:" + a[i]);
      }
     }
    }
  }
