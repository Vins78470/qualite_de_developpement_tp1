import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * La classe <code>ArmementFoilTest</code> contient les tests unitaires pour la classe <code>ArmementFoil</code>.
 * Ces tests vérifient la bonne intégration de l'armement foil avec le voilier décoré et les méthodes héritées.
 */
public class ArmementFoilTest {

    private Voilier voilier;
    private ArmementFoil armementFoil;

    /**
     * Initialisation des objets avant chaque test.
     * Cette méthode est exécutée avant chaque méthode de test pour initialiser les objets nécessaires aux tests.
     */
    @BeforeEach
    public void setUp() {
        // Création d'un voilier pour les tests (exemple générique)
        voilier = new Monocoque("VoilierTest", new RouteAlize(), "SkipperTest", EnumClasse.EnumMono);

        // Création d'un armement supplémentaire (avec un foil)
        armementFoil = new ArmementFoil(voilier);
    }

    /**
     * Teste la création d'un armement supplémentaire pour le voilier avec un foil.
     * Ce test vérifie que l'armement est bien associé au voilier et que l'atout "foil" est bien configuré.
     */
    @Test
    public void testArmementFoilCreation() {
        // Vérifie que l'armement est bien créé et associé au voilier
        assertNotNull(armementFoil);

        // Vérifie que le voilier décoré est bien le bon
        assertEquals("VoilierTest est monocoque est équipé foil", armementFoil.toString());
    }

    /**
     * Teste la méthode <code>getSuivreRoute</code> pour l'armement supplémentaire avec foil.
     * Ce test vérifie que la route du voilier décoré est correctement retournée par l'armement.
     */
    @Test
    public void testGetSuivreRoute() {
        // Vérifie que la méthode retourne la route du voilier
        assertEquals(voilier.getSuivreRoute(), armementFoil.getSuivreRoute());
    }




    /**
     * Teste la méthode <code>toString</code> pour l'armement foil.
     * Ce test vérifie que la méthode retourne la bonne chaîne de caractères, incluant le voilier décoré avec foil.
     */
    @Test
    public void testToString() {
        // Vérifie que la méthode toString renvoie bien la description du voilier décoré avec le foil
        assertEquals("VoilierTest est monocoque est équipé foil", armementFoil.toString());
    }
}
