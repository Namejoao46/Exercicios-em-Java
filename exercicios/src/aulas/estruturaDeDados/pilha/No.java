package aulas.estruturaDeDados.pilha;

public class No {

    // No do tipo inteiro
    private int dado;
    // Referência para o próximo no
    private No referenciaNo = null;

    // Construtor vazio
    public No() {
    }

    public No(int dado) {
        this.dado = dado;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public No getReferenciaNo() {
        return referenciaNo;
    }

    public void setReferenciaNo(No referenciaNo) {
        this.referenciaNo = referenciaNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "dado=" + dado +
                '}';
    }
}
