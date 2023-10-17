import java.util.Scanner;

public class newCtoF {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int celsius = 0;
        int fahrenheit = 0;

            System.out.println("Please enter temperature in Celsius: ");
            celsius = in.nextInt();

            do {
                System.out.println("Your input is invalid, please try again: ");
                celsius = in.nextInt();
            } while (celsius < -273);

        fahrenheit = (int) (1.8 * celsius + 32);
        System.out.println("The temperature in Fahrenheit is " + fahrenheit);
        }
    }
