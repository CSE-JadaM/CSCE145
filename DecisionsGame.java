import java.util.Scanner;

public class DecisionsGame {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        String contestant1Prize = "nothing";
        String contestant2Prize = "nothing";

        String markerPrize = "a red marker";
        String deskPrize = "a black pen";
        String bagPrize = "a kit kat";

        System.out.println("Contestant1: I will give you this marker. Would you like to keep it or trade it with what's on my desk or what's in my bag? Enter \"keep\", \"desk\", or \"bag\":");
        
        String response = key.next();

        if (response.equalsIgnoreCase("desk")) {
            contestant1Prize = deskPrize;

            System.out.println("Contestant2: Would you like to keep the marker or trade it with what's in my bag? Enter \"keep\" or \"bag\":");

            response = key.next();

            if (response.equalsIgnoreCase("bag")) {
                contestant2Prize = bagPrize;
            } else {
                contestant2Prize = markerPrize;
            }
        } else if (response.equalsIgnoreCase("bag")) {
            contestant1Prize = bagPrize;

            System.out.println("Contestant2: Would you like to keep the marker or trade it with what's on my desk? Enter \"keep\" or \"desk\":");

            response = key.next();

            if (response.equalsIgnoreCase("desk")) {
                contestant2Prize = deskPrize;
            } else {
                contestant2Prize = markerPrize;
            }
        } else if (response.equalsIgnoreCase("keep")) {
            contestant1Prize = markerPrize;

            System.out.println("Contestant2: Would you like to pick what's on my desk or what's in my bag? Enter \"desk\" or \"bag\":");

            response = key.next();

            if (response.equalsIgnoreCase("desk")) {
                contestant2Prize = deskPrize;
            } else {
                contestant2Prize = bagPrize;
            }
        } else {
            System.out.println("Invalid choice for Contestant1.");
        }

        System.out.println("Contestant1's prize: " + contestant1Prize);
        System.out.println("Contestant2's prize: " + contestant2Prize);

        key.close();
    }
}