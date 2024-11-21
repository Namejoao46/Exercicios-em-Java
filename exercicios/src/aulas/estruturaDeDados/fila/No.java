package aulas.estruturaDeDados.fila;

public class No<T> {

    private T obj;
    private No<T> referenciaNo;

    public No(){

    }

    public No(T obj){
        this.referenciaNo = null;
        this.obj = obj;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
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
                "obj=" + obj +
                '}';
    }
}
