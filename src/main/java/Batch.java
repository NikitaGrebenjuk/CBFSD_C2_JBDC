public class Batch {
    private int batchID;
    private String batchName;
    public Batch() {
        super();
    }

    public Batch(String batchName) {
        this.batchName = batchName;
    }

    public int getBatchID() {
        return batchID;
    }

    public void setBatchID(int batchID) {
        this.batchID = batchID;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    @Override
    public String toString() {
        return "Batch{" +
                "batchName='" + batchName + '\'' +
                '}';
    }
}