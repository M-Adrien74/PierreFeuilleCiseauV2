package fr.adrien.pierrefeuilleciseauv2;

public class Jeu {
    int scoreJoueur = 0;
    int scorePc = 0;

    public int getScoreJoueur() {
        return scoreJoueur;
    }

    public void setScoreJoueur(int scoreJoueur) {
        this.scoreJoueur = scoreJoueur;
    }

    public int getScorePc() {
        return scorePc;
    }

    public void setScorePc(int scorePc) {
        this.scorePc = scorePc;
    }

    // Methode pour savoir qui a gagné.
    public void compare(Choix joueur, Choix ordi) {

        if (joueur.equals(Choix.CISEAU) && ordi.equals(Choix.CISEAU)) {
            System.out.println("EGALITE");
        }
        if (joueur.equals(Choix.CISEAU) && ordi.equals(Choix.FEUILLE)) {
            scoreJoueur++;
            System.out.println("Le joueur gagne ");
        }
        if (joueur.equals(Choix.CISEAU) && ordi.equals(Choix.PIERRE)) {
            scorePc++;
            System.out.println("L'ordinateur gagne ");
        }
        if (joueur.equals(Choix.FEUILLE) && ordi.equals(Choix.PIERRE)) {
            scoreJoueur++;
            System.out.println("Le joueur gagne ");
        }
        if (joueur.equals(Choix.FEUILLE) && ordi.equals(Choix.CISEAU)) {
            scorePc++;
            System.out.println("L'ordinateur gagne ");
        }
        if (joueur.equals(Choix.FEUILLE) && ordi.equals(Choix.FEUILLE)) {
            System.out.println("EGALITE");
        }
        if (joueur.equals(Choix.PIERRE) && ordi.equals(Choix.PIERRE)) {
            System.out.println("EGALITE");
        }
        if (joueur.equals(Choix.PIERRE) && ordi.equals(Choix.CISEAU)) {
            scoreJoueur++;
            System.out.println("Le joueur gagne ");
        }
        if (joueur.equals(Choix.PIERRE) && ordi.equals(Choix.FEUILLE)) {
            scorePc++;
            System.out.println("L'ordinateur gagne ");
        }

        System.out.println("Le score du joueur est de " + scoreJoueur + " et le score de l'IA est de " + scorePc);
    }

    // Methode pour generer un random entre 1 et 3

    public Choix choixDuPc() {

        Choix choixIa = Choix.FEUILLE;
        int min = 1;
        int max = 3;

        int choixPc = (int) (Math.random() * (max - min + 1) + min);

        if (choixPc == 1) {
            choixIa = Choix.CISEAU;
        }
        if (choixPc == 2) {
            choixIa = Choix.FEUILLE;
        }
        if (choixPc == 3) {
            choixIa = Choix.PIERRE;
        }
        return choixIa;
    }
}