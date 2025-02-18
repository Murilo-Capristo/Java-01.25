package br.com.fiap.api_rest.dto;

public class ClienteRequest {
    private String nome;
    private int idade;

    public ClienteRequest(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public ClienteRequest() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
