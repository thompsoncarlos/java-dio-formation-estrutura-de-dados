package main.java.com.projeto.atribuicaoreferencia;

public class Main {
    public static void main(String[] args){
        int a = 1;
        int b = a;

        System.out.println("a = " + a + " b = " + b);
        a = 2;
        System.out.println("a = " + a + " b = " + b);

        MeuObjeto objA = new MeuObjeto(1);
        MeuObjeto objB = objA;

        System.out.println("ObjA = " + objA + " ObjB = " + objB);
        objA.setNum(3);
        System.out.println("ObjA = " + objA + " ObjB = " + objB);
    }
}
