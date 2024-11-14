/*Desafio
Leia dois valores inteiros identificados como variáveis A e B. Calcule a soma entre elas e chame essa variável de SOMA.
A seguir escreva o valor desta variável.

Entrada
O arquivo de entrada contém 2 valores inteiros.

Saída
Imprima a variável SOMA com todas as letras maiúsculas, inserindo um espaço em branco antes e depois do símbolo de igualdade, seguido pelo valor correspondente à soma de A e B.*/

package Exercicios;
import java.util.Scanner;

public class Exercicio2 {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        //INSERINDO O NOVO SCANNER
        Scanner lendo = new Scanner(System.in);

        //INSERINDO VARIAVEIS
        int primeiroValor, segundoValor, soma;

        //INTERAÇÃO COM O USUARIO
        System.out.println("DIGITE O PRIMEIRO VALOR; ");
            primeiroValor = lendo.nextInt();
        System.out.println("DIGITE O SEGUNDO VALOR; ");
            segundoValor = lendo.nextInt();

        //CALCULANDO...
        soma = primeiroValor + segundoValor;

        //RESULTADO
        System.out.println("SOMA = " + soma);

        //FECHANDO O SCANNER
        lendo.close();
    }
}