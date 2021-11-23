package my.home.oop.task02.logic;

import java.util.List;

import my.home.oop.task02.entity.Payment;
import my.home.oop.task02.entity.Payment.Product;

public class PaymentLogic {

	public double findTotalPrice(Payment payment) {

		List<Product> products = payment.getProducts();
		double totalPrice = 0.0;

		for (Product product : products) {

			totalPrice += product.getPrice();
		}

		return totalPrice;

	}

}
