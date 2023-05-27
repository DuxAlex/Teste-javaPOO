package animais;

public class Gato {

    static int numeroDeGatos;
    private String nome;
    private String Cor;
    private int altura;
    private double peso;
    private String estadoEspirito;


    //CONSTRUTORES


    public Gato(String nome, String cor, int altura, double peso, String estadoEspirito) {
        this.nome = nome;
        Cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.estadoEspirito = estadoEspirito;

        numeroDeGatos++;
    }
    void comer(){}
    void dormir(){}
    void soar(){
        System.out.println("MIAU MIAU");
    }

}
