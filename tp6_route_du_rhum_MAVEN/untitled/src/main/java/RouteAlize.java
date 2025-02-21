/**
 * La classe <code>RouteAlize</code> implémente l'interface <code>SuivreRoute</code>.
 * Elle représente une route spécifique, celle des alizés, et contient une méthode pour la suivre.
 * La méthode <code>suivreRoute</code> affiche un message indiquant que l'on suit cette route.
 */
public class RouteAlize implements SuivreRoute {

    /**
     * Implémentation de la méthode <code>suivreRoute</code> de l'interface <code>SuivreRoute</code>.
     * Cette méthode affiche un message indiquant que le voilier suit la route des alizés.
     */
    @Override
    public void suivreRoute() {
        System.out.println("Vous suivez la route des alizés");
    }
}
