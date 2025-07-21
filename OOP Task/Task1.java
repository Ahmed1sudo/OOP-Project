public class Task1 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name = "Alice";
        p1.age = 25;

        // عرض البيانات
        p1.display();
    }
}

// تعريف الكلاس Person
class Person {
    String name;
    int age;

    // دالة لعرض البيانات
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

