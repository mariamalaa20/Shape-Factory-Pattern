public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        IShapeTemplate shape1 = shapeFactory.createShape(1); // Create a Rectangle
        shape1.Area();
        shape1.Perimeter();

        IShapeTemplate shape2 = shapeFactory.createShape(2); // Create a Triangle
        shape2.Area();
        shape2.Perimeter();
    }
}
