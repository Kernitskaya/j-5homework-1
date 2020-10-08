package ru.maven.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void shouldCalculateRegisteredAndUnderLimit() {
        BonusService bonusService = new BonusService();

        long amount = 100060;
        boolean registered = true;
        long expected = 30;

        long actual = bonusService.calculate(amount, registered);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNotRegisteredAndUnderLimit() {
        BonusService bonusService = new BonusService();

        long amount = 100060;
        boolean registered = false;
        long expected = 10;

        long actual = bonusService.calculate(amount, registered);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateRegisteredAndLimit() {
        BonusService bonusService = new BonusService();

        long amount = 10000;
        boolean registered = true;
        long expected = 3;

        long actual = bonusService.calculate(amount, registered);
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateNotRegisteredAndLimit() {
        BonusService bonusService = new BonusService();

        long amount = 10000;
        boolean registered = false;
        long expected = 1;

        long actual = bonusService.calculate(amount, registered);
        assertEquals(expected, actual);
    }
}