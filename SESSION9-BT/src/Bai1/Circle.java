
    package Bai1;

    public class Circle extends Shape {
        private double radius = 1.0;

        public Circle() {
        }

        public Circle(double radius) {
            this.radius = radius;
        }

        public Circle(double radius, String color, boolean filled) {
            super(color, filled);
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public double getArea() {
            return radius * radius * Math.PI;
        }

        public double getPerimeter() {
            return 2 * radius * Math.PI;
        }

        @Override
        public String toString() {
            return "A Circle with radius = "
                    + getRadius()
                    + ", which is a subclass of "
                    + super.toString();
        }

        @Override
        public void resize(double percent) {
            System.out.println("Ban kinh truoc thay doi: "+radius);
            this.radius*=percent;
            System.out.println("Ban kinh sau thay doi: "+radius);
            System.out.println("---------------------------");
        }
    }
