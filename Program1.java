class Program {
    public static void main(String[] args) {
int a=18732;
int b=a/5000;
a=a%5000;
int c=a/1000;
a=a%1000;
int d=a/500;
a=a%500;
int e=a/100;
a=a%100;
int f=a/50;
a=a%50;
int g=a/10;
a=a%10;
int h=a/5;
a=a%5;
int i=a/2;
a=a%2;
int k=a/1;
    System.out.println("5000:"+b+",1000:"+c+",500:"+d+",100:"+e+",50:"+f+",10:"+g+",5:"+h+",2:"+i+",1:"+k);
  }
}