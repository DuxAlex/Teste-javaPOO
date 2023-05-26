package animais;

public class Cachorro {

    private String nome;
    private String cor;
    private int altura;
    private double peso;
    private int tamanhoDoRabo;

    private String estadoDeEspirito;

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

//    public void setEstadoDeEspirito(String estadoDeEspirito) {
//        this.estadoDeEspirito = estadoDeEspirito;
//    } caso eu nao queria que ninguem set o estadoDeEspirito é so exlcuir este set

    //    public void setNome(String nome){
//        if(nome.equals("lily")){
//            this.nome = null;
//        }else {
//        this.nome = nome;}
//
//    } exemplo caso eu nao queira que o nome setado seja lily.



    public void comer() {
    }


    public void latir() {
        System.out.println("AU AU");
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


//        if (acao.equals("carinho")) {
//            this.estadoDeEspirito = "feliz";
//        } else if(acao.equals("vai dormir!")) {
//            this.estadoDeEspirito = "raiva";
//        } else if(acao.equals("pisar na pata")) {
//            this.estadoDeEspirito = "triste";
//        }else {
//            this.estadoDeEspirito = "neutro";
//        }
//        return estadoDeEspirito;
        return this.estadoDeEspirito;
    }
}