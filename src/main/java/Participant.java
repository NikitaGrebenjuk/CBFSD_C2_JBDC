public class Participant {
    private int pid;
    private String name;
    private String batchName;

    public Participant(String name, String batchName) {
        this.name = name;
        this.batchName = batchName;
    }

    public int getpid() {
        return pid;
    }

    public void setpid() {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    @Override
    public String toString() {
        return "Participant{" +
                "name='" + name + '\'' +
                '}';
    }
}
