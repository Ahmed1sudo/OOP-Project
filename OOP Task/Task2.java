public class Task2 {
    public static void main(String[] args) {
        // إنشاء مستطيل
        Rectangle r = new Rectangle();
        r.length = 10;
        r.width = 5;

        // نطبع مساحه المستطيل
        double area = r.calculateArea();
        System.out.println("Area of Rectangle: " + area);
    }
}

// كلاس المستطيل
class Rectangle {
    double length;
    double width;

    double calculateArea() {
        return length * width;
    }
}
