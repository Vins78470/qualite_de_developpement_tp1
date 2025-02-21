import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * La classe <code>InscriptionMonocoqueTest</code> contient les tests unitaires pour la classe <code>InscriptionMonocoque</code>.
 * Elle permet de vérifier la bonne création et l'enregistrement des voiliers de type Monocoque via la méthode <code>factoryMethod</code>.
 */
public class InscriptionMonocoqueTest {

    private InscriptionMonocoque inscription;
    private SuivreRoute routeAlize;
    private SuivreRoute routeOrthodromie;

    /**
     * Initialisation des objets avant chaque test.
     * Cette méthode est exécutée avant chaque méthode de test.
     */
    @BeforeEach
    public void setUp() {
        // Initialisation des objets avant chaque test
        inscription = new InscriptionMonocoque();
        routeAlize = new RouteAlize();
        routeOrthodromie = new RouteOrthodromie();
    }

    /**
     * Teste la méthode <code>factoryMethod</code> pour créer un voilier de type Monocoque.
     * Ce test vérifie que la méthode crée un objet Monocoque avec les bonnes propriétés et que la méthode <code>toString</code>
     * retourne le bon message indiquant que c'est un monocoque.
     */
    @Test
    public void testCreateMonocoque() {
        Voilier voilier = inscription.factoryMethod("Monocoque1", routeAlize, "Skipper1", EnumClasse.EnumMono);

        // Vérifie que le voilier est bien créé
        assertNotNull(voilier);

        // Vérifie que l'objet créé est bien une instance de Monocoque
        assertTrue(voilier instanceof Monocoque);

        // Vérifie que la méthode toString retourne le bon message
        assertEquals("Monocoque1 est monocoque", voilier.toString());
    }

    /**
     * Teste la méthode <code>factoryMethod</code> pour créer un voilier de type Multicoque.
     * Ce test vérifie que la méthode crée un objet Multicoque avec les bonnes propriétés et que la méthode <code>toString</code>
     * retourne le bon message indiquant que c'est un multicoque.
     */
    @Test
    public void testCreateMulticoque() {
        Voilier voilier = inscription.factoryMethod("Multicoque1", routeOrthodromie, "Skipper2", EnumClasse.EnumMulti);

        // Vérifie que le voilier est bien créé
        assertNotNull(voilier);

        // Vérifie que l'objet créé est bien une instance de Multicoque
        assertTrue(voilier instanceof Multicoque);

        // Vérifie que la méthode toString retourne le bon message
        assertEquals("Multicoque1 est multicoque", voilier.toString());
    }

    /**
     * Teste l'enregistrement d'un voilier dans la liste des voiliers inscrits via la méthode <code>enregistrement</code>.
     * Ce test vérifie que la méthode ajoute correctement un voilier à la liste <code>voilierList</code>.
     */
    @Test
    public void testEnregistrement() {
        Voilier voilier = inscription.factoryMethod("Monocoque1", routeAlize, "Skipper1", EnumClasse.EnumMono);

        // Enregistre le voilier
        inscription.enregistrement(voilier);

        // Vérifie que la liste des voiliers inscrits contient bien le voilier ajouté
        assertTrue(InscriptionVoilier.voilierList.contains(voilier));

        // Vérifie que la taille de la liste a bien augmenté de 1
        assertEquals(1, InscriptionVoilier.voilierList.size());
    }


}
