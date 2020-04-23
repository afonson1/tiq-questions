package models;

public class Question {
	private static int id;
	private int idQuestao;
	private Prova prova;
	private String intro;
	private String enunciado;
	private String opcaoA;
	private String opcaoB;
	private String opcaoC;
	private String opcaoD;
	private String opcaoE;

	//CONSTRUTORES
	//Questão Cespe
	public Question (Prova prova, String intro, String enunciado, String opcaoA, String opcaoB, String opcaoC, String opcaoD, String opcaoE){
		Question.setId(Question.getId() + 1);
		this.setIdQuestao(Question.getId());
		this.prova = prova;
		this.setIntro(intro);
		this.enunciado = enunciado;
	}
	
	public Question (Prova prova){
		this.prova = prova;
	}
	
	//GETTERS E SETTERS
	public static int getId() {
		return id;
	}
	
	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}
	
	public String getEnunciado() {
		return enunciado;
	}

	public void setEnunciado(String enunciado) {
		this.enunciado = enunciado;
	}
	
	public static void setId(int id) {
		Question.id = id;
	}

	public int getIdQuestao() {
		return idQuestao;
	}

	public void setIdQuestao(int idQuestao) {
		this.idQuestao = idQuestao;
	}
	
	//MÉTODOS
	public void imprimeQuestão(){
		prova.imprimeProva();
		System.out.println(getIntro());
		System.out.println(getEnunciado());
	}
}
