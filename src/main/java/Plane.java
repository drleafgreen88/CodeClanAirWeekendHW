public class Plane {

    private PlaneType planeType;

    public Plane (PlaneType planeType) {
        this.planeType = planeType;
    }


    public PlaneType getType() {
        return this.planeType;
    }

    public int getCapacity(){
        return planeType.getCapacity();
    }

    public long getWeight() {
        return planeType.getWeight();
    }
}
