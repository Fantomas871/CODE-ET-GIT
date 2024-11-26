public class FactureManager {

    // Calcul le total d'une facture
    public double calculerFacture(String typeProduit, int quantite, double prixUnitaire) {
        double total = quantite * prixUnitaire;

        // reduction selon la catégorie

        total -=total * reductionTypeProduit(typeProduit);

        // reduction selon le total
        return reductionTotal(total);
    }

    public double reductionTypeProduit (String typeProduit){
        if (typeProduit.equals("Alimentaire")) {
            return 0.05; // Réduction de 5%
        } else if (typeProduit.equals("Electronique")) {
            return 0.1; // Réduction de 10%
        } else if (typeProduit.equals("Luxe")) {
            return 0.15; // Réduction de 15%
        }
        return 1.0;
    }

    public double reductionTotal (double total){
        if (total > 1000) {
            return total - (total * 0.05); // Réduction supplémentaire de 5% pour les gros montants
        }
        return total;
    }

}
