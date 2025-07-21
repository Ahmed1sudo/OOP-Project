public class Task5 {
    public static void main(String[] args) {
        Shape c = new Circle(5);
        Shape s = new Square(4);

        System.out.println("Area of Circle: " + c.getArea());
        System.out.println("Area of Square: " + s.getArea());
    }
}

interface Shape {
    double getArea();
}

class Circle implements Shape {
    double radius;

    Circle(double r) {
        radius = r;
    }

    public double getArea() {
        return 3.14 * radius * radius;
    }
}

class Square implements Shape {
    double side;

    Square(double s) {
        side = s;
    }

    public double getArea() {
        return side * side;
    }
}
