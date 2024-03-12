import java.util.Scanner;

public class isEven {
    public static void main(String[] args) {
        getEven();
    }

    /**
     * method is even found number input from user
     */
    public static void getEven() {

        Scanner scanner = new Scanner(System.in);
        System.out.printf("Please Enter Number : ");
        int number = scanner.nextInt();
        while (true) {
            if (number % 2 == 0) {
                System.out.printf("is Even Number %d %n", number);

                // again Question
                System.out.printf("Please Enter New Number?");
                number = scanner.nextInt();
            } else {
                System.out.printf("is Odd Number %d %n",number);
                break;
            }


        }

    }
}
