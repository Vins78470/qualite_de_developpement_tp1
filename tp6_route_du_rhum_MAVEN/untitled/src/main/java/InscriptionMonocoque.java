/**
 * La classe <code>InscriptionMonocoque</code> permet d'enregistrer et de créer des instances de voiliers.
 * Elle hérite de la classe <code>InscriptionVoilier</code> et implémente des méthodes spécifiques pour
 * la création de voiliers de type Monocoque ou Multicoque, selon la classe spécifiée.
 */
public class InscriptionMonocoque extends InscriptionVoilier {

    /**
     * Crée une instance de voilier en fonction de la classe spécifiée.
     * Si la classe est un monocoque, un objet de type <code>Monocoque</code> est créé, sinon si
     * la classe est un multicoque, un objet de type <code>Multicoque</code> est créé.
     *
     * @param nom Le nom du voilier à créer.
     * @param suivreRoute L'objet représentant le suivi de la route du voilier.
     * @param nomSkipper Le nom du skipper du voilier.
     * @param enumClasse La classe du voilier, qui peut être soit <code>EnumClasse.EnumMono</code>,
     *                   soit <code>EnumClasse.EnumMulti</code>.
     * @return Un objet <code>Voilier</code> correspondant à la classe spécifiée.
     * @throws IllegalArgumentException Si la classe spécifiée n'est ni un monocoque ni un multicoque.
     */
    @Override
    public Voilier factoryMethod(String nom, SuivreRoute suivreRoute, String nomSkipper, EnumClasse enumClasse) {

        if (enumClasse == EnumClasse.EnumMono) {
            return new Monocoque(nom, suivreRoute, nomSkipper, enumClasse);
        } else if (enumClasse == EnumClasse.EnumMulti) {
            return new Multicoque(nom, suivreRoute, nomSkipper, enumClasse);
        } else {
            throw new IllegalArgumentException("Classe inconnue");
        }
    }

    /**
     * Enregistre un voilier dans la liste des voiliers inscrits.
     *
     * @param voilier Le voilier à enregistrer.
     */
    @Override
    public void enregistrement(Voilier voilier) {
        voilierList.add(voilier);
    }
}
