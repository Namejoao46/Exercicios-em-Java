package aulas.estruturaDeDados.pilha;

public class Pilha {

    // No de referência
    private No referenciaNoEntradaPilha;

    // Construtor vazio
    public Pilha() {
        this.referenciaNoEntradaPilha = null;
    }

    // Metodo para empilhar (push)
    public void push(No novoNo) {
        No referenciaAuxiliar = referenciaNoEntradaPilha;
        referenciaNoEntradaPilha = novoNo;
        referenciaNoEntradaPilha.setReferenciaNo(referenciaAuxiliar);
    }

    // Metodo que exclui o último elemento colocado na pilha (pop)
    public No pop() {
        if (!this.isEmpty()) {
            No noPopped = referenciaNoEntradaPilha;
            referenciaNoEntradaPilha = referenciaNoEntradaPilha.getReferenciaNo();
            return noPopped;
        }
        return null;
    }

    // Metodo que retorna o nó de entrada na pilha (top)
    public No top() {
        return referenciaNoEntradaPilha;
    }

    //metodo que verifica se o nó de entrada está nulo
    public boolean isEmpty() {
        return referenciaNoEntradaPilha == null;
    }

    @Override
    public String toString() {
        String stringRetorno = "-------------\n";
        stringRetorno += "    pilha\n";
        stringRetorno += "-------------\n";

        No noAuxiliar = referenciaNoEntradaPilha;

        while (true) {
            if (noAuxiliar != null) {
                stringRetorno += "[no{dado=" + noAuxiliar.getDado() + "}]\n";
                noAuxiliar = noAuxiliar.getReferenciaNo();
            } else {
                break;
            }
        }
        stringRetorno += "-------------\n";
        return stringRetorno;
    }
}
