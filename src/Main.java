public class Main {
    public static void main(String[] args) {
        int camelCase = 1; // 1 задание
        System.out.println("Значение переменной camelCase с типом int равно " + camelCase);
        byte typeByte = 2;
        System.out.println("Значение переменной typeByte с типом byte равно " + typeByte);
        short typeShort = 3;
        System.out.println("Значение переменной typeShort с типом short равно " + typeShort);
        long typeLong = 4;
        System.out.println("Значение переменной typeLong с типом long равно " + typeLong);
        float typeFloat = 1.5F;
        System.out.println("Значение переменной typeFloat с типом float равно " + typeFloat);
        double typeDouble = 2.5;
        System.out.println("Значение переменной typeDouble с типом double равно " + typeDouble);

        float q = 27.12F; // 2 задание
        System.out.println(q);
        int nePonimau1 = 987;
        int nePonimau2 = 678;
        int nePonimau3 = 965;
        int nePonimau4 = 549;
        System.out.println(nePonimau1 +" "+ nePonimau2 +" "+ nePonimau3 +" "+ nePonimau4);
        double e = 2.786;
        System.out.println(e);
        boolean a = false;
        System.out.println(a);
        int s = 569;
        System.out.println(s);
        short d = -159;
        System.out.println(d);
        long w = 27897;
        System.out.println(w);
        byte f = 67;
        System.out.println(f + ".");

        int ludmilaIvanovna = 23; // 3 задание
        int annaSergeevna = 27;
        int ekaterinaAndreevna = 30;
        int listoff = 480;
        int allStudents = ludmilaIvanovna + annaSergeevna + ekaterinaAndreevna;
        System.out.println("Всего учеников " + allStudents + ".");
        int kajdomy = listoff / allStudents;
        System.out.println("На каждого ученика рассчитано " + kajdomy + " листов бумаги.");

        int proisvod = 16; // 4 задание
        int timeproisvod = 2;
        int proisvodZaMin = proisvod / timeproisvod;
        System.out.println("Производительность машины за 1 минуту = " + proisvodZaMin);
        int proisvodZa20Min = (proisvodZaMin * 20);
        System.out.println("За 20 минут машина произвела бутылок " + proisvodZa20Min + " штук.");
        int proisvodZaHrs = proisvodZa20Min * 3;
        int proisvodDay = proisvodZaHrs * 24;
        System.out.println("За 1 день машина произвела бутылок " + proisvodDay + " штук.");
        int proisvod3Day = proisvodDay * 3;
        System.out.println("За 3 дня машина произвела бутылок " + proisvod3Day + " штук.");
        int proisvodMes = proisvod3Day * 10;
        System.out.println("За 1 месяц машина произвела бутылок " + proisvodMes + " штук.");

        short bankas = 120; // 5 задание
        byte NaOdinClass = 6;
        int allClass = bankas / NaOdinClass;
        int white = allClass * 2;
        int black = bankas - white;
        System.out.println("В школе, где " + allClass + " классов, нужно " + white + " банок белой краски и " + black + " банок коричневой краски");

        int banan = 80; // 6 задание
        int milk = 105;
        int plombir = 100;
        int eggs = 70;
        int bananWeight = banan * 5;
        int milkWeight = milk * 2;
        int plombirWeight = plombir * 2;
        int eggsWeight = eggs * 4;
        int allWeightGramm = bananWeight + plombirWeight + milkWeight + eggsWeight;
        System.out.println("Спортивный завтрак весит " + allWeightGramm + " гр.");
        float allWeightKg = allWeightGramm / 1000F;
        System.out.println("Спортивный завтрак весит " + allWeightKg + " кг.");

        int oneDay = 250; // 7 задание
        int allgr = 7000;
        int allDays = allgr / oneDay;
        System.out.println("За " + allDays + " дней сбросит 7 кг, при потере ежедневно 250 гр.");
        int oneDay2 = 500;
        int allgr2 = 7000;
        int allDays2 = allgr2 / oneDay2;
        System.out.println("За " + allDays2 + " дней сбросит 7 кг, при потере ежедневно 500 гр.");
        int oneDay3 = (oneDay2 + oneDay) / 2;
        int allgr3 = 7000;
        int allDays3 = allgr3 / oneDay3 ;
        System.out.println("В среднем за " + allDays3 + " дней сбросит 7 кг.");

        int masha = 67760; // 8 задание
        int masha10P = masha / 10;
        int mashaPlus = masha + masha10P;
        int mashaGod = masha * 12;
        int mashaGodPlus = mashaPlus * 12;
        int mashaRaz = mashaGodPlus - mashaGod;
        System.out.println("Маша теперь получает " + mashaPlus + " рублей. Годовой доход вырос на " + mashaRaz + " рублей");
        int denis = 83690;
        int denis10P = denis / 10;
        int denisPlus = denis + denis10P;
        int denisGod = denis * 12;
        int denisGodPlus = denisPlus * 12;
        int denisRaz = denisGodPlus - denisGod;
        System.out.println("Денис теперь получает " + denisPlus + " рублей. Годовой доход вырос на " + denisRaz + " рублей");
        int kris = 76230;
        int kris10P = kris / 10;
        int krisPlus = kris + kris10P;
        int krisGod = kris * 12;
        int krisGodPlus = krisPlus * 12;
        int krisRaz = krisGodPlus - krisGod;
        System.out.println("Кристина теперь получает " + krisPlus + " рублей. Годовой доход вырос на " + krisRaz + " рублей");
    }
}