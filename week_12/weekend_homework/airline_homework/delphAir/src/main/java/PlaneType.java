public enum PlaneType {

    BOEING747(4, 160),
    BOEING767(6, 240),
    BOEING787(8, 320);

    private final int capacity;
    private final double totalWeight;

    PlaneType(int capacity, int totalWeight){
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getTotalWeight() {
        return totalWeight;
    }
}
