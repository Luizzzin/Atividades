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
        long distancia = 149600000L;
        System.out.println("A media _double_ deste aluno é: "+ media);
        System.out.println("A media _inteira_ deste aluno é: "+ media01);
        System.out.println("A media _long_ deste aluno é: "+ media02);
        System.out.println("A media _float_ deste aluno é: "+ media03);
        System.out.println("A distância da Terra ao Sol é: " + distancia + " km.");
    }
}