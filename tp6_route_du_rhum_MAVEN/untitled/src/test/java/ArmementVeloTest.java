import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * La classe <code>ArmementVeloTest</code> contient les tests unitaires pour la classe <code>ArmementVelo</code>.
 * Elle permet de vérifier la bonne création de l'armement et la méthode <code>toString</code>.
 */
public class ArmementVeloTest {

    private Voilier voilier;
    private ArmementVelo armementVelo;

    /**
     * Initialisation des objets avant chaque test.
     * Cette méthode est exécutée avant chaque méthode de test pour initialiser les objets nécessaires aux tests.
     */
    @BeforeEach
    public void setUp() {
        // Création d'un voilier pour les tests (un exemple générique, vous pouvez ajuster en fonction de votre modèle)
        voilier = new Monocoque("VoilierTest", new RouteAlize(), "SkipperTest", EnumClasse.EnumMono);

        // Création de l'armement vélo
        armementVelo = new ArmementVelo(voilier);
    }

    /**
     * Teste la création de l'armement vélo pour un voilier.
     * Ce test vérifie que l'armement vélo est bien associé au voilier et que l'atout "vélo" est bien ajouté.
     */
    @Test
    public void testArmementVeloCreation() {
        // Vérifie que l'armement vélo est bien créé
        assertNotNull(armementVelo);

        // Vérifie que l'atout est bien "vélo"
        assertEquals("vélo", armementVelo.atout);

        // Vérifie que le voilier est bien associé à l'armement
        assertNotNull(armementVelo.voilier);
    }

    /**
     * Teste la méthode <code>toString</code> pour l'armement vélo.
     * Ce test vérifie que la méthode retourne la chaîne de caractères correcte, incluant le nom du voilier et l'atout.
     */
    @Test
    public void testToString() {
        // Vérifie que la méthode toString renvoie le bon message
        assertEquals("VoilierTest est monocoque est équipé vélo", armementVelo.toString());
    }
}
