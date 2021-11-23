package my.home.oop.task02.view;

import java.util.List;

import my.home.oop.task02.entity.Payment;
import my.home.oop.task02.entity.Payment.Product;

public class View {

	public void print(Payment payment) {

		List<Product> products = payment.getProducts();
		for (Product product : products) {

			System.out.println(product);
		}

	}

	public void print(double totalPrice) {

		System.out.println("Total price is " + totalPrice);
	}
}
