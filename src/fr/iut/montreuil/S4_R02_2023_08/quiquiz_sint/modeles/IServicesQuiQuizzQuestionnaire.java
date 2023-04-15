package fr.iut.montreuil.S4_R02_2023_08.quiquiz_sint.modeles;

import fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.entities.dto.StatsQuestionnaireDTO;
import fr.iut.montreuil.S4_R02_2023_08.quiquiz_sint.entities.StatsQuestionnaireSintDTO;

public interface IServicesQuiQuizzQuestionnaire {
	
	public StatsQuestionnaireSintDTO recupererLesStats();

}
