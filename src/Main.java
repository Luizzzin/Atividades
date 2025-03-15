//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int numUM = 10;
        int numDois = 6;
        int numTres = 8;
        int numQuatro = 7;
        double media = (numUM + numDois + numTres + numQuatro)/4.0;
        int media01 = (numUM+numDois+numTres+numQuatro)/4;
        long media02 = (numUM+numDois+numTres+numQuatro)/4L;
        float media03 = (numUM+numDois+numTres+numQuatro)/4.0f;

        System.out.println("A media _double_ deste aluno é: "+ media);
        System.out.println("A media _inteira_ deste aluno é: "+ media01);
        System.out.println("A media _long_ deste aluno é: "+ media02);
        System.out.println("A media _float_ deste aluno é: "+ media03);
        //declaração de long
        System.out.println("--------------");
        long distancia = 149600000L;
        System.out.println("\nA distância da Terra ao Sol é: " + distancia + " km.");

        //declaração de um character, unicode
        char letra = 'a';
        int valorUnicode = letra;
        int uniCont = (letra+letra);
        System.out.println("---------------");
        System.out.println("\nO valor Unicode de '" + letra + "' é: " + valorUnicode+"valor do unicode soma="+uniCont+"\n");

        //boleana boolean

        System.out.println("-------");
        int numero = 10;
        boolean maiorQueDez = numero > 10;

        System.out.println("O número " + numero + " é maior que 10? " + maiorQueDez);

        System.out.println("\n-----------------\n");

        //Arrays
        int[] numeros = {10, 20, 30, 40, 50};
        System.out.println("Primeiro número: " + numeros[0]);
        System.out.println("segundo número: " + numeros[1]);
        System.out.println("Último número: " + numeros[numeros.length - 1]);

        System.out.println("\n------------------\n");

        // calculando
        double largura = 5.0;
        double altura = 3.0;
        double area = largura * altura;

        System.out.println("A área do retângulo é: " + area+"M²");
        System.out.println("\n--------\n");

        //trabalhando com strings e dados multivalorados
        int idade = 46;
        double peso = 60.4 ;
        String nome = "João";
        System.out.println("Olá meu nome é: " + nome + "\ncompletei: "+idade+" anos de idade\neu peso aproximadamente: "+peso);

        System.out.println("\n---------------------\n");

        //verificando se é par ou impar

        int number = 116;
        if (number % 2 == 0) {
            System.out.println("O número " + number + " é par.");
        } else {
            System.out.println("O número " + number + " é ímpar.");
        }
        System.out.println("\n---------------------\n");

        //declarando variaveis
        int Newidade = 25;
        double Newaltura = 1.75;
        char Newinicial = 'L';
        boolean Newestudante = true;

        System.out.println("Sua idade é " + Newidade);
        System.out.println("Sua altura é " + Newaltura);
        System.out.println("A inicial do seu nome é '" + Newinicial + "'");
        System.out.println("Você é estudante? " + Newestudante);


    }
}