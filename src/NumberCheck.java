import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner nc = new Scanner(System.in);
        System.out.println("hay nhap num");
        int num = nc.nextInt();
        isPositve(num);
        isOdd(num);
    }

    public static void isPositve(int num) {
        if (num > 0) {
            System.out.println(num + "la so duong ");
        } else if (num < 0) {
            System.out.println(num + "la so am ");
        } else {
            System.out.println(num + "day la so 0 ");
        }
    }

    public static void isOdd(int num) {
        if (num % 2 == 0) {
            System.out.println(num + "la so chan ");
        } else {
            System.out.println(num + "la so le ");
        }
    }
}