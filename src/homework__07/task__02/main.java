package homework__07.task__02;

public class main {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Passengers ground[] = new Passengers[]{
                new Bus(), new Motorcycle(), new Car(),
                new Boat(), new Liner(),
                new Plane(), new Helicopter()
        };
        for (Passengers a : ground) {
            if (a instanceof GroundVehicle) {
                ((GroundVehicle) a).drive();
                System.out.println("");
            } else if (a instanceof WaterVehicle) {
                ((WaterVehicle) a).isSailing();
                System.out.println("");
            } else if (a instanceof FlyingVehicle) {
                ((FlyingVehicle) a).fly();
                ((FlyingVehicle) a).land();
                System.out.println("");

            }
        }

    }

}
