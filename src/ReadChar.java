import java.util.Scanner;

public class ReadChar {
    public static void main(String[] args) {
        Scanner rc = new Scanner( System.in );
        System.out.println("hay nhap vao 1 so"); 
        byte i = rc.nextByte();
        long l = i;
        float f = l;
        System.out.println("ket qua " + f); 
    }
}

