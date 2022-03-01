package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // using switch, print if is weekday or weekend
        // 1 represents sunday
        byte day = 7;
        String weekend = "Weekend";
        String weekday = "Weekday";
        switch (day) {
            case 1:
            case 7:
                System.out.println(weekend);
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println(weekday);
                break;
            default:
                System.out.println("Invalid Option!");
                break;
        }
    }
}
