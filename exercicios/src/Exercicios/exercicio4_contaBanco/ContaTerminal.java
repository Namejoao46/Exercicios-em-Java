/*Vamos exercitar todo o conteúdo apresentado no módulo de Sintaxe codificando o seguinte cenário.

1. Crie o projeto ContaBanco que receberá dados via terminal contendo as características de conta em banco conforme atributos abaixo:
2.Dentro do projeto, crie a classe ContaTerminal.java para realizar toda a codificação do nosso programa.

  Atributo	 Tipo	 Exemplo
   Numero	Inteiro	  1021
   Agencia	Texto	  067-8
NomeCliente	Texto	MARIO ANDRADE
   Saldo	Decimal	 237.48

Revise sobre terminal, main args e a classe Scanner

3.Permita que os dados sejam inseridos via terminal sendo que o usuário receberá a mensagem de qual informação será solicitada, exemplo:
 -Programa: "Por favor, digite o número da Agência !"
 -Usuário: 1021 (depois ENTER para o próximo campo)

 Revise sobre concatenação e classe String com método concat

4. Depois de todas as informações terem sido inseridas, o sistema deverá exibir a seguinte mensagem:
-"Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque".

Os campos em [ ] devem ser alterados pelas informações que forem inseridas pelos usuários.*/

package Exercicios.exercicio4_contaBanco;
import java.util.Scanner;

public class ContaTerminal {
    
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String [] args){

      Scanner leitor = new Scanner(System.in);
      
      //INSERINDO VARIAVEIS
      double saldo = 237.48;
      int numeroConta;
      String nomeCliente, agencia;

      //LENDO VALORES DIGITADOS PELO USUARIO
      System.out.println("POR FAVOR, DIGITE O NUMERO DA SUA CONTA!");
      numeroConta = leitor.nextInt();
      System.out.println("AGORA DIGITE O NUMERO DA SUA AGÊNCIA");
      agencia = leitor.next();
      System.out.println("AGORA INFORME O SEU NOME COMPLETO");
      nomeCliente = leitor.next();
      System.out.println("SEU SALDO ATUAL E DE; " + saldo);

      //IMPRIMINDO NA TELA
      System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está " + "disponível para saque", nomeCliente, agencia, numeroConta, saldo);

      //FECHANDO SCANNER
      leitor.close();

    }
}