/**
 * La classe <code>Voilier</code> représente un voilier, avec des informations telles que son nom,
 * son skipper, sa classe et la route qu'il suit. La classe permet de définir et d'appliquer une route
 * spécifique grâce à l'interface <code>SuivreRoute</code>.
 */
public abstract class Voilier {

    /**
     * Le nom du voilier.
     */
    String nom;

    /**
     * L'objet qui représente la route à suivre par le voilier.
     */
    SuivreRoute suivreRoute;

    /**
     * Le nom du skipper du voilier.
     */
    String nomSkipper;

    /**
     * La classe du voilier (Monocoque, Multicoque, etc.).
     */
    EnumClasse classe;

    /**
     * Constructeur de la classe <code>Voilier</code>.
     * Ce constructeur initialise les informations de base d'un voilier, telles que son nom, le suivi de la route,
     * le nom du skipper et la classe du voilier.
     *
     * @param name Le nom du voilier.
     * @param suivreRoute L'objet représentant la route à suivre.
     * @param ns Le nom du skipper du voilier.
     * @param cl La classe du voilier (par exemple, Monocoque, Multicoque).
     */
    public Voilier(String name, SuivreRoute suivreRoute, String ns, EnumClasse cl) {
        this.nomSkipper = ns;
        this.classe = cl;
        this.nom = name;
        this.suivreRoute = suivreRoute; // Initialisation de suivreRoute
    }

    /**
     * Constructeur par défaut de la classe <code>Voilier</code>.
     * Ce constructeur crée une instance de <code>Voilier</code> sans initialiser les propriétés.
     */
    public Voilier() {}

    /**
     * Définit la route à suivre pour ce voilier.
     * Cette méthode permet de modifier l'objet <code>SuivreRoute</code> associé au voilier.
     *
     * @param sr L'objet représentant la route à suivre.
     */
    public void setSuivreRoute(SuivreRoute sr) {
        this.suivreRoute = sr;
    }

    /**
     * Retourne une chaîne de caractères représentant la route suivie par le voilier.
     * Si la route n'est pas définie, retourne un message indiquant qu'aucune route n'est sélectionnée.
     *
     * @return Une chaîne décrivant la route suivie par le voilier.
     */
    public String getSuivreRoute() {
        return (this.suivreRoute != null) ? "Route suivie : " + this.suivreRoute : "Aucune route définie";
    }

    /**
     * Applique la route définie pour ce voilier en invoquant la méthode <code>suivreRoute</code>
     * de l'interface <code>SuivreRoute</code>.
     * Avant d'appliquer la route, la méthode vérifie que la route n'est pas nulle.
     */
    public void appliquerSuivreRoute() {
        if (suivreRoute != null) {
            suivreRoute.suivreRoute();
        } else {
            System.out.println("Aucune route définie pour ce voilier.");
        }
    }

    /**
     * Retourne une chaîne de caractères représentant le nom du voilier.
     * Cette méthode est une version personnalisée de la méthode <code>toString</code>.
     *
     * @return Le nom du voilier.
     */
    @Override
    public String toString() {
        return nom;
    }
}
