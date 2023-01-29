package practical__04;

import java.util.Scanner;

public class task__03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Continent continent;
        System.out.println("Enter name of country: ");
        String country = scan.nextLine();
        switch (country) {
            case "England":
            case "Ukraine":
                continent = Continent.Europe;
                continent.toString();
                break;
            case "USA":
            case "Mexico":
                continent = Continent.America;
                continent.toString();
                break;
            case "Japan":
            case "India":
                continent = Continent.Asia;
                continent.toString();
                break;
            default:
                System.out.println("Please enter another country.");
        }

    }

}

