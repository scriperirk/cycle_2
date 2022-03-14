package ru.netology.stats;

public class StatsService {
    //Считаем сумму всех продаж.
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    //Считаем среднюю сумму продаж в месяц
    public int calculateAmountPerMonth(int[] sales) {
        return calculateSum(sales) / sales.length;
    }

    //Номер месяца, в котором был пик продаж
    public int calculateMonthMax(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    //Номер месяца, в котором был минимум продаж
    public int calculateMonthMin(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    //Кол-во месяцев, в которых продажи были ниже среднего
    public int calculateTheNumberIsBelowAverage(int[] sales) {
        int score = 0;
        int average = calculateSum(sales) / sales.length;
        for (int sale : sales) {
            if (sale < average) {
                score = score+1;
            }
        }
        return score;
    }

    //Кол-во месяцев, в которых продажи были выше среднего
    public int calculateTheNumberIsAboveAverage(int[] sales) {
        int score = 0;
        int average = calculateSum(sales) / sales.length;
        for (int sale : sales) {
            if (sale > average) {
                score = score+1;
            }
        }
        return score;
    }

}