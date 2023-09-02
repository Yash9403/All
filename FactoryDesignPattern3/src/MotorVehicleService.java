public class MotorVehicleService {

    public static void main(String[] args) throws IllegalAccessException{
        MotorVehicleFactory m = new MotorVehicleFactory();
        MotorVehicle mm = m.create("CAR");
        mm.build();
    }
}
