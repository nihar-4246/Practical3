package Nihar;
public class TestGeometric {
    public static void main(String[] args) {
        GeometricObject gObj1 = new Circle(5);
        GeometricObject gObj2 = new Rectangle(5,3);
        System.out.println("Does the objects have same area? : " + equalArea(gObj1, gObj2));
        System.out.println();
        displayCircle(gObj1);
        System.out.println();
        displayRectangle(gObj2);
        System.out.println();
        System.out.print("This program is made by 21CE100");
    }
    public static boolean equalArea(GeometricObject object1, GeometricObject object2) {
        return object1.getArea() == object2.getArea();
    }
    public static void displayCircle(GeometricObject object){
        System.out.println("Circle:-");
        System.out.println("The area is " + object.getArea());
        System.out.println("The perimeter is " + object.getPerimeter());
    }
    public static void displayRectangle(GeometricObject object) {
        System.out.println("Rectangle:-");
        System.out.println("The area is " + object.getArea());
        System.out.println("The perimeter is " + object.getPerimeter());
    }
}