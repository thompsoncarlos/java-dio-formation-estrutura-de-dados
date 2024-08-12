package main.java.com.projeto.fila;

public class No<T> {
    private T object;
    private No refNo = null;

    public No(){}
    public No(T object) {
        this.refNo = null;
        this.object = object;
    }


    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public No getRefNo() {
        return refNo;
    }

    public void setRefNo(No reNo) {
        this.refNo = reNo;
    }

    @Override
    public String toString() {
        return "No{" +
                "object=" + object +
                '}';
    }
}
