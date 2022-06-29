import java.util.ArrayList;
import java.util.Scanner;

class Coffename {
    private int stt;
    private String cname;
    private Double price;

    public Coffename(int stt, String cname, Double price) {
        this.stt = stt;
        this.cname = cname;
        this.price = price;
    }

    public Coffename() {
    }

    public int getStt() {
        return stt;

    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String toString() {
        return "[STT: " + stt + ", Coffeename: " + cname + ", Price: " + price + "]";
    }
}

public class CoffeMenu {
    public static void main(String[] args) {
        ArrayList<Coffename> listCoffename = new ArrayList<Coffename>();
        Coffename coffemenu1 = new Coffename(1, "AMERICANO", 1.25);
        Coffename coffemenu2 = new Coffename(2, "ESPRESSO", 2.50);
        Coffename coffemenu3 = new Coffename(3, "RISTRETTO", 3.10);
        Coffename coffemenu4 = new Coffename(4, "MOCHA", 4.50);
        Coffename coffemenu5 = new Coffename(5, "LATTE", 5.10);
        Coffename coffemenu6 = new Coffename(6, "VIENNA", 6.27);
        Coffename coffemenu7 = new Coffename(7, "GLACE", 7.80);
        Coffename coffemenu8 = new Coffename(8, "CAPPUCHINO", 8.25);
        Coffename coffemenu9 = new Coffename(9, "MACCHIATO", 9.50);
        Coffename coffemenu10 = new Coffename(10, "CON PANNA", 0.95);
        listCoffename.add(coffemenu1);
        listCoffename.add(coffemenu2);
        listCoffename.add(coffemenu3);
        listCoffename.add(coffemenu4);
        listCoffename.add(coffemenu5);
        listCoffename.add(coffemenu6);
        listCoffename.add(coffemenu7);
        listCoffename.add(coffemenu8);
        listCoffename.add(coffemenu9);
        listCoffename.add(coffemenu10);
        System.out.println("Coffee List: ");
        for (int i = 0; i < listCoffename.size(); i++) {

            System.out.println(listCoffename.get(i));
        }
        Coffename [] arrA = new Coffename[listCoffename.size()];
        arrA = listCoffename.toArray(arrA);
        Scanner arrB = new Scanner(System.in);
        System.out.println("Nhập số nguyên cần tìm: ");
        for (int i = 0; i < arrA.length; i++) {
            System.out.println("loai coffe o vi tri " + i + " "
                    + "trong danh sach là " + arrA[i]);
        }
    }
}
