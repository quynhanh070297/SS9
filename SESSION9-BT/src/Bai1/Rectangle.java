package Bai1;

public class Rectangle extends Shape {
    private double width = 1.0;
    private double height = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }


    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return (width + height) * 2;
    }

    @Override
    public String toString() {
        return "A Rectangle with width = "
                + getWidth()
                + " and length = "
                + getHeight()
                + ", which is a subclass of "
                + super.toString();
    }

    @Override
    public void resize(double percent) {

        if (width==height){
            System.out.println("Do dai canh truoc thay doi la: "+width );
            this.width*=percent;
            this.height*=percent;
            System.out.println("Do dai canh sau thay doi la: "+width );
            System.out.println("---------------------------");
        }
        else {System.out.println("Chieu rong truoc thay doi la: "+width + " || " + "Chieu dai truoc thay doi la: "+height);
            this.width*=percent;
            this.height*=percent;
            System.out.println("Chieu rong sau thay doi la: "+width + " || " + "Chieu dai sau thay doi la: "+height);
            System.out.println("---------------------------");}
    }
}