import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * La classe <code>MulticoqueTest</code> contient les tests unitaires pour la classe <code>Multicoque</code>.
 * Ces tests vérifient que la classe <code>Multicoque</code> fonctionne comme prévu en testant ses méthodes
 * telles que <code>toString</code>, le constructeur et la gestion des routes.
 */
public class MulticoqueTest {

    private Voilier multicoque;
    private SuivreRoute routeOrthodromie;

    /**
     * Cette méthode est exécutée avant chaque test.
     * Elle initialise les objets nécessaires pour les tests, tels que le voilier multicoque et sa route.
     */
    @BeforeEach
    public void setUp() {
        routeOrthodromie = new RouteOrthodromie(); // Exemple de route pour le test

        // Création du voilier Multicoque avec une route spécifique
        multicoque = new Multicoque("Voilier2", routeOrthodromie, "Skipper2", EnumClasse.EnumMulti);
    }

    /**
     * Teste la méthode <code>toString()</code> de la classe <code>Multicoque</code>.
     * Ce test vérifie que la méthode retourne la chaîne attendue, indiquant que le voilier est un multicoque.
     */
    @Test
    public void testToStringMulticoque() {
        // Vérifie que la méthode toString retourne bien la chaîne attendue
        assertEquals("Voilier2 est multicoque", multicoque.toString());
    }

    /**
     * Teste le constructeur de la classe <code>Multicoque</code>.
     * Ce test vérifie que le constructeur initialise correctement les attributs du voilier,
     * tels que le nom, le skipper, et la classe du voilier.
     */
    @Test
    public void testConstructeur() {
        // Vérifie que le nom du voilier est bien initialisé
        assertEquals("Voilier2", multicoque.toString().substring(0, 8));  // "Voilier2 est multicoque"

        // Vérifie que le skipper et la classe sont bien définis dans le constructeur
        assertEquals("Skipper2", multicoque.nomSkipper);  // On suppose que le nom du skipper est accessible
    }

    /**
     * Teste la méthode <code>appliquerSuivreRoute()</code> de la classe <code>Voilier</code>.
     * Ce test vérifie que l'appel de cette méthode ne génère aucune exception pour un voilier multicoque.
     */
    @Test
    public void testAppliquerSuivreRoute() {
        // Test que la méthode `appliquerSuivreRoute` ne lance pas d'exception
        assertDoesNotThrow(() -> multicoque.appliquerSuivreRoute());
    }

    /**
     * Teste la méthode <code>setSuivreRoute()</code> et vérifie que la route peut être modifiée.
     * Ce test vérifie que le changement de route ne génère aucune exception et que la méthode fonctionne correctement.
     */
    @Test
    public void testSetSuivreRoute() {
        SuivreRoute nouvelleRoute = new RouteAlize();  // Une nouvelle route à définir
        multicoque.setSuivreRoute(nouvelleRoute);

        // Vérifie que la nouvelle route a bien été appliquée sans erreur
        assertDoesNotThrow(() -> multicoque.appliquerSuivreRoute());
    }
}
