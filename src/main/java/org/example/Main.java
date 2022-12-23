package org.example;

public class Main {
    public static void main(String[] args) {

        Input input1 = new Input();
        Batch batch1 = new Batch();
        input1.startDialog(batch1);
        input1.getScanner().close();
        batch1.startBatch();
    }
}