package main;

import models.Banca;
import models.Prova;
import models.Question;

public class test {

	public static void main(String[] args) {
		//Criando bancas
		Banca bancaCespe = new Banca("CESPE");
		//Criando provas
		Prova provaTeste = new Prova(2020, bancaCespe, "BNB", "Analista");
		
		//Criando questões
		Question questao = new Question(provaTeste, "Acerca de conceitos e disciplinas da engenharia de software, julgue o item que se segue.", "No modelo de desenvolvimento de software em cascata, a abordagem é orientada ao risco e as tarefas são organizadas nos seguintes ciclos: determinar objetivos, identificar e resolver riscos, desenvolver e testar, e planejar a próxima iteração.", null, null, "Gabarito", null, null);
		questao.imprimeQuestão();
		System.out.println(Question.getId());
		
		Question questao2 = new Question(provaTeste, "Acerca de conceitos e disciplinas da engenharia de software, julgue o item que se segue.", "No modelo de desenvolvimento de software em cascata, a abordagem é orientada ao risco e as tarefas são organizadas nos seguintes ciclos: determinar objetivos, identificar e resolver riscos, desenvolver e testar, e planejar a próxima iteração.", null, null, "Gabarito", null, null);
		questao2.imprimeQuestão();
		System.out.println(Question.getId());
		System.out.println(questao.getIdQuestao());
	}
	
}
