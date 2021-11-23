package my.home.oop.task02.main;

import my.home.oop.task02.entity.Payment;
import my.home.oop.task02.entity.Payment.Product;
import my.home.oop.task02.logic.PaymentLogic;
import my.home.oop.task02.view.View;

/*Создать класс Payment с внутренним классом, 
 * с помощью объектов которого можно сформировать покупку из нескольких товаров*/

public class Main {

	public static void main(String[] args) {

		Payment payment = new Payment();

		payment.addProduct(new Product("Coffe", 15.50));
		payment.addProduct(new Product("Milk", 2.50));
		payment.addProduct(new Product("Book", 30.00));
		payment.addProduct(new Product("Water", 10.00));

		View view = new View();

		view.print(payment);

		PaymentLogic paymentLogic = new PaymentLogic();

		double totalPrice = paymentLogic.findTotalPrice(payment);

		view.print(totalPrice);

	}
}
