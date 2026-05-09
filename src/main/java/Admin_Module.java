import java.util.HashMap;
import java.util.Scanner;

public class Admin_Module {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean AdminRunning = true;

        // LIST ID AND COMPLAINTS
        HashMap<Integer, String> complaints = new HashMap<Integer, String>();
        complaints.put(101, " Long Wait Times");
        complaints.put(102, " Poor Product Quality");
        complaints.put(103, " Misleading Product Descriptions");
        complaints.put(104, " Poor Product Quality");
        complaints.put(105, " Misleading Product Details");

        // LIST  ID AND COMPLAINTS STATUS
        HashMap<Integer, String> complaintsStatus = new HashMap<Integer, String>();
        complaintsStatus.put(101, " OPEN");
        complaintsStatus.put(102, " OPEN");
        complaintsStatus.put(103, " OPEN");
        complaintsStatus.put(104, " OPEN");
        complaintsStatus.put(105, " OPEN");

        // Protect Admin module with a PIN.
        System.out.println("............Admin............");
        System.out.println("Enter PIN number: ");
        int userPin = Integer.parseInt(input.nextLine());
        while (userPin != 12345) {
            System.out.println("Unsuccessful Login :( Try again.");
            System.out.println("Enter PIN : ");
            userPin = Integer.parseInt(input.nextLine());
        }
        System.out.println("Successful Login :) ");
        while (AdminRunning) {
            System.out.println("Admin choices:\n1. View all complaints.\n" +
                    "2. Search complaint by ID.\n" +
                    "3. Close a complaint.\n" + "4. Support Staff.\n5. Exit.");
            int Adminchoice = Integer.parseInt(input.nextLine());

            //View all complaints
            if (Adminchoice == 1) {
                System.out.println("*********** View all complaints ***********");
                System.out.println(" The complaints list: \n" + complaints);

                // Search complaint by ID
            } else if (Adminchoice == 2) {
                System.out.println("*********** Search complaint by ID ***********");
                System.out.println("Enter ID for search: ");
                int id = Integer.parseInt(input.nextLine());

                // Search complaint by ID.
                if (complaints.containsKey(id)) {
                    String complaint = complaints.get(id);
                    System.out.println(complaint);
                } else {
                    System.out.printf(" This Id: %d does not exist.", id);
                }



            }
        }
    }
}