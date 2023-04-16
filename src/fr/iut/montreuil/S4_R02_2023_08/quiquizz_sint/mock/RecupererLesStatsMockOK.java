package fr.iut.montreuil.S4_R02_2023_08.quiquizz_sint.mock;

import fr.iut.montreuil.S4_R02_2023_08.quiquiz_sint.entities.StatsQuestionnaireSintDTO;
import fr.iut.montreuil.S4_R02_2023_08.quiquiz_sint.modeles.IServicesQuiQuizzQuestionnaire;

public class RecupererLesStatsMockOK implements IServicesQuiQuizzQuestionnaire{

	@Override
	public StatsQuestionnaireSintDTO recupererLesStats() {
		return new StatsQuestionnaireSintDTO(1,4,8,1,2,"Qui est le meilleur joueur de csgo ?","Qui est le meilleur joueur de valorant ?",15);
	}

}
