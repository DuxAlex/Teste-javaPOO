package animais;

// colocou herança agora é classe filha
public class Gato extends Animal {
    static int numeroDeGatos;

    public Gato(String nome, String cor, double peso) {
        super(nome, cor, peso);
    }


    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                '}';
    }

    //o Override sobrepoe a saida do metodo pai com a saida o seu propri metodo herdado pelo pai
    @Override
    public void soar() {
        System.out.println("MIAU MIAU");
    }
}
