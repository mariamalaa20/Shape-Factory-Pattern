public class Triangle implements IShapeTemplate {
    @Override
    public void Area() {
        System.out.println("Triangle area calculated");
    }

    @Override
    public void Perimeter() {
        System.out.println("Triangle perimeter calculated");
    }
}