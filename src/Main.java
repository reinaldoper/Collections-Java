//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import generic.GenericsExempleList;
import generic.GenericExempleMap;
import generic.Box;

public class Main {
    public static void main(String[] args) {
        GenericsExempleList genericsExempleList = new GenericsExempleList();
        genericsExempleList.ReadList();

        System.out.println("Ordenando....");
        genericsExempleList.orderList();

        GenericExempleMap genericExempleMap = new GenericExempleMap();
        genericExempleMap.hashMap();

        Box<Integer> integerBox = new Box<>();
        integerBox.set(10);

        Box<String> stringBox = new Box<>();
        stringBox.set("Hello, World!");

        System.out.println("Valor na caixa integerBox: " + integerBox.get());
        System.out.println("Valor na caixa stringBox: " + stringBox.get());
    }
}