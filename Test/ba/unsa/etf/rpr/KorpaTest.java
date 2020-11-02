package ba.unsa.etf.rpr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KorpaTest {

    @Test
    void dodajArtiklTrueTest() {
        Korpa korpa1= new Korpa();
        assertTrue(korpa1.dodajArtikl(new Artikl("Biciklo", 500, "1234")));

    }

    @Test
    void dodajArtiklFalseTest() {
        Korpa korpa1= new Korpa();
        for(int i = 0; i<50; i++)
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

    @Test
    void dajUkupnuCijenuArtikalaTest1() {
        Korpa korpa1 = new Korpa();
        korpa1.dodajArtikl(new Artikl("Biciklo", 500, "1"));
        korpa1.dodajArtikl(new Artikl("Biciklo", 500, "2"));
        korpa1.dodajArtikl(new Artikl("Biciklo", 500, "3"));
        assertEquals(1500, korpa1.dajUkupnuCijenuArtikala());
    }

    @Test
    void dajUkupnuCijenuArtikalaTest2() {
        Korpa korpa1 = new Korpa();
        assertEquals(0, korpa1.dajUkupnuCijenuArtikala());
    }
}