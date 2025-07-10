package com.krushna.interface_predefine_functions.consumer;

import java.util.function.Consumer;

class Product {

	private Integer id;
	private String name;
	private Double price;

	public Product(Integer id, String name, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

}

public class ConsumerDemo1 {

	public static void main(String[] args) {
		Consumer<Product> pd = new Consumer<Product>() {

			public void accept(Product p) {

				System.out.println("ANONYMOUS INNER CLASS ORVERRIDEN METHOD" + p);

			}

		};

		Consumer<Product> pd2 = (p2) -> System.out.println("LAMBDA EXPRESSION : " + p2);

		pd.accept(new Product(11, "k", 123d));

		System.out.println("\n\t\t=========================\n\t\t=========================\n" + "\n");
		pd2.accept(new Product(11, "k", 123d));
	}

}
