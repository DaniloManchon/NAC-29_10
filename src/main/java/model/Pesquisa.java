package model;

public class Pesquisa {
    int matricula;
    String estaEmpregado;
    String estaSatisfeito;

    public Pesquisa(int matricula, String estaEmpregado, String estaSatisfeito) {
        this.matricula = matricula;
        this.estaEmpregado = estaEmpregado;
        this.estaSatisfeito = estaSatisfeito;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getEstaEmpregado() {
        return estaEmpregado;
    }

    public String getEstaSatisfeito() {
        return estaSatisfeito;
    }
}
