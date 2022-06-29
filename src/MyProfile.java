public class MyProfile {
    final String hoTen= "Hang Do Anh Tuan";
    final String ngaySinh = "12/06/2000";
    String diaChi = "59/1 Phuong Sai";
    long soDT = 899351695;
    public static void main(String[] args) throws Exception {
       MyProfile info = new MyProfile();
       info.myInfo();
    }
    public void myInfo () {
        System.out.println(this.hoTen + " " + this.ngaySinh + " " + this.diaChi + " " + this.soDT);
    }
}