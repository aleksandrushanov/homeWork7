public class Main {
    public static void main(String[] args) {
        System.out.println("задание 1");

        ////Задание 1

        int salary = 15000;
        int total = 0;
        int numberOfMonths = 0;
        while (total < 1_000_000) {
            total = total + total / 100;
            total = total + salary;
            System.out.println("Месяц " + numberOfMonths + " сумма накоплений равна " + total + " рублей");
            numberOfMonths++;
        }
        System.out.println("\n");
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
        long population = 12_000_000;
        int newborns=17;
        int mortality=8;
        int populationGrowth = newborns - mortality;
        int years=0;
        while (years<10){
            population = population + (population * populationGrowth)/1000;
            years++;
            System.out.println("Год " + years + " численность населения составляет " + population);
        }


        System.out.println("\n");
        System.out.println("задание 2");
        //задание 1
        int contribution = 15000;
        int months = 0;
        while (contribution < 12_000_000) {
            contribution = contribution + contribution / 100 * 7;
            months++;
            System.out.println(months + "-й месяц, сумма накоплений " + contribution);
        }
        System.out.println("\n");
        //задание 2
        int contribution2 = 15000;
        int months2 = 0;
        while (contribution2 < 12_000_000) {
            contribution2 = contribution2 + contribution2 / 100 * 7;
            months2++;
            if (months2 % 6 == 0) {
                System.out.println(months2 + "-й месяц, сумма накоплений " + contribution2);
            }
        }
        System.out.println("\n");
        //задание 3
        int contribution3 = 15000;
        int months3 = 0;
        while (months3 < 108) {
            contribution3 = contribution3 + contribution3 / 100 * 7;
            months3++;
            if (months2 % 6 == 0) {
                System.out.println(months3 + contribution3);
                }
            }
        System.out.println("\n");
        //Задание 4
        int friday=7;
        while (friday<=31){
            System.out.println("Сегодня пятница " +friday + "-е число. Необходимо подготовить отчет");
            friday= friday+7;
        }
        System.out.println("задание 3");
        System.out.println("\n");
        //Задание1
        int ourYear=2022;
        int beforeOurYear=ourYear - 200;
        int afterOurYear= ourYear + 100;
        int year=0;
        while (year <=afterOurYear){
            year+=79;
            if (year>=beforeOurYear && year<=afterOurYear){
                System.out.println(year);
            }
        }
        System.out.println("\n");
        //Задание 2
        for (int table= 1;table <= 10; table++) {
            System.out.println("2 * " + table + "=" +  2 * table);
        }


    }


    }








