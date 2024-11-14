package Exercicios.exercicio8_processoSeletivo;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
//import java.util.Scanner;

public class ProcessoSeletivol {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args){
        
        String [] candidatos = {"JOAO","MARCIA","PAULO","JOSE","ISA"};

        //FORMA ABREVIADA DE FOR
        for (String candidato: candidatos) {
            entrandoEmContato(candidato);
        }
 
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continueTentando = true;
        boolean atendeu = false;

        do { 
            atendeu = atender();
            continueTentando = !atendeu;
            if(continueTentando){
                tentativasRealizadas++;
            }else{
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }
             
        } while (continueTentando && tentativasRealizadas < 3);
    }

    static boolean atender (){
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"JOAO","MARCIA","PAULO","JOSE","ISA"};

        System.out.println("IMPRIMINDO A LISTA DE CANDIDATOS SELECIONADOS E INFORMANDO SEU INDICE");

        for(int indice = 0; indice < candidatos.length ;indice++) {
            System.out.printf("\nO CANDIDATO DE N° %d É %s\n", indice + 1, candidatos[indice]);

        }
    }

    static  void selecaoCandidatos(){
        String [] candidatos = {"JOAO","MARCIA","PAULO","JOSE","ISA","MONICA","MARCIO","PAULA","NAIARA","JULIO"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.printf("\nO candidato %s solicitou este valor de salario %f", candidato, salarioPretendido);
            if( salarioBase >= salarioPretendido){
                System.out.printf("O candidato %s foi selecionado\n", candidato);
                analisaCandidato(salarioPretendido);
                candidatosSelecionados++;
            }
            else{
                analisaCandidato(salarioPretendido);
            }
            candidatoAtual++;
            
        }
    } 
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    static void analisaCandidato (double salarioPretendido){
        double salarioBase = 2000.0;

        if(salarioBase > salarioPretendido){
            System.out.println(" LIGAR PARA O CANDIDATO");
        } 
        else if( salarioBase == salarioPretendido){
            System.out.println(" LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        }
        else {
            System.out.println(" AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}