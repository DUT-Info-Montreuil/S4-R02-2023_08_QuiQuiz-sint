package fr.iut.montreuil.S4_R02_2023_08.quiquiz_sint.entities.dto;

public class StatsSintDTO {

    private int nbPartiesJouees, nbQuestions, nbBonnesReponses, tempsTotal, nbBonnesReponsesMoy, tempsMoy;

    public StatsSintDTO(int nbPartiesJouees, int nbQuestions, int nbBonnesReponses, int tempsTotal, int nbBonnesReponsesMoy, int tempsMoy) {
        this.nbPartiesJouees = nbPartiesJouees;
        this.nbQuestions = nbQuestions;
        this.nbBonnesReponses = nbBonnesReponses;
        this.tempsTotal = tempsTotal;
        this.nbBonnesReponsesMoy = nbBonnesReponsesMoy;
        this.tempsMoy = tempsMoy;
    }

    public int getNbPartiesJouees() {
        return nbPartiesJouees;
    }

    public void setNbPartiesJouees(int nbPartiesJouees) {
        this.nbPartiesJouees = nbPartiesJouees;
    }

    public int getNbQuestions() {
        return nbQuestions;
    }

    public void setNbQuestions(int nbQuestions) {
        this.nbQuestions = nbQuestions;
    }

    public int getNbBonnesReponses() {
        return nbBonnesReponses;
    }

    public void setNbBonnesReponses(int nbBonnesReponses) {
        this.nbBonnesReponses = nbBonnesReponses;
    }

    public int getTempsTotal() {
        return tempsTotal;
    }

    public void setTempsTotal(int tempsTotal) {
        this.tempsTotal = tempsTotal;
    }

    public int getNbBonnesReponsesMoy() {
        return nbBonnesReponsesMoy;
    }

    public void setNbBonnesReponsesMoy(int nbBonnesReponsesMoy) {
        this.nbBonnesReponsesMoy = nbBonnesReponsesMoy;
    }

    public int getTempsMoy() {
        return tempsMoy;
    }

    public void setTempsMoy(int tempsMoy) {
        this.tempsMoy = tempsMoy;
    }
}
