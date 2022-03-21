package com.kodilla.stream.world;


import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class WorldTestSuite {

    @Test
    void testGetPeopleQuantity() {
        //Given
        World world = new World();
        Continent continent1 = new Continent();
        Continent continent2 = new Continent();
        Continent continent3 = new Continent();
        Continent continent4 = new Continent();
        Continent continent5 = new Continent();

        //When
        continent1.addCountry(new Country("Poland", new BigDecimal("3353567")));
        continent1.addCountry(new Country("Germany", new BigDecimal("759641")));
        continent2.addCountry(new Country("USA", new BigDecimal("993453567")));
        continent3.addCountry(new Country("Brazil", new BigDecimal("4565465314")));
        continent3.addCountry(new Country("Argentina", new BigDecimal("5145613215")));
        continent4.addCountry(new Country("Morocco", new BigDecimal("54654896321")));
        continent5.addCountry(new Country("Japan", new BigDecimal("1976434")));
        continent5.addCountry((new Country("Russia", new BigDecimal("1456458963"))));

        world.addContinent(continent1);
        world.addContinent(continent2);
        world.addContinent(continent3);
        world.addContinent(continent4);
        world.addContinent(continent5);

        BigDecimal quantity = world.getPeopleQuantity();
        BigDecimal expectedQuantity = new BigDecimal("66821977022");

        //Then
        assertEquals(expectedQuantity, quantity);
    }

    @Test
    void testGetPeopleQuantityIfNoCountries() {
        //Given
        World world = new World();
        Continent continent1 = new Continent();
        Continent continent2 = new Continent();
        Continent continent3 = new Continent();
        Continent continent4 = new Continent();
        Continent continent5 = new Continent();

        //When
        world.addContinent(continent1);
        world.addContinent(continent2);
        world.addContinent(continent3);
        world.addContinent(continent4);
        world.addContinent(continent5);

        BigDecimal quantity = world.getPeopleQuantity();
        BigDecimal expectedQuantity = new BigDecimal("0");

        //Then
        assertEquals(expectedQuantity, quantity);
    }
}