package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @org.junit.jupiter.api.Test
    void shoudCalculateSum() {
        StatsService servise = new StatsService();
        int[] sales = {18,20,25,35,45};
        int expected = 143;

        int actual = servise.calculateSum(sales);

        assertEquals(expected,actual);
        
    }

}