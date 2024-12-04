import java.util.*;
public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Shape[] shapes = new Shape[10];
        for (int i = 0; i < shapes.length; i++) {
            int shapeType = random.nextInt(3);
            shapes[i] = switch (shapeType) {
                case 0 -> new Sphere(1 + random.nextDouble() * 9);
                case 1 -> new Cylinder(1 + random.nextDouble() * 9, 5 + random.nextDouble() * 15);
                case 2 -> new Cube(1 + random.nextDouble() * 9);
                default -> throw new IllegalStateException("Unexpected value: " + shapeType);
            };
        }
        for (Shape shape : shapes) {
            if (shape == null) {
                System.out.println("Null shape found! Skipping...");
                continue;
            }
            System.out.println(shape);
            System.out.printf("Surface Area: %.2f%n", shape.surfaceArea());
            System.out.printf("Volume: %.2f%n", shape.volume());
            System.out.println();
        }
    }
}