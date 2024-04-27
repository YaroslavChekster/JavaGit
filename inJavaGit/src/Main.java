import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello world!");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println(num(num1, num2));
    }

    public static int num(int num1, int num2) {
        return (num2 * num1 / 10 + num1 *2) * 10;
    }
}