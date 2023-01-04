import java.util.Scanner;

    public class Main {
        // JDBC driver name and database URL
        public static void main(String[] args) {
            ParticipantService partServ = new ParticipantService();
            System.out.println(partServ.getAllParticipants().toString());

            BatchService batchServ = new BatchService();
            System.out.println(batchServ.getAllBatches().toString());

            Participant participant = partServ.getParticipantByID(4);
            System.out.println(participant.toString());

            Batch batch = batchServ.getBatchById(1);
            System.out.println(batch.toString());

            partServ.updateParticipant(1, "Rosa", 2);
            batchServ.updateBatch(new Batch(0,"yogiliyo"));

            batchServ.deleteBatch(4);
            batchServ.addBatch(new Batch(15,"pilates"));
            System.out.println(partServ.getAllParticipants().toString());

            System.out.println(batchServ.getAllBatches().toString());
        }
    }
