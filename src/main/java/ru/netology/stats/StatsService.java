package ru.netology.stats;

public class StatsService {


    public int calculateSum(int[] sales) {

        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }

        return sum;
    }

    public int calculateAverage(int[] sales) {


        return calculateSum(sales) / sales.length;
    }


    public int calculateMaxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {

            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }


    public int calculateMinSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }


    public int calculateAmountMonthBelowAvg(int[] sales) {

        int amountMonthBelowAvg = 0;
        int average = calculateAverage(sales);

        for (int sale : sales) {
            if (sale < average) {
                amountMonthBelowAvg = amountMonthBelowAvg + 1;
            }
        }
        return amountMonthBelowAvg;
    }


    public int calculateAmountMonthAboveAvg(int[] sales) {

        int amountMonthAboveAvg = 0;
        int average = calculateAverage(sales);

        for (int sale : sales) {
            if (sale > average) {
                amountMonthAboveAvg = amountMonthAboveAvg + 1;
            }
        }
        return amountMonthAboveAvg;
    }
}



