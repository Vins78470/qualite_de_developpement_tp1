

/**
 * Classe qui permet de décorer le voilier d'un foil.
 * Cette classe étend ArmementSupplementaire.
 *
 * @see ArmementSupplementaire
 */
public class ArmementFoil extends ArmementSupplementaire {

    /**
     * Atout spécifique de l'armement.
     */
    String atout = "foil";

    /**
     * Voilier à décorer.
     */
    Voilier voilier;

    /**
     * Constructeur pour initialiser le voilier avec un foil.
     *
     * @param voilier le voilier à équiper du foil
     */
    public ArmementFoil(Voilier voilier) {

        /**
         * On reprend les attributs de la classe mère.
         */
        super(voilier);

        /**
         * Voilier à décorer.
         */
        this.voilier = voilier;
    }

    /**
     * Retourne la représentation textuelle de l'armement foil.
     *
     * @return description du voilier équipé du foil
     */
    public String toString() {
        return voilier.toString() + " est équipé " + atout;
    }
}
