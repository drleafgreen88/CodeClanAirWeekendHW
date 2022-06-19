public enum PlaneType {

    BOEING747(3, 183000),
    BOEING777(3, 200000),
    AIRBUSA330(4, 181000),
    AIRBUSA380(5, 575000);

    private final int capacity;
    private final int weight;

    PlaneType(int capacity, int weight) {
        this.capacity = capacity;
        this.weight = weight;
    }

    public int getCapacity(){
        return capacity;
    }

    public long getWeight() {
        return weight;
    }
}
