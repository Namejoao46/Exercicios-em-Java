package aulas.estruturaDeDados.fila;

public class Fila<T> {

    private No<T> referenciaNoEntradaFila;

    public Fila() {
        this.referenciaNoEntradaFila = null;
    }

    public void enqueue(T obj) {
        No novoNo = new No(obj);
        novoNo.setReferenciaNo(referenciaNoEntradaFila);
        referenciaNoEntradaFila = novoNo;
    }

    public T first() {
        if (!this.isEmpty()) {
            No primeiroNo = referenciaNoEntradaFila;
            while (primeiroNo.getReferenciaNo() != null) {
                primeiroNo = primeiroNo.getReferenciaNo();
            }
            return (T) primeiroNo.getObj();
        }
        return null;
    }

    public T dequeue() {
        if (!this.isEmpty()) {
            No primeiroNo = referenciaNoEntradaFila;
            No noAuxiliar = referenciaNoEntradaFila;

            while (primeiroNo.getReferenciaNo() != null) {
                noAuxiliar = primeiroNo;
                primeiroNo = primeiroNo.getReferenciaNo();
            }
            noAuxiliar.setReferenciaNo(null);
            return (T) primeiroNo.getObj();
        }
        return null;
    }

    public boolean isEmpty() {
        return referenciaNoEntradaFila == null;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        No noAuxiliar = referenciaNoEntradaFila;

        if (referenciaNoEntradaFila != null) {
            while (noAuxiliar != null) {
                stringRetorno += "[No{objeto=" + noAuxiliar.getObj() + "}]--->";
                noAuxiliar = noAuxiliar.getReferenciaNo();
            }
            stringRetorno += "null";
        } else {
            stringRetorno = "null";
        }

        return stringRetorno;
    }
}
