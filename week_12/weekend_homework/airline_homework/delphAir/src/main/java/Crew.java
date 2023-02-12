public abstract class Crew {

    private String name;
    private RankType rankType;

    public Crew(String name, RankType rankType){
        this.name = name;
        this.rankType = rankType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRank(){
        return rankType.getRank();
    }
}
