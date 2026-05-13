import java.time.Duration;
import java.time.OffsetDateTime;

public class Main {

	public static void main(String[] args) {

		var stringStart = OffsetDateTime.now();
		String stringConcat = "";

		for (int i = 0; i < 400_000; i++) {
			stringConcat += i; // essa concatenação é muito custosa, pois a cada concatenação é criado um novo
								// objeto String, o que consome muita memória e tempo de processamento, não
								// sendo a forma mais indicada.
		}
		var stringEnd = OffsetDateTime.now();
		System.out.printf("String concatenada: %s \n", getInterval(stringStart, stringEnd));

		// essas são as formas recomendadas para concatenar strings em Java, pois o
		// StringBuilder é uma classe mutável que permite modificar o conteúdo sem criar
		// novos objetos, o que é mais eficiente em termos de memória e desempenho.Vale
		// ressaltar que semrpre é bom fazer uma análise de mercado

		var BuilderStart = OffsetDateTime.now();
		var stringBuilder = new StringBuilder(); // singlethreads
		for (int i = 0; i < 400_000; i++) {
			stringBuilder.append(i);
		}
		var BuilderEnd = OffsetDateTime.now();
		System.out.printf("StringBuilder (singlethreads): %s \n",
				getInterval(BuilderStart, BuilderEnd));

		var BufferStart = OffsetDateTime.now();
		var stringBuffer = new StringBuffer(); // multithreads
		for (int i = 0; i < 400_000; i++) {
			stringBuffer.append(i);
		}
		var BufferEnd = OffsetDateTime.now();

		System.out.printf("StringBuffer (multithreads): %s \n", getInterval(BufferStart, BufferEnd));

	}

	private static long getInterval(OffsetDateTime BufferStart, OffsetDateTime BufferEnd) {
		return Duration.between(BufferStart, BufferEnd).toMillis();
	}
}