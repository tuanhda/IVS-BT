import java.util.Scanner;

public class GPTB2 {
    public static void main(String[] args) {
        Scanner mn = new Scanner(System.in);
        System.out.println("hay nhap so a");
        int a = mn.nextInt();
        System.out.println("hay nhap so b");
        int b = mn.nextInt();
        System.out.println("hay nhap so c");
        int c = mn.nextInt();
        double d = (Math.sqrt(b) - 4*a*c);
        if( d > 0){
            double x1 = (-b + Math.sqrt(d)) / 2*a;
            double x2 = (-b - Math.sqrt(d)) / 2*a;
            System.out.println("Phuong trinh co 2 nghiem phan biet" + x1 + " " + x2);                        
        } else if  ( d == 0 ){
            float x1 = -b/2*a;
            float x2 = -b/2*a;
            System.out.print("Phuong trinh co nghiem kep la:" + x1 + x2);

        }else {
            System.out.println("Phuong trinh vo nghiem");
        }
    }
}
