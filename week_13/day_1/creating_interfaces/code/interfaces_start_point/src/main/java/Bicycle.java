public class Bicycle implements IMove, IStart, IStop {
    private int distanceTravelled;

    public Bicycle() {
        this.distanceTravelled = 0;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }

    public void move(int distance) {
        this.distanceTravelled += distance;
    }

    public String start() {
        return "Coming through!";
    }

    public String stop() {
        return "Squeeze the brakes";
    }
}
