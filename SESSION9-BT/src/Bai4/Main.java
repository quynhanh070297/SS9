package Bai4;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hinh chu nhat");
        Shape chuNhat = new Rectangle("Do", 3.5, 5.5);
        chuNhat.disPlay();
        chuNhat.getArea();
        System.out.println("S hình chữ nhật là: "+chuNhat.getArea());
        System.out.println("----------------------------------------------------");

        System.out.println("Hinh tron");
        Shape hinhTron = new Circle("xanh", 5.7);
        hinhTron.disPlay();
        chuNhat.getArea();
        System.out.println("S hình tròn là: "+hinhTron.getArea());
    }
}
