package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int number1 = 10;
        int number2 = 20;
        double result = number1 / (double) number2;
        System.out.println(result);

        // %
        int rest = 21 % 7;
        System.out.println(rest);

        // <> <= >= == !=
        boolean isTenBiggerThanTwenty = 10 > 20;
        boolean isTenSmallerThanTwenty = 10 < 20;
        boolean isTenEqualsTwenty = 10 == 20;
        boolean isTenEqualsTen = 10 == 10;
        boolean isTenDifferentThanTen = 10 != 10;
        System.out.println("isTenBiggerThanTwenty: " + isTenBiggerThanTwenty);
        System.out.println("isTenSmallerThanTwenty: " + isTenSmallerThanTwenty);
        System.out.println("isTenEqualsTwenty: " + isTenEqualsTwenty);
        System.out.println("isTenEqualsTen: " + isTenEqualsTen);
        System.out.println("isTenDifferentThanTen: " + isTenDifferentThanTen);

        // && (AND) || (OR) !
        int age = 29;
        float payment = 3500F;
        boolean isInsideLawOlderThanThirty = age >= 30 && payment >= 4612;
        boolean isInsideLawNewerThanThirty = age < 30 && payment >= 3381;
        System.out.println("isInsideLawOlderThanThirty: " + isInsideLawOlderThanThirty);
        System.out.println("isInsideLawNewerThanThirty: " + isInsideLawNewerThanThirty);

        double totalValueCheckingAccount = 200;
        double totalValueSavingsAccount = 10000;
        float playstationValue = 5000;
        boolean isPlaystationBuyable =
                totalValueCheckingAccount > playstationValue || totalValueSavingsAccount > playstationValue;
        System.out.println("isPlaystationBuyable: " + isPlaystationBuyable);

        // = += -= *= /= %=
        double bonus = 1800; // 1800
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        // ++ --
        int counter = 0;
        counter++; // counter = counter + 1
        counter--;
        ++counter;
        --counter;
        int counter2 = 0;
        System.out.println(++counter2);
    }
}
