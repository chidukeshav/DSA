package queue;

import java.util.LinkedList;
import java.util.Queue;

class Threadd {

	int id;
	String task;

	public Threadd(int id, String task) {
		this.id = id;
		this.task = task;
	}

	@Override
	public String toString() {
		return "Thread T" + id + " | Task: " + task;
	}
}

class CPU {

	Queue<Threadd> queue = new LinkedList<>();

	void addTask(Threadd t) {
		queue.add(t);
		System.out.println("Added to Ready Queue: " + t);
	}

	int getExecutionTime(String task) {

		switch (task) {
		case "Open Chrome":
			return 3;

		case "Download File":
			return 2;

		case "Play Music":
			return 4;

		default:
			return 1;
		}
	}

	void executeTask() {

		while (!queue.isEmpty()) {

			Threadd t = queue.poll();

			System.out.println("Task: " + t.task);

			int time = getExecutionTime(t.task);

			System.out.println("CPU executing T" + t.id);

			for (int i = time; i > 0; i--) {
				System.out.println("Task " + t.task + "is Executed in " + i + "min");

			}

			System.out.println("T" + t.id + " completed execution!");
		}
	}

	void displayAllTasks() {

		if (queue.isEmpty()) {
			System.out.println("Ready Queue is empty!");
			return;
		}

		System.out.println("========== READY QUEUE ==========");

		for (Threadd t : queue) {
			System.out.println(t);
		}

		System.out.println("================================");
	}

}

public class OS_Scheduler {

	public static void main(String[] args) {

		CPU cpu = new CPU();

		Threadd t1 = new Threadd(1, "Open Chrome");
		Threadd t2 = new Threadd(2, "Download File");
		Threadd t3 = new Threadd(3, "Play Music");

		cpu.addTask(t1);
		cpu.addTask(t2);
		cpu.addTask(t3);
		cpu.displayAllTasks();

		cpu.executeTask();
	}
}
