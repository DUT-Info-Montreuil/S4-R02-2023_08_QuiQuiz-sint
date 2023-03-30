package fr.iut.montreuil.S4_R02_2023_08.quiquiz_sint.impl;

import fr.iut.montreuil.S4_R02_2023_08.quiquiz_sint.modeles.IServicesQuiQuizJoueur;
import fr.iut.montreuil.S4_RO2_2023_08.joueur_sme.entities.dto.JoueurDTO;
import fr.iut.montreuil.S4_RO2_2023_08.joueur_sme.impl.ServiceJoueurImpl;

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
            List<Integer>
        }
        return map;
    }
}
