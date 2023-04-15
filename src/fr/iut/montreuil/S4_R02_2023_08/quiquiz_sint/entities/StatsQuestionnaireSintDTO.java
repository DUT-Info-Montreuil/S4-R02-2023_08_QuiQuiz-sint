package fr.iut.montreuil.S4_R02_2023_08.quiquiz_sint.entities;

import fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.entities.dto.QuestionnaireDTO;
import fr.iut.montreuil.S4_R02_2023_08.prof.questionnaire_sme.entities.dto.StatsQuestionnaireDTO;

public class StatsQuestionnaireSintDTO {
	
	private int idQuestionnaire;
	private int nbQuestionMeilleurTauxReussiteJouees;
	private int nbQuestionPireTauxReussiteJouees;
	private int idQuestionMeilleurTauxReussite;
	private int idQuestionPireTauxReussite;
	private String libellePireQuestion;
	private String libelleMeilleurQuestion;
	private int nbQuestionnaireJouees;
	

	public StatsQuestionnaireSintDTO(StatsQuestionnaireDTO statsQuestionnaireDTO,QuestionnaireDTO questionnaireDTO) {
		super();
		this.idQuestionnaire = statsQuestionnaireDTO.getIdQuestionnaire();
		this.nbQuestionnaireJouees = statsQuestionnaireDTO.getNbPartiesJouees();
		int nbBonneReponse = 0;
		for(int i=0; i<statsQuestionnaireDTO.getStatsQuestions().size();i++) {
			if(statsQuestionnaireDTO.getStatsQuestions().get(i).getNbBonnesReponses()>nbBonneReponse) {
				nbBonneReponse = statsQuestionnaireDTO.getStatsQuestions().get(i).getNbBonnesReponses();
				this.nbQuestionMeilleurTauxReussiteJouees = statsQuestionnaireDTO.getStatsQuestions().get(i).getNbBonnesReponses();
				this.idQuestionMeilleurTauxReussite = statsQuestionnaireDTO.getStatsQuestions().get(i).getIdQuestion();
				this.libelleMeilleurQuestion = questionnaireDTO.getQuestions().get(i).getLibelleQuestion();
			}
		}
		int nbPireReponse = statsQuestionnaireDTO.getStatsQuestions().get(0).getNbBonnesReponses();
		this.libellePireQuestion = questionnaireDTO.getQuestions().get(0).getLibelleQuestion();

		for(int i=0; i<statsQuestionnaireDTO.getStatsQuestions().size();i++) {
			if(statsQuestionnaireDTO.getStatsQuestions().get(i).getNbBonnesReponses()<nbPireReponse) {
				nbPireReponse = statsQuestionnaireDTO.getStatsQuestions().get(i).getNbBonnesReponses();
				this.nbQuestionPireTauxReussiteJouees = statsQuestionnaireDTO.getStatsQuestions().get(i).getNbBonnesReponses();
				this.idQuestionPireTauxReussite = statsQuestionnaireDTO.getStatsQuestions().get(i).getIdQuestion();
				this.libellePireQuestion = questionnaireDTO.getQuestions().get(i).getLibelleQuestion();
			}
		}
		
	}
	
	public StatsQuestionnaireSintDTO(int idQuestionnaire, int nbQuestionMeilleurTauxReussiteJouees,
			int nbQuestionPireTauxReussiteJouees, int idQuestionMeilleurTauxReussite, int idQuestionPireTauxReussite,
			String libellePireQuestion, String libelleMeilleurQuestion, int nbQuestionnaireJouees) {
		super();
		this.idQuestionnaire = idQuestionnaire;
		this.nbQuestionMeilleurTauxReussiteJouees = nbQuestionMeilleurTauxReussiteJouees;
		this.nbQuestionPireTauxReussiteJouees = nbQuestionPireTauxReussiteJouees;
		this.idQuestionMeilleurTauxReussite = idQuestionMeilleurTauxReussite;
		this.idQuestionPireTauxReussite = idQuestionPireTauxReussite;
		this.libellePireQuestion = libellePireQuestion;
		this.libelleMeilleurQuestion = libelleMeilleurQuestion;
		this.nbQuestionnaireJouees = nbQuestionnaireJouees;
	}

	@Override
	public String toString() {
		return "StatsQuestionnaireSintDTO [idQuestionnaire=" + idQuestionnaire
				+ ", nbQuestionMeilleurTauxReussiteJouees=" + nbQuestionMeilleurTauxReussiteJouees
				+ ", nbQuestionPireTauxReussiteJouees=" + nbQuestionPireTauxReussiteJouees
				+ ", idQuestionMeilleurTauxReussite=" + idQuestionMeilleurTauxReussite + ", idQuestionPireTauxReussite="
				+ idQuestionPireTauxReussite + ", libellePireQuestion=" + libellePireQuestion
				+ ", libelleMeilleurQuestion=" + libelleMeilleurQuestion + ", nbQuestionnaireJouees="
				+ nbQuestionnaireJouees + "]";
	}

	public int getIdQuestionnaire() {
		return idQuestionnaire;
	}

	public void setIdQuestionnaire(int idQuestionnaire) {
		this.idQuestionnaire = idQuestionnaire;
	}

	public int getNbQuestionMeilleurTauxReussiteJouees() {
		return nbQuestionMeilleurTauxReussiteJouees;
	}

	public void setNbQuestionMeilleurTauxReussiteJouees(int nbQuestionMeilleurTauxReussiteJouees) {
		this.nbQuestionMeilleurTauxReussiteJouees = nbQuestionMeilleurTauxReussiteJouees;
	}

	public int getNbQuestionPireTauxReussiteJouees() {
		return nbQuestionPireTauxReussiteJouees;
	}

	public void setNbQuestionPireTauxReussiteJouees(int nbQuestionPireTauxReussiteJouees) {
		this.nbQuestionPireTauxReussiteJouees = nbQuestionPireTauxReussiteJouees;
	}
	
	public int getIdQuestionMeilleurTauxReussite() {
		return idQuestionMeilleurTauxReussite;
	}

	public void setIdQuestionMeilleurTauxReussite(int idQuestionMeilleurTauxReussite) {
		this.idQuestionMeilleurTauxReussite = idQuestionMeilleurTauxReussite;
	}

	public int getIdQuestionPireTauxReussite() {
		return idQuestionPireTauxReussite;
	}

	public void setIdQuestionPireTauxReussite(int idQuestionPireTauxReussite) {
		this.idQuestionPireTauxReussite = idQuestionPireTauxReussite;
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
