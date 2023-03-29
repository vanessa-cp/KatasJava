package com.acenturef5.Katas;

import com.acenturef5.Katas.fizzbuzz.FizzBuzz;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class KataFizzBuzz {

	@BeforeEach
	void setUp(){
	}

	@Test
	void cuandoSeaMultiploPor3DevuelveFizz() {
		//GIVEN
		var fizzBuzz = new FizzBuzz();
		//WHEN
		var exect =  fizzBuzz.execute (3);
		//THEN
		assertEquals("Fizz", exect);


	}
	@Test
	void cuandoSeaMultiploPor5DevuelveBuzz() {
		//GIVEN
		var fizzBuzz = new FizzBuzz();
		//WHEN
		var exect =  fizzBuzz.execute (5);
		//THEN
		assertEquals("Buzz", exect);


	}

	@Test
	void cuandoSeaMultiploPor3y5DevuelveFizzBuzz() {
		//GIVEN
		var fizzBuzz = new FizzBuzz();
		//WHEN
		var exect =  fizzBuzz.execute (15);
		//THEN
		assertEquals("FizzBuzz", exect);


	}

	@Test
	void cuandoNoSeaMultiploDe3y5DevuelveUnNumero() {
		//GIVEN
		var fizzBuzz = new FizzBuzz();
		//WHEN
		var exect = fizzBuzz.execute(13);
		//THEN
		assertEquals("13", exect); // el 13 hay que pasarlo a integer en el FizzBuzz por que pide un numero y este es un string
	}


}
