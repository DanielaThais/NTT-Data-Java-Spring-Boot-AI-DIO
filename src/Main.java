import domain.User;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, User> users = new HashMap<>();

        users.put("joao@joao.com", new User("João", 22)); // ao invés de .add, é utilizado o .put
        users.put("maria@maria.com", new User("Maria", 32));
        users.put("juca@juca.com", new User("Juca", 18));
        users.put("leo@leo.com", new User("Léo", 40));

        System.out.println("***** APRESENTAÇÃO DOS DADOS *****" +
                "\nImpressão do método put: " + users);

        users.putAll(users);
        System.out.println("\nImpressão do método putAll: " + users);

        // obtendo valores de Map
        System.out.println("\n==================================" +
                "\nOBTENDO DADOS COM KEYSET");
        users.keySet().forEach(System.out::println);
        System.out.println("\n==================================" +
                "\nOBTENDO DADOS COM VALUES");
        users.values().forEach(System.out::println);

        System.out.println("\n==================================" +
                "\nOBTENDO DADOS COM CONTAINS KEY" +
                "\n\nO Map contém 'leo@leo.com'? ");
        System.out.println(users.containsKey("leo@leo.com"));
        System.out.println("\nO Map contém 'ana@ana.com'? ");
        System.out.println(users.containsKey("ana@ana.com"));

        System.out.println("\n==================================" +
                "\nOBTENDO DADOS COM CONTAINS VALUE" +ixa
        System.out.println(users.containsValue(new User("João", 22)));
        System.out.println("\nO Map contém o usuário Pedro?");
        System.out.println(users.containsValue(new User("Pedro", 25)));
    }

}
