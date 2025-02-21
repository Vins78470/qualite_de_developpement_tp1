

/**
 * Classe représentant un armement supplémentaire pour un voilier, avec un atout vélo.
 * Cette classe hérite de la classe {@link ArmementSupplementaire} et permet d'ajouter un armement spécifique pour le voilier.
 */
public class ArmementVelo extends ArmementSupplementaire {

    /** Le voilier auquel l'armement est attaché. */
    Voilier voilier;

    /** L'atout associé à cet armement, ici "vélo". */
    String atout = "vélo";

    /**
     * Constructeur de la classe ArmementVelo.
     *
     * @param voilier Le voilier auquel cet armement est attribué.
     */
    public ArmementVelo(Voilier voilier){
        super(voilier);
    }

    /**
     * Retourne une représentation sous forme de chaîne de caractères de l'armement.
     *
     * @return Une chaîne de caractères indiquant que le voilier est équipé d'un vélo.
     */
    @Override
    public String toString(){
        return voilier.toString() + " est équipé " + atout;
    }
}
