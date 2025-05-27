import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int ch=sc.nextInt();
    switch(ch)
      {
        case 1: int c=a+b;
          System.out.println(c);
          break;
        case 2:int d=a-b;
          System.out.println(d);
          break;
        case 3:int e=a*b;
          System.out.println(e);
          break;
        case 4:int f=a/b;
          System.out.println(f);
          break;
      }
  }
}
