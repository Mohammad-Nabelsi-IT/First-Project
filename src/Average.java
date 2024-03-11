import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        readNumber();

    }

    public static int getAverage(int n1, int n2, int n3) {
        return (n1 + n2 + n3) / 3;
    }

    public static void readNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("enter first number : ");
        int number1 = scanner.nextInt();

        System.out.printf("enter second number : ");
        int number2 = scanner.nextInt();

        System.out.printf("enter third number : ");
        int number3 = scanner.nextInt();

        System.out.printf("Average number : %d %n",getAverage(number1,number2,number3));


    }
}
