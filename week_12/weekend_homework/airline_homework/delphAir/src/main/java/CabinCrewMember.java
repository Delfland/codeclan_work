public class CabinCrewMember extends Crew{

    public CabinCrewMember(String name, RankType rankType){
        super(name, rankType);
    }

    public String relayMessage(){
        return "Please listen to the safety instructions";
    }
}
