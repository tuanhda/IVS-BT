import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner mn = new Scanner(System.in);
        System.out.println("hay nhap so a");
        float a = mn.nextFloat();
        System.out.println("hay nhap so b");
        float b = mn.nextFloat();
        if( a > b){
            System.out.println(a + "la so lon nhat");
        } else {
            System.out.println(b + "la so lon nhat");
        }
    }
}
