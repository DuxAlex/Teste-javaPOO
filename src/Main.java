import animais.Cachorro;

public class Main {

    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();
        cachorro1.nome = "puppy";
        cachorro1.cor = "marrom";
        cachorro1.altura = 25;
        cachorro1.peso = 5.5;
        cachorro1.tamanhoDoRabo = 5;

        cachorro1.latir();
        System.out.println("O cachorro pegou uma " + cachorro1.pegar());
        System.out.println("O cachorro esta " + cachorro1.interagir("carinho"));
        System.out.println("O cachorro esta " + cachorro1.interagir("nada"));
        System.out.println("O cachorro esta " + cachorro1.interagir("vai dormir!"));
        System.out.println("O cachorro esta " + cachorro1.interagir("pisar na patinha"));


    }

}