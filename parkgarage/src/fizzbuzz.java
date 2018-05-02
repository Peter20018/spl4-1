
public class fizzbuzz {

	public static void main(String[] args) throws InterruptedException{
		for (int i = 1; i<=100;i++) {
			if (i%3==0 && i%5!=0) {
				System.out.println("Fizz");
			} else if (i%5==0&& i%3!=0) {
				System.out.println("Buzz");
			} else if (i%5== 0 && i % 3 ==0) {
				System.out.println("Fizzbuzz");
			} else {
				System.out.println(i);
			}
			Thread.sleep(200);
		}

	}

}
