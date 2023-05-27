package animais;

//classe filha da classe animal
public class Cachorro extends Animal {
    //atributos

    static int numeroDeCachorros;
    private int tamanhoDoRabo;

    //CONSTRUTORES


    //construtor adicionado pelo generate intellij
    public Cachorro(String nome, String cor, int altura, double peso, int tamanhoDoRabo, String estadoDeEspirito) {
        super(nome, cor, peso);
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoDoRabo = tamanhoDoRabo;
        this.estadoDeEspirito = estadoDeEspirito;

        numeroDeCachorros++;
    }


    //***********************

    //construtores ficam entre atributos e os metodos

    //metodos


    public static int getNumeroDeCachorros() {
        return numeroDeCachorros;
    }

    public static void setNumeroDeCachorros(int numeroDeCachorros) {
        Cachorro.numeroDeCachorros = numeroDeCachorros;
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

    public int getTamanhoDoRabo() {
        return tamanhoDoRabo;
    }

    public void setTamanhoDoRabo(int tamanhoDoRabo) {
        this.tamanhoDoRabo = tamanhoDoRabo;
    }

    public String getEstadoDeEspirito() {
        return estadoDeEspirito;
    }


    public String pegar() {
        return "bolinha";
    }

    public String interagir(String acao) {

        switch (acao) {

            case "carinho":
                this.estadoDeEspirito = "feliz";
                break;
            case "vai dormir!":
                this.estadoDeEspirito = "raiva";
                break;
            case "pisar na patinha":
                this.estadoDeEspirito = "triste";
                break;
            default:
                this.estadoDeEspirito = "neutro";
                break;
        }
        return this.estadoDeEspirito;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                '}';
    }

    //o Override sobrepoe a saida do metodo pai com a saida o seu propri metodo herdado pelo pai
    @Override
    public void soar() {
        System.out.println("AU AU!");
    }
}