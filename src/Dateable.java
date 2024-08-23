import java.util.Scanner;

public class Dateable {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your age");
      int age = sc.nextInt();

      int youngestDA = (age/2)+7;

      System.out.println("The youngest dating age is" + youngestDA);




    }
}
