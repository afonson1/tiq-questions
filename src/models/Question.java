package models;

public class Question {
	private static int id;
	private int idQuestao;
	private String modalidade; //criar um enumerado
	private Prova prova;
	private String intro;
	private String enunciado;
	private String opcaoA, opcaoB, opcaoC, opcaoD, opcaoE;
	private char gabarito;

	//CONSTRUTORES
	public Question (Prova prova){
		this.prova = prova;
	}
	
	/*Certo ou Errado
	Questão simples, com apenas uma introdução, um enunciado e nenhuma figura.*/
	public Question (String modalidade, Prova prova, String intro, String enunciado, char gabarito){
		//Incremento no id do tipo "Questão"
		Question.setId(Question.getId() + 1);
		//Atribuição do id geral ao id da Questão
		this.setIdQuestao(Question.getId());
		this.prova = prova;
		this.setIntro(intro);
		this.enunciado = enunciado;
	}
	
	/*Múltipla Escolha
	Questão simples, com apenas uma introdução, um enunciado e nenhuma figura.*/
	public Question (Prova prova, String intro, String enunciado, String opcaoA, String opcaoB,
					String opcaoC, String opcaoD, String opcaoE, char gabarito){
		Question.setId(Question.getId() + 1);
		this.setIdQuestao(Question.getId());
		this.prova = prova;
		this.setIntro(intro);
		this.enunciado = enunciado;
		this.setOpcaoA(opcaoA);
		this.setOpcaoB(opcaoB);
		this.setOpcaoC(opcaoC);
		this.setOpcaoD(opcaoD);
		this.setOpcaoE(opcaoE);
		this.setGabarito(gabarito);
	}
	
	//GETTERS E SETTERS
	public static int getId() {
		return id;
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
	
	public String getOpcaoA() {
		return opcaoA;
	}

	public void setOpcaoA(String opcaoA) {
		this.opcaoA = opcaoA;
	}

	public String getOpcaoC() {
		return opcaoC;
	}

	public void setOpcaoC(String opcaoC) {
		this.opcaoC = opcaoC;
	}

	public String getOpcaoD() {
		return opcaoD;
	}

	public void setOpcaoD(String opcaoD) {
		this.opcaoD = opcaoD;
	}

	public String getOpcaoB() {
		return opcaoB;
	}

	public void setOpcaoB(String opcaoB) {
		this.opcaoB = opcaoB;
	}

	public String getOpcaoE() {
		return opcaoE;
	}

	public void setOpcaoE(String opcaoE) {
		this.opcaoE = opcaoE;
	}

	public char getGabarito() {
		return gabarito;
	}

	public void setGabarito(char gabarito) {
		this.gabarito = gabarito;
	}
	
	//MÉTODOS
	public void imprimeQuestão(){
		prova.imprimeProva();
		System.out.println(getIntro());
		System.out.println(getEnunciado());
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

}