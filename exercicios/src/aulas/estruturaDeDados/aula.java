package aulas.estruturaDeDados;

public class aula{

    public static void main(String[] args){
        //INSERINDO VARIAVEL NORMAL
        int n1 = 1;
        int n2 = n1;

        //A IMPRIMINDO
        System.out.println("n1 =" + n1 +" n2 =" + n2);
        //MODIFICANDO O VALOR
        n1 = 2;
        System.out.println("n1 =" + n1 +" n2 =" + n2);

        //INSERINDO VARIAVEL OBJETO PARA MOSTRAR A DIFERENCIA DE UM PARA O OUTRO
        MyObj a = new MyObj(1);
        MyObj b = a;

        System.out.println("ObjA=" + a +" objB=" + b);
        //MOSTRANDO QUE QUANDO MODIFICO, ELE JA MODIFICA NA MEMORIA
        a.setNum(2);
        System.out.println("ObjA=" + a +" objB=" + b);
    }
}
