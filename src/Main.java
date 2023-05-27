import animais.Cachorro;
import animais.Gato;
import animais.Passaro;

public class Main {
    public static void main(String[] args) {


        Cachorro cachorro1 = new Cachorro("Rex", "marrom", 25, 5.5, 5, "nada");
        Gato gato1 = new Gato("Felix", "Preto", 4.5);
        Passaro passaro1 = new Passaro("Frajola", "Azul", 0.5);

        cachorro1.soar();
        gato1.soar();
        passaro1.soar();


    }

}
