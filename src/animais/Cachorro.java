package animais;

public class Cachorro {

    public String nome;
    public String cor;
    public int altura;
    public double peso;
    public int tamanhoDoRabo;

    public String estadoDeEspirito;

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