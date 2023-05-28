package animais;

//adicionando como classe abstrata nao podemos criar objetos apartir dela e apenas extender-los
public abstract class Animal {
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


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }

    public void setEstadoDeEspirito(String estadoDeEspirito) {
        this.estadoDeEspirito = estadoDeEspirito;
    }

    protected void comer() {
    }

    protected void dormir() {
    }

    //CRI CRI É UM SOM DEFAULT
    /*apagamos o sout devido que ao colocar a classe animal como abstract
     não precisariamos mais do default pois seriamos obrigado a setar a saida do soar(metodo)
     conforme a classe (objeto)*/
    public abstract void soar();
    //ou seja todo objeto tem o metodo soar
    //System.out.println("CRI CRI");


}
