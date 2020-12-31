package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date data = new Date();
		List<Product> list = new ArrayList<>();
		
		System.out.print("Entre com o número de produtos: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("Dados do " + i + "º Produto:");
			System.out.print("Comum, usado ou importado? (c, u, i)? ");
			char resp = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Preço: R$ ");
			double price = sc.nextDouble();
			if(resp == 'c') {
				list.add(new Product(name, price));				
			}
			if(resp == 'i') {
				System.out.print("Taxa de Importação: R$ ");
				double customsFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));
			}
			if(resp == 'u') {
				System.out.print("Data de Fabricação? (dd/mm/aaaa): ");
				data = sdf.parse(sc.next());
				list.add(new UsedProduct(name, price, data));
			}
		}
		System.out.println();
		System.out.println("Etiquetas: ");
		System.out.println();
		
		for(Product prod: list) {
			System.out.println(prod.priceTag());
		}
		sc.close();
	}
}
