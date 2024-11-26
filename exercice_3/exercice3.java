public class StockManager {

    // Permet de gerer le stock
    public void gererStock(String typeOperation, String produit, int quantite, int stock) {
        if (typeOperation.equals("ajout")) {
            stock=ajoutStock(produit, quantite, stock);
        }
        if (typeOperation.equals("retrait")) {
            if (stock >= quantite) {
                stock=supprimerStock(produit, quantite, stock);
            } else {
                System.out.println("Stock insuffisant pour le produit : " + produit);
            }
        }
        // Si l'action est inconnu
        System.out.println("Opération inconnue.");
    }

    public int ajoutStock(String produit, int quantite, int stock){
        stock += quantite;
        System.out.println("Produit : " + produit + ", Stock après ajout : " + stock);
        return stock;
    }

    public int supprimerStock(String produit, int quantite, int stock){
        stock -= quantite;
        System.out.println("Produit : " + produit + ", Stock après retrait : " + stock);
        return stock;
    }
}
