package animais;

// colocando heranca. agora passaro é uma classe filha de animais
public class Passaro extends Animal {

    static int numeroDePassaros;

    public Passaro(String nome, String cor, double peso) {
        super(nome, cor, peso);

    }

    //o Override sobrepoe a saida do metodo pai com a saida o seu propri metodo herdado pelo pai
    @Override
    public void soar() {
        System.out.println("PIU PIU");
    }
}
