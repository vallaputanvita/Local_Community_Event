import java.util.*;
class Targetnumber
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      Random rand=new Random();
      int target=rand.nextInt(100);
      int guess;
      int attempt=0;
      do
        {
          guess=sc.nextInt();
          attempt++;
          if(guess>target)
          {
            System.out.println("TO high,Try again");
          }
          else if(guess<target)
          {
            System.out.println("TO Low,Try again");
          }
          else
          {
            System.out.println("WOW!,reached your target at attempt "+attempt);
          }
        }while(guess!=target);
    }
  }
