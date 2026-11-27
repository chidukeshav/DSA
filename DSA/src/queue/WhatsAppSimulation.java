package queue;

import java.util.LinkedList;
import java.util.Queue;

class Message {

	int id;
	String message;

	public Message(int id, String message) {
		this.id = id;
		this.message = message;
	}

	@Override
	public String toString() {
		return "Message : { id : " + id + ", message : " + message + "}";
	}
}

class WhatsApp {

	Queue<Message> queue = new LinkedList<Message>();

	void sendMessage(Message message) throws InterruptedException {

		queue.add(message);

		System.out.println("Message " + message.id + " is Received");
	}

	void displayMessages() {
		if (queue.isEmpty()) {
			System.out.println("No available messages");
			return;
		}

		System.out.println("Available Messages");

		for (Message message : queue) {
			System.out.println(message);
		}
	}

	void deliverMessage() throws InterruptedException {

		while (!queue.isEmpty()) {

			Message message = queue.peek();

			System.out.println("\nMessage " + message.id + " is Sending");

			int time = deliveryTime(message.message);

			for (int i = time; i > 0; i--) {

				System.out.println("Message will be delivered in " + i + " sec");

				Thread.sleep(1000);
			}

			System.out.println("Message " + message.id + " is Delivered");

			queue.poll();

			displayMessages();
		}
	}

	int deliveryTime(String message) {

		int length = message.length();

		if (length <= 20)
			return 3;
		else if (length <= 50)
			return 5;
		else
			return 8;
	}
}

public class WhatsAppSimulation {

	public static void main(String[] args) throws InterruptedException {

		WhatsApp whatsapp = new WhatsApp();

		whatsapp.sendMessage(new Message(101, "Hi"));
		whatsapp.sendMessage(new Message(102, "How are you?"));
		whatsapp.sendMessage(new Message(103, "Learning Java Queue"));
		whatsapp.sendMessage(new Message(104, "Java is an awesome programming language"));

		whatsapp.displayMessages();

		whatsapp.deliverMessage();

	}
}
