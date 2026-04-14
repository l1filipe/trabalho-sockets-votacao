package model;

public class Eleitor {
    private String login;
    private String senha;

    public Eleitor(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public String getSenha() {
        return senha;
    }
}