package mergulho.spring.algaworks;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ApiCollection {

    //    criando uma lista, populando e removendo nomes.
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();

        nomes.add("Matheus");
        nomes.add("Maria");
        nomes.add("João");

//      Removendo pelo nome.
        nomes.remove("João");


        //    Diferentes meios de interar uma lista.
//        FOR ANTIGO.
        for (int i = 0; i < nomes.size(); i++) {
            System.out.println("Nomes: " + nomes.get(i));
        }


//      FOR MELHORADO, OU ENHANCED FOR.
//        passa o tipo da variavel e um nome, : para cada elementos Nomes, vai iterar nome a nome.
        for (String nome : nomes) {
            System.out.println("Nome: " + nome);
        }


//        FOR EACH.
//        criando classe anonima (criando a interface ao mesmo tempo que instancia) inteface funcional um uncio metodo implementado.
        nomes.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });


//      FOR COM FUNÇÃO LAMBDA.
//        (escolher o nome do argumento que vai recerber)
        nomes.forEach(nome -> {
            System.out.println(nome);
        });


        //      FOR COM FUNÇÃO LAMBDA E CHAMANDO METODO Q JA EXISTE COM O :: METHOD REFERENCE.
//        (escolher o nome do argumento que vai recerber)
        nomes.forEach(System.out::println);




    }
}
