
public class Test2 {
	
	public static void main(String[] args) {
		if (args.length == 0) {
			return;
		}
		///testt2受け取った引数を数値に変換する
		int max = Integer.parseInt(args[0]);
		String result = null;
		///定型分で繰り返し
		for (int i = 0; i < max; i++) {
			int num = i + 1;
			result = "";
			if (num % 3 == 0) {
				result = result + "Fizz";
			}
			if (num % 5 == 0) {
				result = result + "Buzz";
			}
			if (result.length() == 0) {
				result = result + num;
			}
			System.out.print(result + " ");
		}
		
		

}
