package fr.iut.montreuil.S4_R02_2023_08.quiquiz_sint.impl;

import fr.iut.montreuil.S4_R02_2023_08.quiquiz_sint.entities.dto.StatsSintDTO;
import fr.iut.montreuil.S4_R02_2023_08.quiquiz_sint.modeles.IServicesQuiQuizJoueur;
import fr.iut.montreuil.S4_RO2_2023_08.joueur_sme.entities.dto.JoueurDTO;
import fr.iut.montreuil.S4_RO2_2023_08.joueur_sme.entities.dto.StatsDTO;
import fr.iut.montreuil.S4_RO2_2023_08.joueur_sme.impl.ServiceJoueurImpl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServiceQuiQuizJoueurImpl implements IServicesQuiQuizJoueur {
    @Override
    public Map<String, StatsSintDTO> recupStatsJoueurs() {
        ServiceJoueurImpl serv = new ServiceJoueurImpl();

        Map<String, StatsSintDTO> map = new HashMap<String, StatsSintDTO>();

        List<JoueurDTO> list = serv.listerJoueurs();

        for(JoueurDTO j : list) {
            int nbParties = 0;
            int nbQuestions = 0;
            int nbBonnesRéponses = 0;
            int tempsTotal = 0;
            for(StatsDTO s : j.getStatsParties()) {
                nbParties++;
                nbQuestions += s.getNbQuestions();
                nbBonnesRéponses += s.getNbBonnesReponses();
                tempsTotal += s.getTemps();
            }

            int[] moyennes = calculeMoyenneNbReponsesEtTemps(nbParties, nbBonnesRéponses, tempsTotal);
            StatsSintDTO stats = new StatsSintDTO(nbParties, nbQuestions, nbBonnesRéponses, tempsTotal, moyennes[0], moyennes[1]);
            map.put(j.getPseudo(), stats);
        }
        return map;
    }

    private int[] calculeMoyenneNbReponsesEtTemps(int nbPartiesJouees, int nbBonnesReponsesTot, int tempsTot) {
        int nbBonnesReponsesMoy =  nbBonnesReponsesTot/nbPartiesJouees;
        int tempsMoy = tempsTot/nbPartiesJouees;

        int[] tabMoy = new int[2];

        tabMoy[0] = nbBonnesReponsesMoy;
        tabMoy[1] = tempsMoy;

        return tabMoy;
    }
}
