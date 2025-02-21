/**
 * La classe <code>Main</code> est le point d'entrée de l'application.
 * Elle est responsable de l'initialisation des inscriptions des voiliers,
 * de la création d'instances de voiliers de type Monocoque et Multicoque,
 * et de l'enregistrement de ces voiliers dans les listes correspondantes.
 */
public class Main {

    /**
     * Méthode principale qui crée des instances de <code>InscriptionMonocoque</code> et <code>InscriptionMulticoque</code>,
     * crée des voiliers en fonction des classes spécifiées, les enregistre dans la liste des voiliers,
     * puis affiche la liste des voiliers inscrits pour <code>InscriptionMonocoque</code>.
     *
     * @param args Les arguments de ligne de commande (non utilisés dans cette application).
     */
    public static void main(String[] args) {

        // Création des objets d'inscription pour monocoque et multicoque
        InscriptionMulticoque inscriptionMulticoque = new InscriptionMulticoque();
        InscriptionMonocoque inscriptionMonocoque = new InscriptionMonocoque();

        // Création de voiliers de type Monocoque et Multicoque
        Voilier v1 = inscriptionMonocoque.factoryMethod("Le VNS1", new RouteAlize(), "Nathan", EnumClasse.EnumMono);
        Voilier v2 = inscriptionMulticoque.factoryMethod("Le VNS2", new RouteOrthodromie(), "Sanjey", EnumClasse.EnumMulti);

        // Enregistrement des voiliers dans leurs listes respectives
        inscriptionMonocoque.enregistrement(v1);
        inscriptionMulticoque.enregistrement(v2);

        // Affichage de la liste des voiliers inscrits pour InscriptionMonocoque
        System.out.println(InscriptionMonocoque.voilierList);
    }
}
