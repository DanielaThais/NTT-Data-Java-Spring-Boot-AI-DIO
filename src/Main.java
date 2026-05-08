import java.util.Set;
import java.util.TreeSet;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        Set<User> users = new TreeSet<>();
        users.add(new User(0, "João"));
        users.add(new User(1, "Maria"));
        users.add(new User(2, "Pedro"));
        users.add(new User(3, "Ana"));

        System.out.println("***** APRESENTAÇÃO DOS DADOS *****");
        System.out.println(users.contains(new User(0, "João")));
        System.out.println("\nHash de João: " + new User (0, "João").hashCode());
        System.out.println("Hash de Ana: " + new User (3, "Ana").hashCode());
        System.out.println("Hash de Maria: " + new User (1, "Maria").hashCode());
        System.out.println("Hash de Pedro: " + new User (2, "Pedro").hashCode());
    
    }
}
