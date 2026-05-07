import java.time.OffsetDateTime;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        //Entendendo a diferença entre ArrayList e Vector

        List<Integer> arrayList = new ArrayList<>();
        var arrayStart = OffsetDateTime.now();
        for (int i = 0; i < 100_000_000; i++) {
            arrayList.add(i);
        }

        List<Integer> vectorList = new Vector<>();
        var vectorStart = OffsetDateTime.now();
        for (int i = 0; i < 100_000_000; i++) {
            vectorList.add(i);
        }

        List<Integer> linkedList = new Vector<>();
        var linkedStart = OffsetDateTime.now();
        for (int i = 0; i < 100_000_000; i++) {
            linkedList.add(i);
        }

        System.out.println("APRESENTAÇÃO DOS DADOS");
        System.out.println("\nArrayList: " + Duration.between(arrayStart, OffsetDateTime.now()).toMillis());
        System.out.println("Vector: " + Duration.between(vectorStart, OffsetDateTime.now()).toMillis());
        System.out.println("LinkedList: " + Duration.between(linkedStart, OffsetDateTime.now()).toMillis());
    }
}
