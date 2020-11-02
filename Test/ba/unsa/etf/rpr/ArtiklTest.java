package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ArtiklTest {

    Artikl artikl = new Artikl("Biciklo", 500, "1234");

    @Test
    void getNazivTest() {
        assertEquals("Biciklo", artikl.getNaziv());
    }

    @Test
    void getKodTest() {
        assertEquals(500, artikl.getCijena());
    }

    @Test
    void getCijenaTest() {
        assertEquals("1234", artikl.getKod());
    }
}