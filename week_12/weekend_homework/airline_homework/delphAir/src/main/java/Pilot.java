public class Pilot extends Crew {

    private String license;

    public Pilot(String name, RankType rankType, String license){
        super(name, rankType);
        this.license = license;
    }

    public String getLicense() {
        return license;
    }

    public String fly(){
        return "All passengers, prepare for take-off!";
    }
}
