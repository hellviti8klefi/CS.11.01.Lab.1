import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();


        int readpages = (100-age);

        System.out.println("You should read " + readpages);

    }
}
