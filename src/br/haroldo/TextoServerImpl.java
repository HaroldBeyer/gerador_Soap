package br.haroldo;


public class TextoServerImpl implements TextoServer {

	public String criarIntrodu��o(String equipe, String tema) {
		return "Nossa equipe  "+ equipe + " gostaria de apresentar o nosso trabalho de " + tema+ " da Universidade Cat�lica do Salvador";
	}

	public String criarDesenvolvimento(String tema) {
		return "Conforme apresentado nas �ltimas pesquisas do IBGE, " + tema+ " foi um dos temas mais discutidos nas �ltimas reportagens, sendo um tema bastante importante para o desenvolvimento de sofware devido a sua aplicabilidade em diversas �reas da Tecnologia da Informa��o, sendo assim imprescind�vel a discuss�o e inser��o do mesmo no ambiente acad�mico.";
	}

	public String criarConclus�o(String tema) {
		return "Sendo assim, " + tema +  "� algo muito importante para a forma��o acad�mica e � algo que � sempre necess�rio se ter nas institui��es de ensino superior";
	}

}
