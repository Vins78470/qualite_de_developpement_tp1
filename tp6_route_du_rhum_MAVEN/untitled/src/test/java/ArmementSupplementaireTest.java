import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * La classe <code>ArmementSupplementaireTest</code> contient les tests unitaires pour la classe <code>ArmementSupplementaire</code>.
 * Ces tests vérifient la bonne intégration de l'armement avec le voilier décoré et les méthodes héritées.
 */
public class ArmementSupplementaireTest {

    private Voilier voilier;
    private ArmementSupplementaire armementSupplementaire;

    /**
     * Initialisation des objets avant chaque test.
     * Cette méthode est exécutée avant chaque méthode de test pour initialiser les objets nécessaires aux tests.
     */
    @BeforeEach
    public void setUp() {
        // Création d'un voilier pour les tests (exemple générique)
        voilier = new Monocoque("VoilierTest", new RouteAlize(), "SkipperTest", EnumClasse.EnumMono);

        // Création d'un armement supplémentaire (exemple avec un vélo)
        armementSupplementaire = new ArmementVelo(voilier);
    }

    /**
     * Teste la création d'un armement supplémentaire pour le voilier.
     * Ce test vérifie que l'armement est bien associé au voilier et que l'atout "vélo" est bien configuré.
     */
    @Test
    public void testArmementSupplementaireCreation() {
        // Vérifie que l'armement supplémentaire est bien créé et associé au voilier
        assertNotNull(armementSupplementaire);

        // Vérifie que le voilier décoré est bien le bon
        assertEquals("VoilierTest est monocoque", armementSupplementaire.toString());
    }

    /**
     * Teste la méthode <code>getSuivreRoute</code> pour l'armement supplémentaire.
     * Ce test vérifie que la route du voilier décoré est correctement retournée par l'armement.
     */
    @Test
    public void testGetSuivreRoute() {
        // Vérifie que la méthode retourne la route du voilier
        assertEquals(voilier.getSuivreRoute(), armementSupplementaire.getSuivreRoute());
    }

    /**
     * Teste la méthode <code>setSuivreRoute</code> pour l'armement supplémentaire.
     * Ce test vérifie que la route peut être correctement définie pour le voilier décoré.
     */
    @Test
    public void testSetSuivreRoute() {
        SuivreRoute nouvelleRoute = new RouteOrthodromie();

        // Modifie la route du voilier décoré via l'armement
        armementSupplementaire.setSuivreRoute(nouvelleRoute);

        // Vérifie que la route a bien été modifiée
        assertEquals(nouvelleRoute, voilier.getSuivreRoute());
    }

    /**
     * Teste la méthode <code>toString</code> pour l'armement supplémentaire.
     * Ce test vérifie que la méthode retourne la bonne chaîne de caractères, incluant le voilier décoré.
     */
    @Test
    public void testToString() {
        // Vérifie que la méthode toString renvoie bien la description du voilier décoré
        assertEquals("VoilierTest est monocoque est équipé vélo", armementSupplementaire.toString());
    }
}
