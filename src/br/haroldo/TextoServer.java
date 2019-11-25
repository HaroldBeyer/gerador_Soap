package br.haroldo;



public interface TextoServer {
	String criarIntrodução(String equipe, String tema);
	String criarDesenvolvimento(String tema);
	String criarConclusão(String tema);
}
