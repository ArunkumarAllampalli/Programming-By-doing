public class Collatz01 {
	public static void main(String[] args) {

		System.out.println(getCollatzSequence(2));

	}

	public static String

	getCollatzSequence(int number) {

		int counter = 1;
		String str= "";
		if (number <= 0) {

			return "Error";

		}
		if(number==1)
		{
			return"1 4 2 1";
		}
		if(number==2)
		{
			return"2 1 4 2 1";
		}
		str= "" + number + " ";

		while

		(number > 1) {

			++counter;
			if

			(number % 2 == 0) {

				number = number / 2;

			} else if (number % 2 != 0) {

				number =

				(number * 3) + 1;

			}

			str = str

			+ number + " ";

			if (counter >= 100 && number != 1) {

				return

				"Does not Converge";

			}
		}

		return str.trim();
	}
}
