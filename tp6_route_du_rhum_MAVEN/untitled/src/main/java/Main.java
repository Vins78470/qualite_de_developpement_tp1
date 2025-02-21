public class Main {
    public static void main(String[] args) {

        InscriptionMulticoque inscriptionMulticoque = new InscriptionMulticoque();
        InscriptionMonocoque inscriptionMonocoque = new InscriptionMonocoque();


        Voilier v1 = inscriptionMonocoque.factoryMethod("Le VNS1", new RouteAlize(), "Nathan", EnumClasse.EnumMono);
        Voilier v2 = inscriptionMulticoque.factoryMethod("Le VNS2", new RouteOrthodromie(), "Sanjey", EnumClasse.EnumMulti);


        inscriptionMonocoque.enregistrement(v1);
        inscriptionMulticoque.enregistrement(v2);

        System.out.println(InscriptionMonocoque.voilierList);

    }
}
