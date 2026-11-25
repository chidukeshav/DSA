package stack;

import java.util.Stack;

public class Recipeofcfe {
	private Stack<String> next_step;
	private Stack<String> previous_step;
	private String current_step;

	public Recipeofcfe() {
		next_step = new Stack<String>();
		previous_step = new Stack<String>();
		current_step = "Add Milk";
	}

	public void addStep(String step) {
		previous_step.push(current_step);
		current_step = step;
		next_step.clear();
	}

	public void previousStep() {
		if (!previous_step.isEmpty()) {
			next_step.push(current_step);
			current_step = previous_step.pop();
			System.out.println("The previous step is " + current_step);
		} else {
			System.out.println("there is no previous step");
		}
	}

	public void nextStep() {
		if (!next_step.isEmpty()) {
			previous_step.push(current_step);
			current_step = next_step.pop();
			System.out.println("the next step is " + current_step);
		} else {
			System.out.println("there is no next step");
		}
	}

	public String currentStep() {
		return current_step;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recipeofcfe r = new Recipeofcfe();
		r.addStep("Powder");
		r.addStep("Sugar");
		r.previousStep();
		System.out.println(r.currentStep());
	}

}
