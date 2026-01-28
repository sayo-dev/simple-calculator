import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a first number: ");
        double fNum = sc.nextDouble();

        System.out.println("Please input an operator (+, *, / -): ");
        char operator = sc.next().charAt(0);

        System.out.println("Please enter a second number: ");
        double lNum = sc.nextDouble();

        double result;
        switch (operator) {
            case '+':
                result = fNum + lNum;
                break;
            case '-':
                result = fNum - lNum;
                break;

            case '*':
                result = fNum * lNum;
                break;

            case '/':
                if (lNum == 0) {
                    System.out.println("Cannot divide by zero");
                    return;
                }
                result = fNum / lNum;
                break;
            default:
                System.out.println("Invalid operator");
                return;

        }
        System.out.println("Answer is: " + result);


    }

}