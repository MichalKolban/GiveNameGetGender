import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("podaj imie");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int lenght = name.length();
        char lastLetter = name.charAt(lenght-1);
        if (lastLetter == 'a'){
            System.out.println("To jest kobieta");
        }
        else{
            System.out.println("To jest prawdziwy samiec alfa");
        }
    }
}
