package animais;

public class Animal {
    protected String nome;
    protected String cor;
    protected int altura;
    protected double peso;
    protected String estadoDeEspirito;

    //CONSTRUTORES


    public Animal(String nome, String cor, double peso) {
        this.nome = nome;
        this.cor = cor;
        this.peso = peso;
    }

    protected void comer() {
    }

    protected void dormir() {
    }

    //CRI CRI É UM SOM DEFAULT
    public void soar() {
        System.out.println("CRI CRI");
    }

}
