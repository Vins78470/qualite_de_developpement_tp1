/**
 * La classe <code>RouteOrthodromie</code> implémente l'interface <code>SuivreRoute</code>.
 * Elle représente une route spécifique, celle de l'orthodromie, et contient une méthode pour la suivre.
 * La méthode <code>suivreRoute</code> affiche un message indiquant que l'on suit cette route.
 */
public class RouteOrthodromie implements SuivreRoute {

    /**
     * Implémentation de la méthode <code>suivreRoute</code> de l'interface <code>SuivreRoute</code>.
     * Cette méthode affiche un message indiquant que le voilier suit la route orthodromique.
     */
    @Override
    public void suivreRoute() {
        System.out.println("Vous suivez la route orthodromie");
    }
}
