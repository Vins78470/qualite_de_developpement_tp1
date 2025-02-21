public class InscriptionMulticoque extends InscriptionVoilier {

    @Override
    public Voilier factoryMethod(String nom, SuivreRoute suivreRoute, String nomSkipper, EnumClasse enumClasse) {

        if (enumClasse == EnumClasse.EnumMono) {

            return new Monocoque(nom, suivreRoute, nomSkipper,enumClasse);
        } else
            if (enumClasse == EnumClasse.EnumMulti) {

            return new Multicoque(nom, suivreRoute, nomSkipper, enumClasse);
        } else {
            throw new IllegalArgumentException("Classe inconnue");
        }
    }
    @Override
    public void enregistrement(Voilier voilier) {
        voilierList.add(voilier);
    }
}
