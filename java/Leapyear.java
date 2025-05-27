import java.util.*;
class Leapyear
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      long year=sc.nextLong();
      if(year%4==0&&year%100!=0||year%400==0)
      {
        System.out.println("Leapyear");
      }
      else
      {
        System.out.println("Not a Leapyear");
      }
    }
  }
