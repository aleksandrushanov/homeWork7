public class Main {
    public static void main(String[] args) {
        System.out.println("задание 1");

        ////Задание 1

        int salary = 15000;
        int total = 0;
        int i = 0;
        while (total < 1_000_000) {
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");
            i++;
        }
        ////Задание 2
        int a = 1;
        while (a <= 10) {
            System.out.print(a + " ");
            a++;
        }
        System.out.println("\n");
        for (a = 10; a >= 1; a--) {
            System.out.print(a + " ");
        }
        System.out.println("\n");
        /// Задание 3
        int country = 12_000_000;
        int birthRate = 17;
        int mortality = 8;
        int totalForTheYear = country / 1000 * (birthRate - mortality);
        for (int v = 1; v <= 10; v++) {
            country = country + totalForTheYear;
            System.out.println("Год " + v + " численность населения составляет " + country);
        }
        System.out.println("задание 2");
        //задание 1
        int contribution = 15000;
        int months = 0;
        while (contribution < 12_000_000) {
            contribution = contribution + contribution / 100 * 7;
            months++;
            System.out.println(months + "-й месяц, сумма накоплений " + contribution);
        }

        //задание 2
        int contribution2 = 15000;
        int months2 = 0;
        while (contribution2 < 12_000_000) {
            contribution2 = contribution2 + contribution2 / 100 * 7;
            months2++;
            if (months2 % 6 == 0) {
                System.out.println(months2 + "-й месяц, сумма накоплений " + contribution2);
            }
            //задание 2
            System.out.println("\n");




            }


        }
    }



