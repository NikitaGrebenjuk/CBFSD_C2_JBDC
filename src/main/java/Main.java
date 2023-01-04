import java.util.Scanner;

    public class Main {
        // JDBC driver name and database URL
        public static void main(String[] args) {
            ParticipantService partServ = new ParticipantService();
            System.out.print(partServ.getAllParticipants().toString());

            Scanner scanner = new Scanner(System.in);

            System.out.print("\nEnter the ID of participant: ");
            //String batchName = scanner.nextLine();
            int pid =scanner.nextInt();

            Participant participant = partServ.getParticipantByID(pid);
            System.out.print(participant.toString());


            System.out.print("Update participant with ID: ");
            int pidUpdate = scanner.nextInt();

            System.out.print("Update participant BatchID: ");
            int batchID = scanner.nextInt();

            System.out.print("enter new participant name: ");
            String name = scanner.nextLine();
            name = scanner.nextLine();




            partServ.updateParticipant(pidUpdate,name,batchID);
        }
    }
