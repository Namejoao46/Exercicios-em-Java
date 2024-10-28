/*Desafio
Você receberá dois valores inteiros. Faça a leitura e em seguida calcule o produto entre estes dois valores. Atribua esta operação à variável PROD, mostrando esta de acordo com a mensagem de saída esperada (exemplo abaixo).   

Entrada
A entrada contém 2 valores inteiros.

Saída
Exiba a variável PROD conforme exemplo abaixo, tendo obrigatoriamente um espaço em branco antes e depois da igualdade.*/

package Exercicios;
import java.util.Scanner;

public class Exercicio1 {

    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {

        //TRAZENDO O SCANNER PARA O CODIGO
        Scanner sc = new Scanner(System.in);

        //INSERINDO VARIAVEIS
        double primeiroValor, segundoValor, produto;

        //IMPRINDO NA TELA PARA A INTERAÇÃO COM O USUARIO
        System.out.println("DIGITE O PRIMEIRO VALOR; ");
            primeiroValor = sc.nextDouble();
        System.out.println("DIGITE O SEGUNDO VALOR; ");
            segundoValor = sc.nextDouble();

        //CALCULANDO...
        produto = primeiroValor * segundoValor;

        //PRINTANDO NA TELA
        System.out.println("PROD=" + produto);

        sc.close();
        
    }
    
}
