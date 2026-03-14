public class JavaTest0001 {

    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int space = 1; space <= rows - i; space++) {
                System.out.print(" ");
            }

            System.out.print("*"); 

            if (i > 1) {
                for (int space = 1; space <= (2 * i - 3); space++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            System.out.println();
        }

        for (int i = rows - 1; i >= 1; i--) {
            for (int space = 1; space <= rows - i; space++) {
                System.out.print(" ");
            }

            System.out.print("*");

            if (i > 1) {
                for (int space = 1; space <= (2 * i - 3); space++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
