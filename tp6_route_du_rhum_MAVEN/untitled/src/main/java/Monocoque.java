/**
 * La classe <code>Monocoque</code> représente un type spécifique de voilier, dérivé de la classe <code>Voilier</code>.
 * Un voilier de type monocoque est caractérisé par un design à coque unique.
 */
public class Monocoque extends Voilier {

    /**
     * Constructeur de la classe <code>Monocoque</code>.
     * Ce constructeur permet de créer une instance de voilier monocoque en initialisant les informations
     * telles que le nom, le suivi de la route, le nom du skipper et la classe du voilier.
     *
     * @param nom Le nom du voilier monocoque.
     * @param suivreRoute L'objet représentant le suivi de la route du voilier.
     * @param nomSkipper Le nom du skipper du voilier.
     * @param classe La classe du voilier (Monocoque ou Multicoque).
     */
    public Monocoque(String nom, SuivreRoute suivreRoute, String nomSkipper, EnumClasse classe) {
        super(nom, suivreRoute, nomSkipper, classe);
    }

    /**
     * Retourne une représentation sous forme de chaîne de caractères du voilier monocoque.
     * Cette méthode remplace la méthode <code>toString</code> de la classe parent <code>Voilier</code>
     * pour afficher que le voilier est de type monocoque.
     *
     * @return Une chaîne représentant le voilier, indiquant qu'il est un monocoque.
     */
    @Override
    public String toString() {
        return nom + " est monocoque";
    }
}
