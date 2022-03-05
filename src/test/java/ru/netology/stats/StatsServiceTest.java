package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shoudCalculateSum() {
        StatsService servise = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = servise.calculateSum(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shoudAmountPerMonth() {
        StatsService servise = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = servise.calculateAmountPerMonth(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shoudCalculateMonthMax() {
        StatsService servise = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = servise.calculateMonthMax(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shoudCalculateMonthMin() {
        StatsService servise = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = servise.calculateMonthMin(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shoudCalculateTheNumberIsBelowAverage() {
        StatsService servise = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = servise.calculateTheNumberIsBelowAverage(sales);

        assertEquals(expected, actual);
    }

    @Test
    void shoudCalculateTheNumberIsAboveAverage() {
        StatsService servise = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = servise.calculateTheNumberIsAboveAverage(sales);

        assertEquals(expected, actual);
    }
}