package homework__07.task__02;

public class Liner extends WaterVehicle {

    private int floors;

    public Liner() {
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }

    @Override
    public void isSailing() {
        System.out.println("Liner is sailing.");
    }
}
