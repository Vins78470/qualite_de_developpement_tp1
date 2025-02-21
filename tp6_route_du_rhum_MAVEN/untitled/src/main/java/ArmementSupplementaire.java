/**
 * Classe abstraite représentant un armement supplémentaire pour un voilier.
 * Cette classe est destinée à être étendue par des classes spécifiques d'armement.
 *
 * @see Voilier
 */
public abstract class ArmementSupplementaire extends Voilier {

    /**
     * Le voilier décoré par l'armement supplémentaire.
     */
    protected Voilier voilierDecore;

    /**
     * Constructeur pour initialiser le voilier avec l'armement supplémentaire.
     *
     * @param voilier le voilier à décorer
     */
    public ArmementSupplementaire(Voilier voilier) {
        super();
        this.voilierDecore = voilier;
    }

    /**
     * Retourne la route à suivre du voilier.
     *
     * @return la route à suivre du voilier
     */
    @Override
    public String getSuivreRoute() {
        return voilierDecore.getSuivreRoute();
    }

    /**
     * Définit la route à suivre pour le voilier.
     *
     * @param sr la route à suivre
     */
    @Override
    public void setSuivreRoute(SuivreRoute sr) {
        voilierDecore.suivreRoute = sr;
    }

    /**
     * Applique la route à suivre pour le voilier.
     */
    @Override
    public void appliquerSuivreRoute() {
        voilierDecore.appliquerSuivreRoute();
    }

    /**
     * Retourne la représentation textuelle de l'armement supplémentaire.
     *
     * @return description du voilier décoré
     */
    @Override
    public String toString() {
        return voilierDecore.toString();
    }
}
