package submission;

public class Review02 {

	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) {

			// 3かつ5で割り切れる場合
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");

				// 3で割り切れる場合
			} else if (i % 3 == 0) {
				System.out.println("Fizz");

				// 5で割り切れる場合
			} else if (i % 5 == 0) {
				System.out.println("Buzz");

				// 上記以外の場合
			} else {
				System.out.println(i);
			}
		}
	}
}
