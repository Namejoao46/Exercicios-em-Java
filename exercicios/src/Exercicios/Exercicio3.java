/*Desafio
Leia 2 valores de ponto flutuante de dupla precisão A e B, que correspondem a 2 notas de um aluno. A seguir, calcule a média do aluno, sabendo que a nota A tem peso 3.5 e a nota B tem peso 7.5 (A soma dos pesos portanto é 11). Assuma que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.

Entrada
O arquivo de entrada contém 2 valores com uma casa decimal cada um.

Saída
Calcule e imprima a variável MEDIA conforme exemplo abaixo, com 5 dígitos após o ponto decimal e com um espaço em branco antes e depois da igualdade. Utilize variáveis de dupla precisão (double) e como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".*/

package Exercicios;
import java.util.Scanner;

public class Exercicio3 {
    
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        //CRIANDO NOVA CLASSE SCANNER
        Scanner lendo = new Scanner(System.in);

        //INSERINDO VARIAVEIS
        double primeiroValor, segundoValor, media;

        //LEITURA DE VALORES INSERIDOS PELO USUARIO
        System.out.println("DIGITE O PRIMEIRO VALOR; ");
            primeiroValor = lendo.nextDouble();
        System.out.println("DIGITE O SEGUNDO VALOR; ");
            segundoValor = lendo.nextDouble();

        //CALCULANDO...
        media = (primeiroValor * 3.5 + segundoValor * 7.5)/11;

        //PRINTANDO RESULTADO
        System.out.printf("MEDIA = %.5f", media);

        //FECHANDO SCANNER
        lendo.close();

    }
}
