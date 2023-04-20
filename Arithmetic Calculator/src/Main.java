import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division");
        System.out.println("Pick your choice" );
        int choice = sc.nextInt();

        if(choice>=1 && choice<=4)
        {
            System.out.println("Enter any two Numbers to Calculate");
            int X = sc.nextInt();
            int Y = sc.nextInt();

            switch(choice)
            {
            case 1:
                System.out.println("Addition : " + (X+Y));
                break;
            case 2:
                System.out.println("Subtraction : " + (X-Y));
                break;
            case 3:
                System.out.println("Multiplication : " + (X*Y));
                break;
            case 4:
                System.out.println("Division : " + (X/Y));
                break;
            }
		}
        else
            System.out.println("Invalid Choice");
    }
}