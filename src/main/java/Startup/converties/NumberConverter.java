package Startup.converties;

public class NumberConverter {

	public static boolean isNumber(String strNumber) {
		if (strNumber == null)
			return false;
		String num = strNumber.replaceAll(",", ".");
		return num.matches("[-+]?[0-9]*\\.?[0-9]+");
	}

	public static Double converToDouble(String strNumber) {
		if (strNumber == null)
			return 0D;
		String number = strNumber.replaceAll(",", ".");
		if (isNumber(number))
			return Double.parseDouble(number);
		return 0D;
	}

}
