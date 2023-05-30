package Startup;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Startup.exceptions.UnsupportedMathOperationException;

@RestController
@RequestMapping("/calc")
public class Calculator {
	
	
	@GetMapping(value = "sum/{numberOne}/{numberTwo}")
	public Double sum(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {

		if (!isNumber(numberOne) || !isNumber(numberTwo)) {
			throw new UnsupportedMathOperationException("Please Set Value");
		}

		return converToDouble(numberOne) + converToDouble(numberTwo);
	}

	@GetMapping(value = "/mult/{numberOne}/{numberTwo}")
	public Double mult(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {

		if (!isNumber(numberOne) || !isNumber(numberTwo)) {
			throw new UnsupportedMathOperationException("Please Set Value");
		}

		return converToDouble(numberOne) * converToDouble(numberTwo);
	}

	@GetMapping(value = "/div/{numberOne}/{numberTwo}")
	public Double div(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {

		if (!isNumber(numberOne) || !isNumber(numberTwo)) {
			throw new UnsupportedMathOperationException("Please Set Value");
		}

		return converToDouble(numberOne) / converToDouble(numberTwo);
	}

	@GetMapping(value = "/media/{numberOne}/{numberTwo}")
	public Double media(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {

		if (!isNumber(numberOne) || !isNumber(numberTwo)) {
			throw new UnsupportedMathOperationException("Please Set Value");
		}

		return (converToDouble(numberOne) + converToDouble(numberTwo)) / 2;
	}

	@GetMapping(value = "/raiz/{numberOne}/{numberTwo}")
	public Double raiz(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {

		if (!isNumber(numberOne) || !isNumber(numberTwo)) {
			throw new UnsupportedMathOperationException("Please Set Value");
		}

		return Math.pow(converToDouble(numberOne) , 2.0) +  Math.pow(converToDouble(numberTwo) , 2.0);
	}

	private boolean isNumber(String strNumber) {
		if (strNumber == null)
			return false;
		String num = strNumber.replaceAll(",", ".");
		return num.matches("[-+]?[0-9]*\\.?[0-9]+");
	}

	private Double converToDouble(String strNumber) {
		if (strNumber == null)
			return 0D;
		String number = strNumber.replaceAll(",", ".");
		if (isNumber(number))
			return Double.parseDouble(number);
		return 0D;
	}

}
