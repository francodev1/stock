package com.franco.stock;

import com.franco.stock.entities.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;
import java.util.Scanner;

@SpringBootApplication
public class StockApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockApplication.class, args);
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

			Product product = new Product();

		boolean isTrue = true;



		while (isTrue) {
			System.out.println("Adicione o Produto:");
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Preço: ");
			double price = sc.nextDouble();
			System.out.print("Quantidade no estoque: ");
			int quantity = sc.nextInt();


			System.out.println("Produtos adicionados:" + product.toString());


			int escolha = 0;

			System.out.println("Escolha uma opção: ");
			System.out.println("0 - Sair");
			System.out.println("1 - Adicionar produtos");
			System.out.println("2 - Remover produtos");
			escolha = sc.nextInt();

			switch (escolha) {
				case 0:
					isTrue = false;
					break;
				case 1:
					System.out.println("Adicionar produtos");
					System.out.println("Entre com a quantidade para adicionar estoque: ");
					quantity = sc.nextInt();
					product.addProducts(quantity);

					break;
				case 2:
					System.out.println("Remover produtos");
					System.out.println("Entre com a quantidade para remover do estoque: ");
					quantity = sc.nextInt();
					product.removeProducts(quantity);
					break;
				default:
					System.out.println("Opção inválida");
					break;
			}

			System.out.println("Deseja adicionar ou remover mais produtos? (s/n)");
			char answer = sc.next().charAt(0);
			if (answer == 'n') {
				isTrue = false;
			}
			sc.nextLine();

			System.out.println("Estoque atualizado: " + product.toString());
		}


		System.out.println("Fim do programa de cadastro de produtos, obrigado!");


		sc.close();
	}
}
