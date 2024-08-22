public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        //Бухгалтеры попросили посчитать сумму всех выплат за месяц.
        //Создайте массив с пятью целочисленными элементами и задайте каждому элементу значение.
        //Напишите программу, которая решит эту задачу, и выведите в консоль результат в формате: «Сумма трат за месяц составила … рублей».
        int[] payments = {1000, 2000, 3500, 4000, 5000};
        int sum = 0;
        for (int index = 0; index < payments.length; index++) {
            sum = sum + payments[index];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");


        System.out.println("Задача 2");
        //Также бухгалтерия попросила найти минимальную и максимальную траты за неделю.
        int[] pay = {2500, 3000, 1000, 3300, 1111};
        int maxPay = -1;
        for (final int current : pay) {
            if (current > maxPay) {
                maxPay = current;
            }
        }
        int minPay = 90_000;
        for (final int current : pay) {
            if (current < minPay) {
                minPay = current;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minPay + " рублей. Максимальная сумма трат за неделю составила " + maxPay + " рублей");
    }


}






