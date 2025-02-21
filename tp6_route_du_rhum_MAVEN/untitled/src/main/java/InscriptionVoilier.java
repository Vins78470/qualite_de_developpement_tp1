import java.util.ArrayList;
import java.util.List;

/**
 * La classe abstraite <code>InscriptionVoilier</code> définit la structure de base pour l'inscription de voiliers.
 * Elle contient une liste statique de voiliers inscrits et un méthode abstraite pour la création de voiliers.
 * Les classes concrètes doivent implémenter la méthode <code>factoryMethod</code> pour créer des instances spécifiques de voiliers.
 */
public abstract class InscriptionVoilier {

    /**
     * Liste statique contenant tous les voiliers inscrits.
     */
    static List<Voilier> voilierList = new ArrayList<Voilier>();

    /**
     * Méthode abstraite pour créer un voilier en fonction des paramètres spécifiés.
     * Les classes dérivées doivent implémenter cette méthode pour retourner une instance spécifique de voilier.
     *
     * @param nom Le nom du voilier à créer.
     * @param suivreRoute L'objet représentant le suivi de la route du voilier.
     * @param nomSkipper Le nom du skipper du voilier.
     * @param classe La classe du voilier (Monocoque ou Multicoque).
     * @return Une instance de la classe de voilier spécifique (Monocoque ou Multicoque).
     */
    public abstract Voilier factoryMethod(String nom, SuivreRoute suivreRoute, String nomSkipper, EnumClasse classe);

    /**
     * Enregistre un voilier dans la liste des voiliers inscrits.
     *
     * @param voilier Le voilier à enregistrer.
     */
    void enregistrement(Voilier voilier) {
        voilierList.add(voilier);
    }

    /**
     * Retourne une représentation sous forme de chaîne de caractères de la liste des voiliers inscrits.
     *
     * @return Une chaîne représentant tous les voiliers inscrits.
     */
    @Override
    public String toString() {
        return voilierList.toString();
    }
}
