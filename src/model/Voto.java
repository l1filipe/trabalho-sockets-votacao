package model;

public class Voto {
    private String eleitorLogin;
    private int candidatoId;

    public Voto(String eleitorLogin, int candidatoId) {
        this.eleitorLogin = eleitorLogin;
        this.candidatoId = candidatoId;
    }

    public String getEleitorLogin() {
        return eleitorLogin;
    }

    public int getCandidatoId() {
        return candidatoId;
    }
}
