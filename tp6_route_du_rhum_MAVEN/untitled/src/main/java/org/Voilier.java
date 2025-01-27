public abstract class Voilier {
    String nom;
    SuivreRoute suivreRoute;
    String nomSkipper;
    EnumClasse classe;

    public Voilier(String name, SuivreRoute suivreRoute,String ns,EnumClasse cl)
    {
        nomSkipper = ns;
        classe = cl;
        nom = name;
    }

    public Voilier(){};

    public void setSuivreRoute(SuivreRoute sr){
        this.suivreRoute = sr;
    }
    public String getSuivreRoute(){
        return "route suivi : "+this.suivreRoute;
    }
    public void appliquerSuivreRoute(){
        suivreRoute.suivreRoute();
    }
    public String toString() {
        return nom;
    }


}
