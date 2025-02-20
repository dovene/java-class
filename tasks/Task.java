package tasks;

import java.text.SimpleDateFormat;
import java.util.Date;

class Task {
    private int number;
    private String description;
    private int status;
    private Date deadline;

    public Task(int number, String description, int status, Date deadline) {
        this.number = number;
        this.description = description;
        this.status = status;
        this.deadline = deadline;
    }

    public int getNumber() {
        return number;
    }

    public String getDescription() {
        return description;
    }

    public int getStatus() {
        return status;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void display() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("Tache numéro:" + number + ": " + description +
                " | Statut: " + (status == 1 ? "Terminé" : "En cours") +
                " | Date limite: " + sdf.format(deadline));
    }
}