package aulas.estruturaDeDados.fila;

public class main {
    public static void main(String[] args){

        Fila<String> minhaFila = new Fila<>();

        minhaFila.enqueue("primeiro");
        minhaFila.enqueue("segundo");
        minhaFila.enqueue("terceiro");
        minhaFila.enqueue("quarto");
        minhaFila.enqueue("quinto");

        System.out.println(minhaFila);

        //RETIRENDO
        System.out.println(minhaFila.dequeue());

        System.out.println(minhaFila);

        //ADICIONANDO
        minhaFila.enqueue("ULTIMO");

        System.out.println(minhaFila);

        //pegando o primeiro
        System.out.println(minhaFila.first());

        System.out.println(minhaFila);

    }
}
