import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InscriptionMulticoqueTest {

    private InscriptionMulticoque inscription;
    private SuivreRoute routeAlize;
    private SuivreRoute routeOrthodromie;

    @BeforeEach
    public void setUp() {
        // Initialisation des objets avant chaque test
        inscription = new InscriptionMulticoque();
        routeAlize = new RouteAlize();
        routeOrthodromie = new RouteOrthodromie();
    }

    // Test de la méthode factoryMethod pour créer un voilier Monocoque
    @Test
    public void testCreateMonocoque() {
        Voilier voilier = inscription.factoryMethod("Monocoque1", routeAlize, "Skipper1", EnumClasse.EnumMono);

        assertNotNull(voilier);  // Vérifie que le voilier est bien créé
        assertTrue(voilier instanceof Monocoque);  // Vérifie que l'instance est de type Monocoque
        assertEquals("Monocoque1 est monocoque", voilier.toString());  // Vérifie que toString retourne le bon message
    }

    // Test de la méthode factoryMethod pour créer un voilier Multicoque
    @Test
    public void testCreateMulticoque() {
        Voilier voilier = inscription.factoryMethod("Multicoque1", routeOrthodromie, "Skipper2", EnumClasse.EnumMulti);

        assertNotNull(voilier);  // Vérifie que le voilier est bien créé
        assertTrue(voilier instanceof Multicoque);  // Vérifie que l'instance est de type Multicoque
        assertEquals("Multicoque1 est multicoque", voilier.toString());  // Vérifie que toString retourne le bon message
    }

    // Test de la méthode enregistrement pour ajouter un voilier dans la liste
    @Test
    public void testEnregistrement() {
        Voilier voilierMonocoque = inscription.factoryMethod("Monocoque1", routeAlize, "Skipper1", EnumClasse.EnumMono);
        inscription.enregistrement(voilierMonocoque);

        assertTrue(InscriptionVoilier.voilierList.contains(voilierMonocoque));  // Vérifie que le voilier a bien été ajouté à la liste

        Voilier voilierMulticoque = inscription.factoryMethod("Multicoque1", routeOrthodromie, "Skipper2", EnumClasse.EnumMulti);
        inscription.enregistrement(voilierMulticoque);

        assertTrue(InscriptionVoilier.voilierList.contains(voilierMulticoque));  // Vérifie que le voilier multicoque est ajouté à la liste
    }


}
