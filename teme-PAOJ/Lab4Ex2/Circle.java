package Lab4Ex2;

public class Circle extends Form {
    private float radius;
    
    public Circle() {
        super();
        this.radius = 0;
    }
    
    public Circle(String color, float radius) {
        super(color);
        this.radius = radius;
    }
    
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
    
    @Override
    public String toString() {
        return "Cerc: " + super.toString() + " " + getArea();
    }
    
    public void printCircleDimensions() {
        System.out.println("Raza: " + radius);
    }
} 