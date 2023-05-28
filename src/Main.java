import Lojas.Petshop;
import animais.Animal;
import animais.Cachorro;
import animais.Gato;
import animais.Passaro;

//ATALHOS CTRL + / OU SELECIONAR AS LINHAS E USAR CTRL + /

//EXEMPLO DE COMENTARIO EM LINHA
        /*EXEMPLO DE
        COMENTARIO
        EM
        BLOCO.
         */


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

        // double d = 5.5d; float f = 3.00f; float x = f+d; erro pois esta somando tipos diferentes
        //ento use o CASTING que é a conversão de valores float x = f + (float)d;
        // Consutar table CASTING de conversão

// VARIAVEIS DEVEM INICAR COM LETRA UNDERLINE_ OU $DOLAR. SEMPRE COM LETRA minuscula E NÃO PODE CONTER ESPAÇO
//E NAO PODE USAR PALAVRA CHAVE E DEVE SER UNICO DENTRO DAQUELE ESCOPO
// int _$teste_$ = 2; FUNCIONA
// double _____= 23.3; FUNCIONA
// String int = "teste"; NÃO FUNCIONA A PALAVRA int É RESERVADA.
// int inteiro; VALOR DEFAULT É 0 TODOS OS PRIMITIVOS NUMERICOS SÃO ASSIM COM EXCECÃO DO double e float.
//float $$; Default é 0.0 e double tambem
// boolean $87; DEFAULT É false
//char ch; DEFAULT É EQUIVALENTE A 0 MAS É VAZIO
//String teste; DEFAULT DE QUALQUER OBJETO É null


        //int a = 23456789; para deixar mais facil adicione UNDERLINES_ ONDE SERIA OS PONTOS (POR CONVENÇÃO MAS PODE POR
        //EM QQR LUGAR EXEMPLO : int a = 23_456_789;
        //MAS ASSIM TB FUNCIONA  int a = 2_3_4567_8_9;

        //PALAVRAS RESERVADAS EM JAVA
        //abstract, assert, boolean, break, byte, case, catch, char, class, const, continue, default, do, double,
        // else, enum, extends, final, finally, float, for, goto, if, implements, import, instanceof, int, interface,
        // long, native, new, package, private, protected, public, return, short, static, strictfp, super, switch,
        // synchronized, this, throw, throws, transient, try, void, volatile, while.


        //GARBAGE COLLECTOR ELE RODA A QQR MOMENTO NA APLICAÇÃO PARA LIMPAR E OLHAR TODOS OS OBJETOS QUE NÃO CONSEGUEM
        //MAIS SER REFERENCIADOS PARA JOGAR ELES NO LIXO PARA LIBERAR MEMORIA PARA CONTINUAR USANDO-A
        //POIS SEMPRE QUE SE ESTANCIA UM OBJETO GUARADA UM VALOR NA MEMORIA
        // O GARBGE COLLECTOR LIMPA O OBJETO DA MEMORIA CASO PERCEBER QUE O OBJETO NAO SIRVA MAIS PARA NADA
        //EXEMPLO QUANDO TRASNFERE A VARIAVEL DE REFERENCIA DE UM OBJETO PARA O OUTRO. EXCLUINDO O OUTRO OBJT


        //Aqui está um exemplo de como usar varargs (varargs) em Java:
        //
        //java
        //Copy code
        //public class VarargsExample {
        //    public static void main(String[] args) {
        //        printNumbers(1, 2, 3, 4, 5); // Chamada do método com vários argumentos
        //        printNumbers(10); // Chamada do método com um único argumento
        //        printNumbers(); // Chamada do método sem argumentos
        //    }
        //
        //    public static void printNumbers(int... numbers) {
        //        System.out.println("Números:");
        //        for (int number : numbers) {
        //            System.out.println(number);
        //        }
        //    }
        //}
        //Neste exemplo, temos um método chamado printNumbers, que recebe um número variável de argumentos do tipo int.
        // Esse tipo de parâmetro é indicado pelo uso do ... após o tipo.
        //
        //Dentro do método, podemos tratar os argumentos como um array normal e percorrer seus
        // elementos utilizando um loop for-each.
        //
        //Na classe VarargsExample, há três chamadas do método printNumbers com diferentes quantidades de argumentos.
        // O primeiro invoca o método passando cinco números, o segundo invoca com apenas um número e o terceiro invoca sem nenhum argumento.
        //
        //Dessa forma, o método printNumbers pode ser usado com qualquer quantidade de números, tornando o código mais
        // flexível e conveniente.

        // A SAIDA SERIA
//        Números:
//        1
//        2
//        3
//        4
//        5
//        Números:
//        10
//        Números:


        // HERANÇAS AUMENTA O NUMERO DE ACOMPLAMENTOS AS CLASSES FICAM DEPENDENTES.

        //         Herança é um mecanismo em que uma classe pode herdar características de outra classe, permitindo a
        //         reutilização de código e a criação de uma hierarquia de classes. Por exemplo, uma classe "Cachorro"
        //         pode herdar atributos e métodos da classe "Animal", aproveitando seu comportamento genérico.
        //
        // Acoplamento refere-se ao grau de dependência entre diferentes partes do código. Um alto acoplamento significa
        // que as partes estão fortemente interligadas, tornando o código mais rígido e difícil de modificar.
        // Um baixo acoplamento indica que as partes são independentes e podem ser modificadas sem afetar outras partes.
        // Por exemplo, se uma classe "Cachorro" depende diretamente da classe "Brinquedo", qualquer alteração na classe
        // "Brinquedo" pode afetar a classe "Cachorro". Em vez disso, é preferível usar uma interface "Brincavel" para
        // desacoplar as classes e permitir maior flexibilidade.
        //
        // Resumindo, a herança permite a reutilização de código e criação de hierarquia entre classes, enquanto o
        // acoplamento se refere à dependência entre as partes do código. É importante buscar um baixo acoplamento
        // para tornar o código mais flexível e fácil de manter.
        //

//        Exemplo de herança em código Java:
//
//        java
//        Copy code
//        class Animal {
//            public void comer() {
//                System.out.println("O animal está comendo.");
//            }
//        }
//
//        class Cachorro extends Animal {
//            public void latir() {
//                System.out.println("O cachorro está latindo.");
//            }
//        }
//
//        public class ExemploHeranca {
//            public static void main(String[] args) {
//                Cachorro dog = new Cachorro();
//                dog.comer(); // Método herdado da classe Animal
//                dog.latir(); // Método da classe Cachorro
//            }
//        }
//        Neste exemplo, temos duas classes: Animal e Cachorro. A classe Cachorro é uma subclasse de Animal, o que
//        significa que ela herda os membros (métodos e atributos) da classe Animal. O método comer() é definido na
//        classe Animal e o método latir() é definido na classe Cachorro.
//
//                No método main, criamos um objeto Cachorro e chamamos os métodos comer() e latir(). O método comer()
//                é herdado da classe Animal e o método latir() é específico da classe Cachorro. Assim, a saída do
//                programa seria:
//
//        mathematica
//        Copy code
//        O animal está comendo.
//        O cachorro está latindo.
//        Exemplo de acoplamento em código Java:
//
//        java
//        Copy code
//        interface Brincavel {
//            void brincar();
//        }
//
//        class Bola implements Brincavel {
//            public void brincar() {
//                System.out.println("Brincando com a bola.");
//            }
//        }
//
//        class Cachorro {
//            private Brincavel brinquedo;
//
//            public Cachorro(Brincavel brinquedo) {
//                this.brinquedo = brinquedo;
//            }
//
//            public void brincar() {
//                brinquedo.brincar();
//            }
//        }
//
//        public class ExemploAcoplamento {
//            public static void main(String[] args) {
//                Brincavel bola = new Bola();
//                Cachorro dog = new Cachorro(bola);
//                dog.brincar(); // O cachorro brinca com a bola
//            }
//        }
//        Neste exemplo, temos uma interface Brincavel que define o método brincar(). A classe Bola implementa essa
//        interface e implementa o método brincar() específico para a bola.
//
//        A classe Cachorro tem uma dependência com a interface Brincavel através de um atributo brinquedo.
//        No construtor da classe Cachorro, recebemos um objeto Brincavel e atribuímos ao atributo brinquedo.
//        O método brincar() da classe Cachorro utiliza o método brincar() do objeto brinquedo, sem se preocupar
//        com a implementação específica.
//
//        No método main, criamos um objeto Bola e um objeto Cachorro, passando a bola como argumento.
//        O cachorro brinca com o brinquedo que foi fornecido (no caso, a bola). A saída do programa seria:
//
//        css
//        Copy code
//        Brincando com a bola.
//        Dessa forma, temos um exemplo de desacoplamento entre as classes Cachorro e Bola através do uso
//        de uma interface, permitindo maior flexibilidade e facilidade de substituição de brinquedos.
    }

}
