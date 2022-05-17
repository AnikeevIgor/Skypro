package hm2;

public class Main {
    public static void main(String[] args) {
        // первое задание
        byte b = 126;
        short s = 32766;
        int i = 4;
        long l = 5L;
        float f = 5.5F;
        double d = 5.5;
        char c = 222;
        boolean bl = true;
//второе задание
        double OneBoxer = 78.2;
        double TwoBoxer = 82.7;
        System.out.println("Общий вес двух бойцов " + (OneBoxer+TwoBoxer) + " кг");
        System.out.println("разницу между весами бойцов " + (TwoBoxer-OneBoxer) + " кг");
        //третие задание
        double Bannan = 80;
        double Milk = 105;
        double Acecrime = 100;
        double Egs = 70;
        double mix = Bannan * 5 + Milk * 2 + Acecrime * 2 + Egs * 4 ;
        System.out.println(mix+" в гм");
        System.out.println((mix*0.001)+" в кг");
        // четвертое задание
        double Weight = 7;
        double OneProgram =7 / 0.25;
        double TwoProgram = 7 / 0.5;
        System.out.println(OneProgram + " дней по первой программе в 250 грамм в день");
        System.out.println(TwoProgram + " дней по второй программе в 500 грамм в день");
        System.out.println((OneProgram-TwoProgram) + " дней в среднем ");
        // пятое задание
        double Masha = 67760;
        double Denis = 83690;
        double Kristina = 76230;
        double NewMasha= Masha * 0.1 + Masha;
        double NewDenis = Denis * 0.1 + Denis;
        double NewKristina = Kristina * 0.1 + Kristina;
        System.out.println("Маша теперь получает " + NewMasha + " рублей. Годовой доход вырос на " +(NewMasha * 12 -Masha * 12)  + " рублей");
        System.out.println("Денис теперь получает " + NewDenis + " рублей. Годовой доход вырос на " +(NewDenis * 12 -Denis * 12)  + " рублей");
        System.out.println("Кристина теперь получает " + NewKristina + " рублей. Годовой доход вырос на " +(NewKristina * 12 -Kristina * 12)  + " рублей");
        }
    }

