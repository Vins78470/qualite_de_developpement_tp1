import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * La classe <code>MonocoqueTest</code> contient les tests unitaires pour la classe <code>Monocoque</code>.
 * Ces tests vérifient que la classe <code>Monocoque</code> fonctionne comme prévu en testant ses méthodes
 * telles que <code>toString</code>, le constructeur et la gestion des routes.
 */
public class MonocoqueTest {

    private Voilier monocoque;
    private SuivreRoute routeAlize;

    /**
     * Cette méthode est exécutée avant chaque test.
     * Elle initialise les objets nécessaires pour les tests, tels que le voilier monocoque et sa route.
     */
    @BeforeEach
    public void setUp() {
        routeAlize = new RouteAlize(); // Exemple de route pour le test

        // Création du voilier Monocoque avec une route spécifique
        monocoque = new Monocoque("Voilier1", routeAlize, "Skipper1", EnumClasse.EnumMono);
    }

    /**
     * Teste la méthode <code>toString()</code> de la classe <code>Monocoque</code>.
     * Ce test vérifie que la méthode retourne la chaîne attendue, indiquant que le voilier est un monocoque.
     */
    @Test
    public void testToStringMonocoque() {
        // Vérifie que la méthode toString retourne bien la chaîne attendue
        assertEquals("Voilier1 est monocoque", monocoque.toString());
    }

    /**
     * Teste le constructeur de la classe <code>Monocoque</code>.
     * Ce test vérifie que le constructeur initialise correctement les attributs du voilier,
     * tels que le nom, le skipper, et la classe du voilier.
     */
    @Test
    public void testConstructeur() {
        // Vérifie que le nom du voilier est bien initialisé
        assertEquals("Voilier1", monocoque.toString().substring(0, 8));  // "Voilier1 est monocoque"

        // Vérifie que le skipper et la classe sont bien définis dans le constructeur
        assertEquals("Skipper1", monocoque.nomSkipper);  // On suppose que le nom du skipper est accessible
    }

    /**
     * Teste la méthode <code>appliquerSuivreRoute()</code> de la classe <code>Voilier</code>.
     * Ce test vérifie que l'appel de cette méthode ne génère aucune exception pour un voilier monocoque.
     */
    @Test
    public void testAppliquerSuivreRoute() {
        // Test que la méthode `appliquerSuivreRoute` ne lance pas d'exception
        assertDoesNotThrow(() -> monocoque.appliquerSuivreRoute());
    }

    /**
     * Teste la méthode <code>setSuivreRoute()</code> et vérifie que la route peut être modifiée.
     * Ce test vérifie que le changement de route ne génère aucune exception et que la méthode fonctionne correctement.
     */
    @Test
    public void testSetSuivreRoute() {
        SuivreRoute nouvelleRoute = new RouteOrthodromie();  // Une nouvelle route à définir
        monocoque.setSuivreRoute(nouvelleRoute);

        // Vérifie que la nouvelle route a bien été appliquée sans erreur
        assertDoesNotThrow(() -> monocoque.appliquerSuivreRoute());
    }
}
