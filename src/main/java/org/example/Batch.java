package org.example;

import java.util.ArrayList;

public class Batch {
    private ArrayList<Participant> participantsList;
    private int bid;
    private String batchName;

    public Batch(ArrayList<Participant> participantsList, String batchName) {
        this.participantsList = participantsList;
        this.bid = this.hashCode();
        this.batchName = batchName;
    }

    public Batch() {
        this.bid = this.hashCode();
    }

/*    public String getParticipantsList() {
        StringBuffer result = new StringBuffer("");
        participantsList.forEach(participant -> {result.append(participant.getName() + " ");});
        return result.toString();
    }*/


    public void setParticipantsList(ArrayList<Participant> participantsList) {
        this.participantsList = participantsList;
    }

    public void addParticipant(Participant participant){
        this.participantsList.add(participant);
    }
    public void  removeParticipant(Participant participant){
        this.participantsList.remove(participant);
    }
    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public void greetParticipant(Callback participant){
        participant.greetings();
    }
    public void greetAllParticipants(){
        participantsList.forEach(participant -> greetParticipant(participant));
    }
    public void startBatch(){
        greetAllParticipants();
        System.out.println(getBatchName() + "-Batch started.");
    }
}
