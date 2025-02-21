import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Classe de tests unitaires pour la classe <code>Voilier</code>.
 * Ce fichier contient des tests pour vérifier le bon comportement de la classe Voilier
 * en utilisant l'interface <code>SuivreRoute</code> et les classes dérivées comme <code>Monocoque</code> et <code>Multicoque</code>.
 */
public class VoilierTest {

    private Voilier monocoque;
    private Voilier multicoque;
    private SuivreRoute routeAlize;
    private SuivreRoute routeOrthodromie;

    /**
     * Méthode exécutée avant chaque test pour initialiser les objets nécessaires.
     * Cette méthode configure les objets Voilier et leurs routes respectives.
     */
    @BeforeEach
    public void setUp() {
        // Initialisation des objets de routes
        routeAlize = new RouteAlize();
        routeOrthodromie = new RouteOrthodromie();

        // Initialisation des objets Voilier
        monocoque = new Monocoque("Voilier1", routeAlize, "Skipper1", EnumClasse.EnumMono);
        multicoque = new Multicoque("Voilier2", routeOrthodromie, "Skipper2", EnumClasse.EnumMulti);
    }

    /**
     * Teste la méthode <code>appliquerSuivreRoute</code> pour vérifier qu'aucune exception n'est lancée.
     * Cette méthode applique la route définie pour le voilier.
     */
    @Test
    public void testAppliquerSuivreRoute() {
        // Test que la méthode `appliquerSuivreRoute` ne lance pas d'exception
        assertDoesNotThrow(() -> monocoque.appliquerSuivreRoute());
    }

    /**
     * Teste la méthode <code>setSuivreRoute</code> pour vérifier qu'on peut changer la route
     * et ensuite appliquer cette nouvelle route sans problème.
     */
    @Test
    public void testSetSuivreRoute() {
        // Changer la route du voilier
        monocoque.setSuivreRoute(routeOrthodromie);

        // Vérifie que l'application de la nouvelle route ne lance pas d'exception
        assertDoesNotThrow(() -> monocoque.appliquerSuivreRoute());
    }

    /**
     * Teste la méthode <code>toString</code> pour un objet de type <code>Monocoque</code>.
     * Cette méthode doit retourner le nom du voilier suivi de sa classe.
     */
    @Test
    public void testToStringMonocoque() {
        // Vérifie que la méthode toString pour un Monocoque retourne le bon format de chaîne
        assertEquals("Voilier1 est monocoque", monocoque.toString());
    }

    /**
     * Teste la méthode <code>toString</code> pour un objet de type <code>Multicoque</code>.
     * Cette méthode doit retourner le nom du voilier suivi de sa classe.
     */
    @Test
    public void testToStringMulticoque() {
        // Vérifie que la méthode toString pour un Multicoque retourne le bon format de chaîne
        assertEquals("Voilier2 est multicoque", multicoque.toString());
    }
}
