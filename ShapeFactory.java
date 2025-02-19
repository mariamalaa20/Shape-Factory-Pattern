public class ShapeFactory {
    public IShapeTemplate createShape(int shapeNumber) {
        if (shapeNumber == 1)
            return new Rectangle();
        else if (shapeNumber == 2)
            return new Triangle();
        else
            return null;
    }
}