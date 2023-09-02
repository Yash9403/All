public class MotorVehicleFactory {
    public MotorVehicle create(String name) throws IllegalAccessException
    {
        if(name == null || name.isEmpty())
        {
            return null;
        }
        switch (name)
        {
            case "MOTORCYCLE":
                return new Motorcycle();
            case "CAR":
                return new Car();
            default:
                throw new IllegalAccessException();
        }
    }
}
