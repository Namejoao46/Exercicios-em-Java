/*Crie um algoritmo que leia uma quantidade de notas que o usuario queira e calcule a média entre elas.
Após isso mostre o valor absoluto da diferença entre elas*/

package Exercicios;
import java.util.Scanner;

public class Exercicio5 {

    @SuppressWarnings({ "ConvertToTryWithResources" })
    public static void main (String [] args){
        Scanner leitor = new Scanner(System.in);

        //LENDO A QUANTIDADE DE NOTAS QUE O USUARIO DESEJA
        System.out.println("POR FAVOR DIGITE QUANTAS NOTAS VOCE QUER USAR PARA TIRAR A MEDIA; ");
           int x = leitor.nextInt();

        //INSERINDO ARRAY E VARIAVEL SOMA
        double[] notas = new double[x];
        double soma = 0.0;
        
        //ESTRUTURA DE REPETIÇÃO VOLTADA AO PREENCHIMENTO DE CADA NOTA
        for (int a = 0; a < x; a++){
            System.out.printf("DIGITE O VALOR DA %d NOTA;", a + 1);
            notas[a] = leitor.nextDouble();
            soma += notas[a];
        }

        //CALCULO
        double media = soma / x;

        //IMPRIMINDO PARA O USUARIO A MEDIA
        System.out.printf("A MEDIA DOS VALORES E DE; %.2f", media);

        //FECHANDO O SCANNER
        leitor.close();
    }
    
}
