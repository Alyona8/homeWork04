public class Main {
    public static void main(String[] args) {
        //Задание 1
        int i = 1;
        while (i<=10) {
            System.out.print(i+" ");
            i++;
        }
        System.out.print("\n");
        for (i=10; i>=1; i--) {
            System.out.print(i + " ");
        }
        System.out.print("\n");


        //Задание 2
        for (int friday = 5; friday <= 31; friday++) {
            if (friday % 7 == 5) {
                System.out.println("Сегодня пятница, "+ friday + "-е число. Необходимо подготовить отчет.");
            }
        }


        //Задание 3
        for (int year = 2022 - 200; year <= 2022 + 100; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }


        //Задание 4
        for (int y=1; y<=30; y++) {
            if (y % 3 == 0 && y % 5 == 0) {
                System.out.println(y + ": ping pong");
            } else if (y % 3 == 0) {
                System.out.println(y + ": ping");
            } else if (y % 5 == 0) {
                System.out.println(y + ": pong");
            } else {
                System.out.println(y + ": ");
            }
        }


        //Задание 5
        int a = 0;
        int b = 1;
        int c;
        System.out.print(a+" "+b+" ");
        for(int d = 2; d < 10; d++){
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}