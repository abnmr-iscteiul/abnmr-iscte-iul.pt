package Projeto_ES2.Projeto_ES2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AmostraTest {

	@Test
	public void testSquare() {
		Amostra test=new Amostra();
		int output=test.square(5);
		assertEquals(25, output);
	}
	
	@Test
	public void testSum() {
		Amostra test=new Amostra();
		int output=test.sum(5);
		assertEquals(10, output);
	}
}
