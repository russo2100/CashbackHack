package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void remainTest1() {
        CashbackHackService service = new CashbackHackService();
        int expected = 100;
        int amount = 900;

        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }

    @Test
    public void remainTest2() {
        CashbackHackService service = new CashbackHackService();
        int expected = 0;
        int amount = 1400;

        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }
}