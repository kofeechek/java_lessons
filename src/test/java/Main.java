public class Main {
    public static void main(String[] args) {

        //Операции с типом данных int
        System.out.println(125 + 156);
        System.out.println(135 - 12);
        System.out.println(12 * 11);
        System.out.println(45 / 9);

        //Операции с разными типами данных
        System.out.println(16 + 15 - 1.5);
        System.out.println(1.6 + 1.5 - 1);

        //Логические операции
        System.out.println(16 > 10);
        System.out.println(10 <= 16);
        System.out.println(10 == 16);
        System.out.println(1 != 2);

        //Переполнение

        int maxInt = Integer.MAX_VALUE;
        int resultMaxInt = maxInt + 1000;

        System.out.println(resultMaxInt);
    }
}