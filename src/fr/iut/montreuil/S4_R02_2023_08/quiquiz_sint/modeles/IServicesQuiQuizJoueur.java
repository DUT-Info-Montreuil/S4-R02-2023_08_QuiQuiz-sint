package fr.iut.montreuil.S4_R02_2023_08.quiquiz_sint.modeles;

import fr.iut.montreuil.S4_R02_2023_08.quiquiz_sint.entities.dto.StatsSintDTO;

import java.util.Map;

public interface IServicesQuiQuizJoueur {

    public Map<String, StatsSintDTO> recupStatsJoueurs();
}
