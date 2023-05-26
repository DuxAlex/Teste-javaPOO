import animais.Cachorro;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro();
        Cachorro cachorro2 = new Cachorro("puppy","marrom", 25, 5.5,5, "nada");

        System.out.println(cachorro2.getNome());
        System.out.println(cachorro2.getPeso());
        System.out.println("");
        cachorro1.latir();
        System.out.println("O cachorro pegou uma " + cachorro1.pegar());
        System.out.println("O cachorro esta " + cachorro1.interagir("carinho"));
        System.out.println("O cachorro esta " + cachorro1.interagir("nada"));
        System.out.println("O cachorro esta " + cachorro1.interagir("vai dormir!"));
        System.out.println("O cachorro esta " + cachorro1.interagir("pisar na patinha"));


    }

}
