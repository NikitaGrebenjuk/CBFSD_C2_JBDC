package org.example;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Input {
    public static final ArrayList phrases;
    static {
        phrases = new ArrayList();
        phrases.add("To create Batch type '1'. To add Participant type '2' "); //0
        phrases.add("Participant was created. Type anything to continue");//1
        phrases.add("Batch was created. Type anything to continue");//2
        phrases.add("sorry, lets try again");//3
        phrases.add("Give a name of participant!"); //4
        phrases.add("Batch was created. Type anything to continue"); //5
        phrases.add("What is the batch about? Give it a name!"); //6
        phrases.add("If you want to create a(nother) participant, type '1', type anything else to finish creation of the batch!");//7
        phrases.add("Do you want to continue? Type 'yes' for YES or 'no' for NO");//8
    }

    Scanner scanner;

    public Input() {
        this.scanner = new Scanner(System.in);
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void startDialog(Batch batch){
        ArrayList<Participant> listOfParticipants = new ArrayList<>();
        batch.setParticipantsList(listOfParticipants);
        // starting the diaolog

        System.out.println(phrases.get(8));
        while(scanner.next().equalsIgnoreCase("yes")){
            System.out.println(phrases.get(0));
            String usersChoice = scanner.next();
            if(usersChoice.equals("2")){//create Participant
                listOfParticipants.add(createParticipant());
            }else if(usersChoice.equals("1")){// create Batch
                //create participants for your batch
                System.out.println(phrases.get(6));
                batch.setBatchName(scanner.next());
                System.out.println(phrases.get(7));
                while(scanner.next().equals("1")){
                    listOfParticipants.add(createParticipant());
                    System.out.println(phrases.get(7));
                }
            }
            System.out.println(phrases.get(8));
        }
    }


    public Participant createParticipant(){
        System.out.println(phrases.get(4));
        String participantName = scanner.next();
        return new Participant(participantName);
    }
}
