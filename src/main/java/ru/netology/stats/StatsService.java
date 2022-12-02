package ru.netology.stats;


public class StatsService {
    public long sum(long[] sales) { //сумма всех продаж
        long result = 0;
        for (long sale : sales) {
            result += sale; // result = result + sale
        }

        return result;
    }

    public long average(long[] sales) { //средняя сумма всех продаж в месяц
        return sum(sales) / sales.length;

    }

    public int maximum(long[] sales) { // номер месяца в котором был минимум продаж то есть осуществлены продажи на максимальную сумму
        int maximumMonth = 0;
        long maximumSale = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maximumSale) {
                maximumSale = sales[i];
                maximumMonth = i;
            }
        }
        return maximumMonth + 1;

    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        long minSales = sales[0]; // переменная для индекса рассматриваемого месяца в массиве

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= minSales) {
                minSales = sales[i];
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int bellowAverage(long[] sales) {
        long averageSale = average(sales);
        int counter = 0; //заводим переменнную где будем хранить значение
        for (long sale : sales) { //перебираем значения  в массиве
            if (sale < average(sales)) { // если очередное значение меньше среднего то увеличиваем счетчик
                counter++; //увеличиваем
            }
        }
        return counter;
    }

    public int aboveAverage(long[] sales) {
        long averageSale = average(sales);
        int counter = 0; //заводим переменнную где будем хранить значение
        for (long sale : sales) { //перебираем значения  в массиве
            if (sale > average(sales)) { // если очередное значение меньше среднего то увеличиваем счетчик
                counter++; //увеличиваем
            }
        }
        return counter;
    }


}
