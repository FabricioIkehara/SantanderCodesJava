package Animais;

public class Cachorro {

    public String nome;
    public String cor;
    public int altura;
    public Double peso;
    public int tamanhoDoRabo;

    public String estadoDeEspirito;

    public void comer() {
    }

    public void latir() {
        System.out.println("Au Au");
    }

    public String pegar() {
        return "bolinha";

    }

    public String interagir(String acao) {
        if (acao.equals("carinho")) {
            this.estadoDeEspirito = "Feliz";
        } else if (acao.equals("vai dormir!")){
            this.estadoDeEspirito = "Bravo";
        } else{
            this.estadoDeEspirito = "neutro";
        }
        return estadoDeEspirito;
    }
}








