public class ArmementVelo extends ArmementSupplementaire{

    Voilier voilier;
    String atout  = "vélo";
    public ArmementVelo(Voilier voilier){
        super(voilier);
    }

    public String toString(){
        return voilier.toString()+ " est equipé " +atout;
    }
}
