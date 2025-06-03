package Lab4Ex2;

public class ShapeTest {
    public static void main(String[] args) {
        // Creare obiecte
        Triangle triangle = new Triangle("rosu", 5, 4);
        Circle circle = new Circle("verde", 2);
        
        // Test toString()
        System.out.println(triangle);
        System.out.println(circle);
        
        // Test equals()
        Triangle triangle2 = new Triangle("rosu", 5, 4);
        System.out.println("\nTriunghiurile sunt egale? " + triangle.equals(triangle2));
        
        // Test vector de forme
        Form[] shapes = new Form[2];
        shapes[0] = triangle;
        shapes[1] = circle;
        
        System.out.println("\nAfisare forme din vector:");
        for (Form shape : shapes) {
            System.out.println(shape);
        }
        
        // Test metode specifice folosind instanceof
        System.out.println("\nAfisare dimensiuni folosind instanceof:");
        for (Form shape : shapes) {
            if (shape instanceof Triangle) {
                ((Triangle) shape).printTriangleDimensions();
            } else if (shape instanceof Circle) {
                ((Circle) shape).printCircleDimensions();
            }
        }
        
        // Test metode specifice fara instanceof
        System.out.println("\nAfisare dimensiuni fara instanceof:");
        for (Form shape : shapes) {
            printShapeDimensions(shape);
        }
    }
    
    // Metoda pentru afisarea dimensiunilor fara instanceof
    private static void printShapeDimensions(Form shape) {
        if (shape.getClass() == Triangle.class) {
            ((Triangle) shape).printTriangleDimensions();
        } else if (shape.getClass() == Circle.class) {
            ((Circle) shape).printCircleDimensions();
        }
    }
} 