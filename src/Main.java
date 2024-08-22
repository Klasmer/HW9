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

        System.out.println("Задача 3");
        //Теперь бухгалтерия хочет понять, какую в среднем сумму компания тратила еженедельно.
        int[] cash = {1000, 1560, 1660, 6000, 7500};
        double sum1 = 0;
        for (int i = 0; i < cash.length; i++) {
            sum1 = sum1 + cash[i];
        }
        sum1 = sum1 / cash.length;
        System.out.println("Средняя сумма трат за месяц составила " + sum1 + " рубля");

        System.out.println("Задача 4");
        //Напишите код, который развернет содержимое массива, а затем распечатает его содержимое.
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >=0 ; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}









