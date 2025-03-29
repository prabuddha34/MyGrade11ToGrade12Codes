// Circle class (superclass)
public class Circle1 {
    protected double radius;  // Radius of the circle
    
    // Constructor
    public Circle1(double radius) {
        this.radius = radius;
    }
    
    // Display method to show circle information
    public void display() {
        System.out.println("Circle Radius: " + radius);
    }
}