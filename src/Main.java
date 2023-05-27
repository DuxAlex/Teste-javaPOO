import animais.Cachorro;

public class Main {
    public static void main(String[] args) {


        Cachorro cachorro1 = new Cachorro("Rex","marrom", 25, 5.5,5, "nada");
        System.out.println(cachorro1.getNumeroDeCachorros());

        Cachorro cachorro2 = new Cachorro("puppy","marrom", 25, 5.5,5, "nada");
        System.out.println(cachorro2.getNumeroDeCachorros());
        System.out.println(cachorro1.getNumeroDeCachorros());




    }

}
