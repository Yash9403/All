public class ShapeFactory {

    public shape drawShape(String shapename) throws IllegalAccessException
    {
        if(shapename == null || shapename.isEmpty())
        {
            return null;
        }
        switch(shapename)
        {
            case "CIRCLE":
                return new DrawCircle();
            case "RECTANGLE":
                return new DrawRectangle();
            case "SQUARE":
                return new DrawSquare();
            default:
                throw new IllegalAccessException("Unknown shapeName: "+shapename);
        }
    }
}
