package application;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Entre com o valor double: ");
        StringTokenizer st = new StringTokenizer(br.readLine());        
        double entradaDouble = Double.parseDouble(st.nextToken());
        
        System.out.println("Entre com o valor inteiro: ");
        st = new StringTokenizer(br.readLine());        
        int entradaInteger = Integer.parseInt(st.nextToken());
        
        System.out.println("Entre com o valor string: ");
        st = new StringTokenizer(br.readLine());
        String entradaString = st.nextToken();
        
        System.out.print("Digite um valor lógico (boolean): ");
        st = new StringTokenizer(br.readLine());
        boolean entradaBoolean = Boolean.parseBoolean(st.nextToken());
        
        System.out.println("Saída dos valores lidos: ");
        System.out.printf("\tValorInteiro: %d%n", entradaInteger);
        System.out.printf("\tValorReal: %f%n", entradaDouble);
        System.out.printf("\tValorLógico: %b%n", entradaBoolean);
        System.out.printf("\tValorFrase: %s%n", entradaString);        

	}

}
