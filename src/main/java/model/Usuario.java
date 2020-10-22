package model;

public class Usuario {
    int matricula;
    String nome;
    String senha;
    String tipoDeUsuario;
    String genero;

    public Usuario(int matricula, String nome, String senha, String tipoDeUsuario, String genero) {
        this.matricula = matricula;
        this.nome = nome;
        this.senha = senha;
        this.tipoDeUsuario = tipoDeUsuario;
        this.genero = genero;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }

    public String getTipoDeUsuario() {
        return tipoDeUsuario;
    }

    public String getGenero() {
        return genero;
    }

}
