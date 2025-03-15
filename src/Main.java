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
        boolean maiorQueDez = numero >= 10;

        System.out.println("O número " + numero + " é maior ou igual que 10? " + maiorQueDez);

        System.out.println("\n-----------------\n");

        //Arrays
        int[] numeros = {10, 20, 30, 40, 50};
        System.out.println("Primeiro número: " + numeros[0]);
        System.out.println("segundo número: " + numeros[1]);
        System.out.println("Último número: " + numeros[numeros.length - 1]);

        System.out.println("\n------------------\n");

    }
}