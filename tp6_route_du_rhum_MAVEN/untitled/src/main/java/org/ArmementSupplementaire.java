public abstract class ArmementSupplementaire extends Voilier {
    protected Voilier voilierDecore;

    public ArmementSupplementaire(Voilier voilier) {
        super();
        this.voilierDecore = voilier;
    }

    @Override
    public String getSuivreRoute() {
        return voilierDecore.getSuivreRoute();
    }
    @Override
    public void setSuivreRoute(SuivreRoute sr){
        voilierDecore.suivreRoute = sr;
    }

    @Override
    public void appliquerSuivreRoute() {
        voilierDecore.appliquerSuivreRoute();
    }

    @Override
    public String toString() {
        return voilierDecore.toString();
    }
}
