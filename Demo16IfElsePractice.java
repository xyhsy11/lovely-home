public class Demo16IfElsePractice {
	public static void main (String[] args) {
		int score = 98;
		if (score >= 90 && score <= 100) {
			System.out.println("Your grade is excellent");
		} else if (score >= 80 && score < 90) {
			System.out.println("Your grade is good");
		} else if (score >= 70 && score < 80) {
			System.out.println("Your grade is fine");
		} else if (score >= 60 && score < 70) {
			System.out.println("You just pass the exam");
		} else if (score >= 0 && score < 60) {
			System.out.println("You failed");
		} else {
			System.out.println("Your grade was mistakenly operated into the computer");
		}
	}
}