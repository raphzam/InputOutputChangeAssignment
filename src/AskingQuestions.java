import java.util.Scanner;

public class AskingQuestions
{
    public static void main( String[] args )
    {
        Scanner keyboard = new Scanner(System.in);

        double num1, num2, num3;

        System.out.print( "First temperature? " );
        num1 = keyboard.nextDouble();
//        keyboard.nextLine();

        System.out.print( "Second temperature? " );
        num2 = keyboard.nextDouble();
//        keyboard.nextLine();

//        System.out.println("The max value is : " + Math.max(num1, num2));

        System.out.println("The average of the two values is " + ((num1+num2) / 2));


    }
}