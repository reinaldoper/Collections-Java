package generic;

import java.util.*;

public class GenericsExempleList {
    List<String> lista = new ArrayList<>();

    public void ReadList(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Deseja começar o List ?: 1 yes, 0 not");
        int valor = scanner.nextInt();
        while (valor != 0){
            System.out.println("Digite um nome:");
            String nome = scanner.next();
            lista.add(nome);
            System.out.println("Digite o endereço:");
            String adress = scanner.next();
            lista.add(adress);
            System.out.println("Deseja continuar ?: 1 yes, 0 not");
            valor = scanner.nextInt();
        }
        // Iterando e imprimindo os elementos da lista
        for(String list: lista){
            System.out.println(list);
        }
    }

    public void orderList(){
        Collections.sort(lista);
        for(String element : lista) {
            System.out.println(element);
        }
    }
}
