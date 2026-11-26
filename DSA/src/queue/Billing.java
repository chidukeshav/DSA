package queue;

import java.util.LinkedList;
import java.util.Queue;

class Order {
	int oid;
	String item;

	public Order(int oid, String item) {

		this.oid = oid;
		this.item = item;
	}

}

class Restaurant {
	Queue<Order> q = new LinkedList<>();

	void placeorder(Order o) {
		q.add(o);
		System.out.println("The order" + o.oid + "is present");
	}

	void display() {
		System.out.println("*****Display**********");
		for (Order order : q) {
			System.out.println(order.oid + " " + order.item);
		}
		System.out.println("******************************");
	}

	void prepareOrder() throws InterruptedException {
		while (!q.isEmpty()) {
			Order current = q.peek();
			System.out.println("The current order is" + current.oid);
			int time = prepareTime(current.item);
			for (int i = time; i > 1; i--) {
				System.out.println("praparing in" + i + "min");
				Thread.sleep(1000);
			}
			System.out.println("the Order" + current.oid + " isready");
			q.poll();
			display();
			

		}
	}

	private int prepareTime(String item) {

		switch (item.toLowerCase()) {
		case "Desert":
			return 10;
		case "Burger":
			return 8;
		case "fries":
			return 5;
		case "Pizza":
			return 9;
		default:
			return 5;
		}
	}
}

class Billing {
	public static void main(String[] args) throws InterruptedException {
		Restaurant r = new Restaurant();
		r.placeorder(new Order(1001, "Burger"));
		r.placeorder(new Order(1002, "Pizza"));
		r.placeorder(new Order(1003, "Fries"));
		r.placeorder(new Order(1004, "Desert"));
		r.display();
		r.prepareOrder();
	}
}
