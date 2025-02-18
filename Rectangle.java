public class Rectangle implements IShapeTemplate {
    @Override
    public void Area() {
        System.out.println("Rectangle area calculated");
    }

    @Override
    public void Perimeter() {
        System.out.println("Rectangle perimeter calculated");
    }
}