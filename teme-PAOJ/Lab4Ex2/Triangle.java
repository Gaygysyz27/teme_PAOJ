package Lab4Ex2;

public class Triangle extends Form {
    private float height;
    private float base;
    
    public Triangle() {
        super();
        this.height = 0;
        this.base = 0;
    }
    
    public Triangle(String color, float height, float base) {
        super(color);
        this.height = height;
        this.base = base;
    }
    
    @Override
    public double getArea() {
        return (base * height) / 2;
    }
    
    @Override
    public String toString() {
        return "Triunghi: " + super.toString() + " " + getArea();
    }
    
    public void printTriangleDimensions() {
        System.out.println("Baza: " + base + ", Inaltime: " + height);
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        
        Triangle triangle = (Triangle) obj;
        return Float.compare(triangle.height, height) == 0 &&
               Float.compare(triangle.base, base) == 0 &&
               color.equals(triangle.color);
    }
} 