package main;

import model.Candidato;
import model.Eleitor;
import model.Voto;

public class Main {
    public static void main(String[] args) {

        // Criando objetos
        Candidato c = new Candidato(1, "João", "A");
        Eleitor e = new Eleitor("user1", "123");
        Voto v = new Voto("user1", 1);

        // Testando dados
        System.out.println("Candidato: " + c.getNome());
        System.out.println("Eleitor: " + e.getLogin());
        System.out.println("Voto para candidato ID: " + v.getCandidatoId());
    }
}