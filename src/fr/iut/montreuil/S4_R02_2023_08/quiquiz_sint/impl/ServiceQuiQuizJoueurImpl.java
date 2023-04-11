package fr.iut.montreuil.S4_R02_2023_08.quiquiz_sint.impl;

import fr.iut.montreuil.S4_R02_2023_08.quiquiz_sint.modeles.IServicesQuiQuizJoueur;
import fr.iut.montreuil.S4_RO2_2023_08.joueur_sme.entities.dto.JoueurDTO;
import fr.iut.montreuil.S4_RO2_2023_08.joueur_sme.entities.dto.StatsDTO;
import fr.iut.montreuil.S4_RO2_2023_08.joueur_sme.impl.ServiceJoueurImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ServiceQuiQuizJoueurImpl implements IServicesQuiQuizJoueur {
    @Override
    public Map<String, List<Integer>> recupStatsJoueurs() {
        ServiceJoueurImpl serv = new ServiceJoueurImpl();

        Map<String, List<Integer>> map = new HashMap<String, List<Integer>>();

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

            List<Integer> listStats = new ArrayList<Integer>();

            listStats.add(nbParties);
            listStats.add(nbQuestions);
            listStats.add(nbBonnesRéponses);
            listStats.add(tempsTotal);
             map.put(j.getPseudo(), listStats);
        }
        return map;
    }
}
