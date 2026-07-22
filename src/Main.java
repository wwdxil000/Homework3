public class Main {
    public static void main(String[] args) {
        // 1
        int numberOne = 2147480647;
        System.out.println("Значение переменной numberOne с типом int равно " + numberOne);
        byte numberTwo = 120;
        System.out.println("Значение переменной numberTwo с типом byte равно " + numberTwo);
        short numberThree = 30500;
        System.out.println("Значение переменной numberThree с типом short равно " + numberThree);
        long numberFour = 1234567890123456L;
        System.out.println("Значение переменной numberFour с типом long равно " + numberFour);
        float numberFive = 6.1111111f;
        System.out.println("Значение переменной numberFive с типом float равно " + numberFive);
        double numberSix = 6.23434242323535646;
        System.out.println("Значение переменной numberSix с типом double равно " + numberSix);
        // 2
        float a1 = 27.12f;
        System.out.println(a1);
        long a2 = 987678965549L;
        System.out.println(a2);
        float a3 = 2.786f;
        System.out.println(a3);
        short a4 = 569;
        System.out.println(a4);
        int a5 = -159;
        System.out.println(a5);
        int a6 = 27897;
        System.out.println(a6);
        byte a7 = 67;
        System.out.println(a7);
        // 3
        byte ln = 23;
        byte ac = 27;
        byte ea = 30;
        int sum = ln + ac + ea;
        System.out.println("На каждого ученика рассчитано " + 480 / sum + " листов бумаги");
        // 4
        byte oneMinute = 8;
        byte minute20 = 20;
        short day = 24 * 60;
        int day3 = day * 3;
        long month = day * 31;
        System.out.println("За 20 минут машина произвела " + oneMinute * minute20 + " штук бутылок");
        System.out.println("За сутки минут машина произвела " + oneMinute * day + " штук бутылок");
        System.out.println("За три дня минут машина произвела " + oneMinute * day3 + " штук бутылок");
        System.out.println("За месяц минут машина произвела " + oneMinute * month + " штук бутылок");
        // 5
        byte s = 120;
        byte b = 2;
        byte k = 4;
        int klass = s / (b + k);
        int s_b = klass * b;
        int s_k = klass * k;
        System.out.println("В школе, где " + klass + " классов, нужно " + s_b + " банок белой краски и " + s_k + " банок коричневой краски");
        // 6
        byte bananas = 80;
        int bananasW = 5 * bananas;
        byte milk = 105;
        int milkW = 2 * milk;
        byte icecream = 100;
        int icecreamW = icecream * 2;
        byte eggs = 4;
        int eggsW = eggs * 70;
        int summ = bananasW + milkW + icecreamW + eggsW;
        System.out.println("Вес в граммах - " + summ + ", а вес в килограммах - " + summ / 1000);
        // 7
        int goal = 7000;
        int minLoss = 250;
        int maxLoss = 500;
        int daysMin = goal / minLoss;
        int daysMax = goal / maxLoss;
        int daysAverage = (daysMin + daysMax) / 2;
        System.out.println("При потере 250 г в день потребуется " + daysMin + " дней");
        System.out.println("При потере 500 г в день потребуется " + daysMax + " дней");
        System.out.println("В среднем потребуется " + daysAverage + " дней");
        // 8
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        double rate = 0.10;
        double mashaN = masha * (1 + rate);
        double denisN = denis * (1 + rate);
        double kristinaN = kristina * (1 + rate);
        double mashaD = (mashaN - masha) * 12;
        double denisD = (denisN - denis) * 12;
        double kristinaD = (kristinaN - kristina) * 12;
        System.out.println("Маша теперь получает " + mashaN + " рублей. Годовой доход вырос на " + mashaD + " рублей.");
        System.out.println("Денис теперь получает " + denisN + " рублей. Годовой доход вырос на " + denisD + " рублей.");
        System.out.println("Кристина теперь получает " + kristinaN + " рублей. Годовой доход вырос на " + kristinaD + " рублей.");
    }
}