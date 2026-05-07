import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // usando objeto em listas
        List<User> users = new ArrayList<>();

        var user = new User(0, "João");
        users.add(user);
        users.add(new User(1, "Maria"));
        users.add(new User(2, "Ana"));
        users.add(new User(3, "Rafael"));
        users.add(new User(4, "Letícia"));

        System.out.println("***** APRESENTAÇÃO DE DADOS DE USUÁRIOS *****");
        System.out.println("\n- Quantidade: " + users.size());
        System.out.println("- Está vazio: " + users.isEmpty());
        System.out.println("- Contém " + user + ": " + users.contains(user));
        System.out.println("- Primeiro: " + users.get(0));
        System.out.println("- Último: " + users.get(users.size() - 1));

        System.out.println("\nUsuário de acordo com sua posição:");
        for (int i = 0; i < users.size(); i++) {
            System.out.println(i + ") " + users.get(i));
        }

        System.out.println("\nImprimindo usuário segundo método equals sobrescrito na classe User:");
        System.out.println(new User (0, "João"));
        System.out.println(new User (1, "Maria"));
        System.out.println(new User (3, "Ana"));
        System.out.println(new User (4, "Rafael"));
        System.out.println(new User (5, "Letícia"));

        System.out.println("\nComparação: " + new User (0, "João").equals(new User(0, "João"))); //com o método, essa comparação também é possível

        //Removendo user
        System.out.println(users);
        System.out.println("\nRemovendo usuário que não existe: " + users.remove(new User (8, "Leo")));
        System.out.println(users.remove(3));
    }
}
