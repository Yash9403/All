public class ShapeService {
    public static void main(String[] args) throws IllegalAccessException{
        ShapeFactory s = new ShapeFactory();
        shape s1 = s.drawShape("RECTANGLE");
        s1.draw();
    }
}
