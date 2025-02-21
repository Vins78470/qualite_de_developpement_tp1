/**
 * L'interface <code>SuivreRoute</code> définit un contrat pour les classes qui
 * implémentent la fonctionnalité de suivre une route. Les classes qui implémentent
 * cette interface doivent fournir une implémentation de la méthode <code>suivreRoute</code>,
 * qui décrit la manière dont la route est suivie.
 */
public interface SuivreRoute {

    /**
     * Méthode pour suivre une route.
     * Cette méthode sera implémentée par les classes qui fournissent une logique spécifique
     * pour suivre une route, par exemple, la route des alizés, la route orthodromique, etc.
     */
    void suivreRoute();
}
