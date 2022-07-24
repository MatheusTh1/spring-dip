package mergulho.spring.algaworks;

import mergulho.spring.algaworks.models.Cliente;

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
        String forAntigo = "FOR ANTIGO: ";
        System.out.printf("%n"+forAntigo+"%n");

            for (int i = 0; i < nomes.size(); i++) {
                System.out.println("Nome: " + nomes.get(i));
            }


//      FOR MELHORADO, OU ENHANCED FOR.
//        passa o tipo da variavel e um nome, : para cada elementos Nomes, vai iterar nome a nome.
        String EnhancedFor = "ENHANCED FOR: ";
        System.out.printf("%n"+EnhancedFor+"%n");

            for (String nome : nomes) {
                System.out.println("Nome: " + nome);
            }


//        FOR EACH.
//        criando classe anonima (criando a interface ao mesmo tempo que instancia) inteface funcional um uncio metodo implementado.
        String forEachConsumer = "FOR EACH CONSUMER: ";
        System.out.printf("%n"+forEachConsumer+"%n");

        nomes.forEach(new Consumer<String>() {
            @Override
            public void accept(String nome) {
                System.out.println("Nome: " + nome);
            }
        });


//      FOR COM FUNÇÃO LAMBDA.
//        (escolher o nome do argumento que vai recerber)
        String forLambda = "FOR COM FUNÇÃO LAMBDA: ";
        System.out.printf("%n"+forLambda+"%n");

        nomes.forEach(nome -> {
            System.out.println(nome);
        });


        //      FOR COM FUNÇÃO LAMBDA E CHAMANDO METODO Q JA EXISTE COM O :: METHOD REFERENCE.
//        (escolher o nome do argumento que vai recerber)
        nomes.forEach(System.out::println);
        String forMethodReference= "FOR COM METHOD REFERENCE: ";
        System.out.printf("%n"+forMethodReference+"%n");


//        FAZENDO ITEREAÇÃO COM CLASSE DE CLIENTE.
        List<Cliente> clientes = new ArrayList<>();

        clientes.add(new Cliente(1L,"Maria"));
        clientes.add(new Cliente(2L,"João"));
        clientes.add(new Cliente(3L,"Matheus"));

        clientes.forEach(cliente -> System.out.printf("ID: %d, Nome: %s%n",
                cliente.getId(), cliente.getNome()));
    }
}
