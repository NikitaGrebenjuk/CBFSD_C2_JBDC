package org.example;

public class Participant implements Callback {
    private int id;
    private String name;
    private String email;
    private String phone;
    private String project;

    private Batch batch;

    public Batch getBatch() {
        return batch;
    }

    public void setBatch(Batch batch) {
        if (this.batch!= null){
            this.batch.removeParticipant(this);
        }
        this.batch = batch;
        this.batch.addParticipant(this);
    }

    public Participant(String name, String email, String phone, String project) {
        this.id = this.hashCode();
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.project = project;
    }

    public Participant(String name) {
        this.id = this.hashCode();
        this.name = name;
        this.email = "email";
        this.phone = "phone";
        this.project = "project";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }


    @Override
    public void greetings() {
        System.out.println("Goood Morning " + this.name);
    }
}
