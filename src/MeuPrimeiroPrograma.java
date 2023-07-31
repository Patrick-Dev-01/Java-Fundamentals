import java.util.Random;
import java.util.Scanner;

public class MeuPrimeiroPrograma {
    public static void main(String[] args) {
        // mathCalc(2, 2);
        // counter();
        // generateRandomNumbers();
        // textManages("  Olá mundo, esse é o novo mundo");
        // textMatch("123456");
    }

    private static void inputUser(){
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(name);
    }

    private static void mathCalc(int num1, int num2){
        System.out.println("<---Operações Matemáticas-->");
        int sumResult = num1 + num2;
        int minusResult = num1 - num2;
        int timesResult = num1 * num2;
        int divisionResult = num1 / num2;

        System.out.println(sumResult);
        System.out.println(minusResult);
        System.out.println(timesResult);
        System.out.println(divisionResult);
    }

    private static void textMatch(String text){
        System.out.println("Digite a sua senha:  ");
        Scanner scanner = new Scanner(System.in);
        String pass = scanner.nextLine();

        // "==" não compara o conteudo da string e sim a referencia dos objetos
        System.out.println(text.equals(pass));
    }

    private static void textManages(String text){
        // Quantidade de caracters de uma string
        System.out.println(text.length());
        // concatenação
        System.out.println(text + " concatenado");
        // Se o conjunto de caracters existe em uma string
        System.out.println(text.contains("novo"));
        // mostrar o indice de onde o conjunto de caracters aparece em uma string
        System.out.println(text.indexOf("mundo"));
        // mostrar o indice de onde o conjunto de caracters aparece pela ultima vez em uma string
        System.out.println(text.lastIndexOf("mundo"));
        // remover espaços desnecesarios (como espaços no começo das frases)
        System.out.println(text.trim());
        // pegar uma string apartir de um determinado ponto da string
        System.out.println(text.substring(9));
        // comparação de strings
        System.out.println(text.equals("ola"));
    }

    private static void counter(){
        System.out.println("<---Contador-->");
        for (int i = 0; i <= 10; i++){
            System.out.println(i);
        }
    }
    private static void Arraylist(){
        System.out.println("<---Lista de array-->");
        String[] fruits;
    }

    private static void generateRandomNumbers(){
        System.out.println("<---Random Numbers Generator--->");
        Random generate = new Random();

        for (int i = 0; i <= 10; i++){
            int number = generate.nextInt(20);
            System.out.println(number);
        }
    }
}
