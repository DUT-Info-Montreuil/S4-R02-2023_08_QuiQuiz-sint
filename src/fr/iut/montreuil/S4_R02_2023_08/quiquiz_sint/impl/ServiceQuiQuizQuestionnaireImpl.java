package fr.iut.montreuil.S4_R02_2023_08.quiquiz_sint.impl;

import fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.entities.dto.StatsQuestionnaireDTO;
import fr.iut.montreuil.S4_R02_2023_08.quiquiz_sint.entities.StatsQuestionnaireSintDTO;
import fr.iut.montreuil.S4_R02_2023_08.quiquiz_sint.modeles.IServicesQuiQuizzQuestionnaire;

public class ServiceQuiQuizQuestionnaireImpl implements IServicesQuiQuizzQuestionnaire {

	private StatsQuestionnaireSintDTO sintDTO;
	private StatsQuestionnaireDTO statsQuestionnaireDTO;
	private QuestionnaireDTO questionnaireDTO;
	

	public ServiceQuiQuizQuestionnaireImpl(StatsQuestionnaireSintDTO statsQuestionnaireDTO) {
		this.sintDTO = statsQuestionnaireDTO;
	}
	
	public ServiceQuiQuizQuestionnaireImpl(StatsQuestionnaireSintDTO sintDTO,
			StatsQuestionnaireDTO statsQuestionnaireDTO, QuestionnaireDTO questionnaireDTO) {
		super();
		this.sintDTO = sintDTO;
		this.statsQuestionnaireDTO = statsQuestionnaireDTO;
		this.questionnaireDTO = questionnaireDTO;
	}
	
	@Override
	public StatsQuestionnaireSintDTO recupererLesStats() {
		int nbBonneReponse = 0;
		for(int i=0; i<statsQuestionnaireDTO.getStatsQuestions().size();i++) {
			if(statsQuestionnaireDTO.getStatsQuestions().get(i).getNbBonnesReponses()>nbBonneReponse) {
				nbBonneReponse = statsQuestionnaireDTO.getStatsQuestions().get(i).getNbBonnesReponses();
				this.sintDTO.setNbQuestionMeilleurTauxReussiteJouees(statsQuestionnaireDTO.getStatsQuestions().get(i).getNbBonnesReponses());
				this.sintDTO.setIdQuestionMeilleurTauxReussite(statsQuestionnaireDTO.getStatsQuestions().get(i).getIdQuestion());
				this.sintDTO.setLibelleMeilleurQuestion(questionnaireDTO.getQuestions().get(i).getLibelleQuestion());
			}
		}
		int nbPireReponse = statsQuestionnaireDTO.getStatsQuestions().get(0).getNbBonnesReponses();
		this.sintDTO.setLibellePireQuestion(questionnaireDTO.getQuestions().get(0).getLibelleQuestion());

		for(int i=0; i<statsQuestionnaireDTO.getStatsQuestions().size();i++) {
			if(statsQuestionnaireDTO.getStatsQuestions().get(i).getNbBonnesReponses()<nbPireReponse) {
				nbPireReponse = statsQuestionnaireDTO.getStatsQuestions().get(i).getNbBonnesReponses();
				this.sintDTO.setNbQuestionPireTauxReussiteJouees(statsQuestionnaireDTO.getStatsQuestions().get(i).getNbBonnesReponses());
				this.sintDTO.setIdQuestionPireTauxReussite(statsQuestionnaireDTO.getStatsQuestions().get(i).getIdQuestion());
				this.sintDTO.setLibellePireQuestion(questionnaireDTO.getQuestions().get(i).getLibelleQuestion());
			}
		}
		return this.sintDTO;
	}
	

	public StatsQuestionnaireSintDTO getSintDTO() {
		return sintDTO;
	}
	
	public void setSintDTO(StatsQuestionnaireSintDTO sintDTO) {
		this.sintDTO = sintDTO;

	}

}
