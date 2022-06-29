import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner sd = new Scanner(System.in);
        System.out.println("nhap ten");
        String fullName = sd.nextLine();
        System.out.println("nhap dia chi");
        String addRess = sd.nextLine();
        System.out.println("nhap so");
        String number = sd.nextLine();
        System.out.println("nhap yob");
        int yob = sd.nextInt();
        int result = Integer.parseInt(number);
        System.out.println("fullname: " + fullName);
        System.out.println("Address: " + addRess);
        System.out.println("yob: " + yob);
        System.out.println("result: " + result);
    }
}
