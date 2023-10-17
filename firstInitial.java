public class firstInitial {
    public static void main(String[] args) {
        int row = 0;
        int column = 0;

        for (row = 0; row <= 11; row++) {
            for (column = 0; column <= 6; column++) {
                if (row >= 0 && row < 2 || row >= 2 && row <= 9 && column == 3 || row >= 7 &&
                        row <= 9 && column == 0 || row > 9 && column <= 3) {
                    System.out.print("***");
                }
                else {
                    System.out.print("   ");
                }
            }
            System.out.print("\n"); }
        }
    }
