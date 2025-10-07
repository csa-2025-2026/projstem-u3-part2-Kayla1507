import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    Scanner scan = new Scanner(System.in);  // input from the keyboard
    /* ============= BEGIN SOLUTION ================================ */
    System.out.println("Enter in a number");
    double target = 12.345;
    double user_input = scan.nextDouble();

    if(user_input == target)
    {
      System.out.println("yes");

    }

    int user_int1 = scan.nextInt();
    int user_int2 = scan.nextInt();
    boolean twice = user_int1*2 == user_int2;

    if(twice == true)
    {
      System.out.println("yes");

    }

    int divide = scan.nextInt();
    int d2 = divide % 2;
    int d3 = divide % 3;

    if(d2 == 0)
    {
      System.out.println("2");

    }

     if(d3 == 0)
    {
      System.out.println("3");

    }

      if(d3 == 0 || d2 == 0);
    {
      System.out.println("23");

    }

    int userEvem = scan.nextInt();
    int even = userEvem % 2;

    if(even == 0)
    {
      System.out.println("even");

    }

    else
    {
            System.out.println("odd");

    }


    





    /* ============= END SOLUTION ================================== */
    scan.close();
  }
}
