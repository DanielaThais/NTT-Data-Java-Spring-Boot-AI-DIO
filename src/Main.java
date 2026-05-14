import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {

	public static void main(String[] args) {

		// trabalhando com o BigDecimal, que é a forma mais correta de trabalhar com números decimais em Java, pois ele utiliza uma representação decimal exata, evitando os problemas de precisão que ocorrem com os tipos float e double.
		BigDecimal value1 = new BigDecimal("99.81");
		BigDecimal value2 = new BigDecimal("56.54");

		System.out.println("<=========== BIGDECIMAL ===========>");
		System.out.println("Valor 1: " + value1 + "\nValor 2: " + value2);
		System.out.println("\nMultiplicando os números: " + value1.multiply(value2));
		System.out.println("Dividindo os números: " + value1.divide(value2, RoundingMode.CEILING));
	}

}