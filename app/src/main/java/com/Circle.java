public class Circle extends Shape
{
    private int radius;
    String color = "blue";
    public Circle(int x, int y, int radius)
    {
        this.x =x;
        this.y =y
        this.radius = radius;
    }

    public int getRadius()
    {
        return radius;
    }
}