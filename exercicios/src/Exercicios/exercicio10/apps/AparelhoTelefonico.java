package apps;

import java.util.Scanner;
import javax.swing.JSpinner;

public class AparelhoTelefonico {
    public void ligar(String numero){
        Scanner leitor = new Scanner();

        System.out.println("LIGANDO...");
        atender();
    }
    public void atender(){
        
        System.out.printf("ATENDEU?\n1--SIM---\n2--NAO---\n", a);
        int a = leitor.nextInt()

        if(a == 1){
            System.out.println("EM TELEFONEMA");
        }else if(a == 2){
            System.out.printf("INFELIZMENTE NAO FOI POSSIVEL CONTATAR O CONTADO DESEJADO\n
            DESEJA LIGAR NOVAMENTE OU MANDAR UM CORREIO DE VOZ??");
            System.out.println("1--LIGAR NOVAMENTE---\n2--CORREIO DE VOZ---");
            int b = leitor.nextInt();
            
            if(b == 1){
                AparelhoTelefonico();
            }else{
                iniciarCorreioDeVoz();
            }
        }
    }
    public void iniciarCorreioDeVoz(){
        System.out.println("INICIANDO CORREIO DE VOZ");
        System.out.printf("DESEJA ENCERRAR O CORREIO DE VOZ?\n1=SIM\n2=NAO");
        int c = leitor.nextInt();

        if(c == 1){
            break;
        }else{
            iniciarCorreioDeVoz();
        }
        
    }
}
