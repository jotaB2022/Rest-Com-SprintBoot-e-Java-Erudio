package Startup;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Startup.converties.NumberConverter;
import Startup.exceptions.UnsupportedMathOperationException;
import Startup.operationsMath.SimpleMath;

@RestController
@RequestMapping("/calc")
public class Calculator {

	SimpleMath sm = new SimpleMath();
	
	@GetMapping(value = "sum/{numberOne}/{numberTwo}")
	public Double sum(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {

		if (!NumberConverter.isNumber(numberOne) || !NumberConverter.isNumber(numberTwo)) {
			throw new UnsupportedMathOperationException("Please Set Value");
		}

		return sm.sum(NumberConverter.converToDouble(numberOne), NumberConverter.converToDouble(numberTwo));
	}

	@GetMapping(value = "/mult/{numberOne}/{numberTwo}")
	public Double mult(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {

		if (!NumberConverter.isNumber(numberOne) || !NumberConverter.isNumber(numberTwo)) {
			throw new UnsupportedMathOperationException("Please Set Value");
		}

		return sm.mult(NumberConverter.converToDouble(numberOne), NumberConverter.converToDouble(numberTwo));
	}

	@GetMapping(value = "/div/{numberOne}/{numberTwo}")
	public Double div(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {

		if (!NumberConverter.isNumber(numberOne) || !NumberConverter.isNumber(numberTwo)) {
			throw new UnsupportedMathOperationException("Please Set Value");
		}

		return sm.div(NumberConverter.converToDouble(numberOne), NumberConverter.converToDouble(numberTwo));
	}

	@GetMapping(value = "/media/{numberOne}/{numberTwo}")
	public Double media(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {

		if (!NumberConverter.isNumber(numberOne) || !NumberConverter.isNumber(numberTwo)) {
			throw new UnsupportedMathOperationException("Please Set Value");
		}

		return sm.media(NumberConverter.converToDouble(numberOne), NumberConverter.converToDouble(numberTwo));
	}

	@GetMapping(value = "/raiz/{numberOne}/{numberTwo}")
	public Double raiz(@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) throws Exception {

		if (!NumberConverter.isNumber(numberOne) || !NumberConverter.isNumber(numberTwo)) {
			throw new UnsupportedMathOperationException("Please Set Value");
		}

		return sm.raiz(NumberConverter.converToDouble(numberOne), NumberConverter.converToDouble(numberTwo));
	}

}
