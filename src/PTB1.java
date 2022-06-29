import java.util.Scanner;

public class PTB1 {
    public static void main(String[] args) {
        Scanner pt = new Scanner(System.in);
        System.out.println("hay nhap so a");
        int a = pt.nextInt();
        System.out.println("hay nhap so b");
        int b = pt.nextInt();
        int x = -b/a;
        System.out.println("ket qua la x =" + x);
    }
}
