import Lojas.Petshop;
import animais.Animal;
import animais.Cachorro;
import animais.Gato;
import animais.Passaro;

public class Main {
    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("rex", "Branco", 10, 5, 1, "Neutro");
        Gato gato1 = new Gato("Felix", "Preto", 4.5);
        Passaro passaro1 = new Passaro("Frajola", "Azul", 0.5);

        //transformamos a classe Animal em abtract
        //para nao criarmos um objeto animal animal sem antes definir uma classe valida
        //
        // Animal gato4 = new Animal("Felix", "Preto", 4.5);

        cachorro1.soar();
        passaro1.soar();
        gato1.soar();


    }

}
