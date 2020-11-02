package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketTest {

    @Test
    void dodajArtiklTrueTest() {
        Korpa korpa1= new Korpa();
        assertTrue(korpa1.dodajArtikl(new Artikl("Biciklo", 500, "1234")));

    }

    @Test
    void dodajArtiklFalseTest() {
        Korpa korpa1= new Korpa();
        for(int i = 0; i<1000; i++)
            korpa1.dodajArtikl(new Artikl("Biciklo", 500, "1234"));
        assertFalse(korpa1.dodajArtikl(new Artikl("Biciklo", 500, "1234")));

    }


    @Test
    void izbaciArtiklSaKodomTest() {
        Korpa korpa1 = new Korpa();
        korpa1.dodajArtikl(new Artikl("Biciklo", 500, "1234"));
        Artikl izbaceni = korpa1.izbaciArtiklSaKodom("1234");
        assertEquals("1234", izbaceni.getKod());


    }


}