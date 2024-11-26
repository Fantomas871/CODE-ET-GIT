public class GestionnaireNotes {

    // Affiche note et moyennes
    public void afficherNotesEtMoyenne(String nomEtudiant, int[] notes) {
        afficherNotes(nomEtudiant, notes);
        System.out.println("Moyenne : " + calulerMoyenne(notes));
    }

    public void afficherNotes(String nomEtudiant, int[] notes){
        // Affichage des notes
        System.out.println("Notes de " + nomEtudiant + ":");
        for (int note : notes) {
            System.out.println("- " + note);
        }
    }

    public double calulerMoyenne(int[] notes) {
        // Calcul de la somme des notes
        int somme = 0;
        for (int note : notes) {
            somme += note;
        }

        return (double) somme / notes.length;

    }
}
