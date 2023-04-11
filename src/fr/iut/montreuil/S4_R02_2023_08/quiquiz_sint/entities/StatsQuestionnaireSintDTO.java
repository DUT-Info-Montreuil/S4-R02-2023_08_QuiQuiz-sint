package fr.iut.montreuil.S4_R02_2023_08.quiquiz_sint.entities;

import fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.entities.dto.StatsQuestionnaireDTO;

public class StatsQuestionnaireSintDTO {
	
	private StatsQuestionnaireDTO statsQuestionnaireDTO;
	private QuestionnaireDTO questionnaireDTO;
	private int nbQuestionMeilleurTauxReussite;
	private int nbQuestionPireTauxReussite;
	private String libellePireQuestion;
	private String libelleMeilleurQuestion;
	

	public StatsQuestionnaireSintDTO(StatsQuestionnaireDTO statsQuestionnaireDTO,QuestionnaireDTO questionnaireDTO) {
		super();
		this.statsQuestionnaireDTO = statsQuestionnaireDTO;
	}
	public StatsQuestionnaireDTO getStatsQuestionnaireDTO() {
		return statsQuestionnaireDTO;
	}
	public void setStatsQuestionnaireDTO(StatsQuestionnaireDTO statsQuestionnaireDTO) {
		this.statsQuestionnaireDTO = statsQuestionnaireDTO;
	}
	public int getNbFoisQuestionnaireJoue() {
		return this.statsQuestionnaireDTO.getNbPartiesJouees();
	}
	public void setNbFoisQuestionnaireJoue(int nbFoisQuestionnaireJoue) {
		this.statsQuestionnaireDTO.setNbPartiesJouees(nbFoisQuestionnaireJoue);
	}
	public QuestionnaireDTO getQuestionnaireDTO() {
		return questionnaireDTO;
	}
	public void setQuestionnaireDTO(QuestionnaireDTO questionnaireDTO) {
		this.questionnaireDTO = questionnaireDTO;
	}
	public int getNbQuestionMeilleurTauxReussite() {
		return nbQuestionMeilleurTauxReussite;
	}
	public void setNbQuestionMeilleurTauxReussite(int nbQuestionMeilleurTauxReussite) {
		this.nbQuestionMeilleurTauxReussite = nbQuestionMeilleurTauxReussite;
	}
	public int getNbQuestionPireTauxReussite() {
		return nbQuestionPireTauxReussite;
	}
	public void setNbQuestionPireTauxReussite(int nbQuestionPireTauxReussite) {
		this.nbQuestionPireTauxReussite = nbQuestionPireTauxReussite;
	}
	public String getLibellePireQuestion() {
		return libellePireQuestion;
	}
	public void setLibellePireQuestion(String libellePireQuestion) {
		this.libellePireQuestion = libellePireQuestion;
	}
	public String getLibelleMeilleurQuestion() {
		return libelleMeilleurQuestion;
	}
	public void setLibelleMeilleurQuestion(String libelleMeilleurQuestion) {
		this.libelleMeilleurQuestion = libelleMeilleurQuestion;
	}


}
