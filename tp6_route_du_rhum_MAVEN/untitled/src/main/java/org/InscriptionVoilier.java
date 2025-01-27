import java.util.ArrayList;
import java.util.List;

public abstract class InscriptionVoilier {


    static List<Voilier> voilierList = new ArrayList<Voilier>();


    public abstract Voilier factoryMethod(String nom, SuivreRoute suivreRoute, String nomSkipper, EnumClasse classe);


    void enregistrement(Voilier voilier) {

        voilierList.add(voilier);
    }

    @Override
    public String toString() {
        return voilierList.toString();
    }
}
