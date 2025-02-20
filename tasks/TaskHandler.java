package tasks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TaskHandler {

    private ArrayList<Task> taskList;
    private Scanner scanner;
    private SimpleDateFormat sdf;

    public TaskHandler() {
        taskList = new ArrayList<>();
        scanner = new Scanner(System.in);
        sdf = new SimpleDateFormat("dd/MM/yyyy");
    }

    public void addTask() {
        try {
            System.out.println("Saisir le numéro de la tâche:");
            int number = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Saisir la description:");
            String description = scanner.nextLine();

            System.out.println("Saisir le statut de la tâche (0 = En cours, 1 = Terminé):");
            int status = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Saisir la date limite ou de fin (dd/MM/yyyy):");
            String dateStr = scanner.nextLine();
            Date deadline = sdf.parse(dateStr);

            Task task = new Task(number, description, status, deadline);
            taskList.add(task);
            System.out.println("Ajout effectué avec succès!");
        } catch (ParseException e) {
            System.out.println("Format de date invalide. Veuillez utiliser le format suivant : dd/MM/yyyy");
        }
    }

    public void displayCompletedTasks() {
        System.out.println("\nLes tâches terminées:");
        for (Task task : taskList) {
            if (task.getStatus() == 1) {
                task.display();
            }
        }
    }

    public void displayInProgressTasks() {
        System.out.println("\nLes tâches en cours:");
        for (Task task : taskList) {
            if (task.getStatus() == 0) {
                task.display();
            }
        }
    }

    public void removeTask() {
        System.out.println("Saisir le numéro de la tâche à supprimer:");
        int number = scanner.nextInt();
        scanner.nextLine();

        List<Task> tasks = taskList.stream().filter(task -> task.getNumber() == number).collect(Collectors.toList());
        if (tasks == null) {
            System.out.println("Tâche non trouvée!");
            return;
        } else {
            taskList.removeIf(task -> task.getNumber() == number);
            System.out.println("Tâche supprimée");
        }
    }

    public void saveToFile() {
        try (PrintWriter writer = new PrintWriter(new FileWriter("tasks.txt"))) {
            for (Task task : taskList) {
                writer.println(task.getNumber() + "," +
                        task.getDescription() + "," +
                        task.getStatus() + "," +
                        sdf.format(task.getDeadline()));
            }
            System.out.println("Taches enregistrées dans le fichier avec succès!");
        } catch (IOException e) {
            System.out.println("Erreur d'enregistrement dans le fichier: " + e.getMessage());
        }
    }

    public void loadFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("tasks.txt"))) {
            taskList.clear();
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                Task task = new Task(
                        Integer.parseInt(parts[0]),
                        parts[1],
                        Integer.parseInt(parts[2]),
                        sdf.parse(parts[3]));
                taskList.add(task);
            }
            System.out.println("Tâches chargées avec succès depuis le fichier de sauvegarde!");
        } catch (IOException | ParseException e) {
            System.out.println("Erreur de chargement des tâches: " + e.getMessage());
        }
    }

    public void displayTasksBetweenDates() {
        try {
            System.out.println("Saisir la date de début (dd/MM/yyyy):");
            Date startDate = sdf.parse(scanner.nextLine());

            System.out.println("Saisir la date de fin (dd/MM/yyyy):");
            Date endDate = sdf.parse(scanner.nextLine());

            System.out
                    .println("\nTâches comprises entre " + sdf.format(startDate) + " et " + sdf.format(endDate) + ":");
            taskList.stream()
                    .filter(task -> !task.getDeadline().before(startDate) && !task.getDeadline().after(endDate))
                    .forEach(Task::display);
        } catch (ParseException e) {
            System.out.println("Format de date invalide. Veuillez utiliser le format suivant : dd/MM/yyyy");
        }
    }

    public void displayMenu() {
        while (true) {
            System.out.println("\n=== Task Manager Menu ===");
            System.out.println("1. Ajouter une tâche");
            System.out.println("2. Supprimer une tâche");
            System.out.println("3. Affiche la liste des tâches finies");
            System.out.println("4. Enregistrer la liste des tâches dans un fichier");
            System.out.println("5. Charger la liste des tâches depuis un fichier");
            System.out.println("6. Afficher la liste des tâches dont la date est comprise entre deux dates");
            System.out.println("7. Affiche la liste des tâches en cours");
            System.out.println("8. Quitter le programme");
            System.out.print("Saisir votre choix: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    removeTask();
                    break;
                case 3:
                    displayCompletedTasks();
                    break;
                case 4:
                    saveToFile();
                    break;
                case 5:
                    loadFromFile();
                    break;
                case 6:
                    displayTasksBetweenDates();
                    break;
                case 7:
                    displayInProgressTasks();
                    break;
                case 8:
                    System.out.println("Aurevoir!");
                    System.exit(0);
                default:
                    System.out.println("Choix invalide, veuillez ressaisir.");
            }
        }
    }
}