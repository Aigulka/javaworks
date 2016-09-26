import java.util.Scanner;

class z2{
public static void main(String args[]){
  Scanner scanner =
			new Scanner(System.in);
      int a = scanner.nextInt();
      int s1=1;
      int s2=0;
      while (a != -999){
        if (a%2==0){
          s1=s1*a;
        }
        if (a<0){
          s2=s2+a;
        }
      a = scanner.nextInt();
      }
      System.out.println("SUMM = " + s2);
      System.out.println("proizv =" + s1);
}
}
