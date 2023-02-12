public enum RankType {

    CAPTAIN("Captain",50000),
    FIRST_OFFICER("First Officer", 45000),
    PURSER("Purser", 40000),
    FLIGHT_ATTENDANT("Flight Attendant",35000);

    private final String rank;
    private final double salary;

    RankType(String rank, double salary){
        this.rank = rank;
        this.salary = salary;
    }

    public double getSalary(){
        return salary;
    }

    public String getRank(){
        return rank;
    }

}
