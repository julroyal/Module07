public class PartB {
    public static void main(String[] args) {
        int row = 0;
        int column = 0;

        for (row = 1; row <= 5; row++)
        {
            for (column = 1; column <= row; column++)
                System.out.print("*");
            System.out.println();
        }

        System.out.println("Task 6:");

        for (row = 1; row <= 5; row++)
        {
            for (column = row; column <= 5; column++)
                System.out.print("*");
            System.out.println();
        }

        System.out.println("Task 7:");

        for (row = 1; row <= 5; row++)
        {
            for (column = 1; column <= 5; column++)
                System.out.print("*");
            System.out.println();
        }
    }
}