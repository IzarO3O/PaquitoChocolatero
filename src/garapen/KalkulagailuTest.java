package garapen;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KalkulagailuTest {

	@Test
	void testBatuketa() {
		int resultado = Kalkulagailu.batuketa(3, 6);
		int esperado = 9;
		assertEquals(esperado, resultado);
	}
	void testBiderketa(){
		int resultado = Kalkulagailu.biderketa(2, 3);
		int esperado = 6;
		assertEquals(esperado, resultado);
	}
	void testZatiketa() {
		int resultado = Kalkulagailu.kenketa(6, 2);
		int esperado = 4;
		assertEquals(esperado, resultado);
	}

}
