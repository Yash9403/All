public class ShapeFactory {

    public Shape getShape(String s)
    {
        if(s == null)
        {
            return null;
        }
        if (s.equalsIgnoreCase("circle"))
        {
            return new Circle();
        } else if (s.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (s.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
