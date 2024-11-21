package aulas.estruturaDeDados.pilha;

public class main {

    public  static void main(String[] args){

        Pilha minhaPilha = new Pilha();

        //EMPILHEIRANDO
        minhaPilha.push(new No(1));
        minhaPilha.push(new No(2));
        minhaPilha.push(new No(3));
        minhaPilha.push(new No(4));
        minhaPilha.push(new No(5));
        minhaPilha.push(new No(6));

        System.out.println(minhaPilha);

        //DESEMPILHEIREANDO
        System.out.println(minhaPilha.pop());

        System.out.println(minhaPilha);




    }


}
