package com.example.demo;
import java.util.Scanner;

public class DemoApplication {

	public static void main(String[] args) {

		int contador;
		Scanner sc = new Scanner(System.in);

		for (contador = 0; contador < 2; contador ++){
			System.out.printf("Informe o código da peça %d: \n", contador+1);
        	int codigo = sc.nextInt();

			System.out.printf("Informe o número de peças %d: \n", contador+1);
        	int numeroPecas = sc.nextInt();

			System.out.printf("Informe o valor unitário da peça %d: \n", contador+1);
       		double valorUnitario = sc.nextDouble();

			double valorTotal = CalcularCompra.calcularTotalCompra(numeroPecas, valorUnitario);
			System.out.printf("Valor total compra %d: %.2f\n", contador+1, valorTotal);
		}

	}

}
