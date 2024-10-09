package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("1. Agregar tarea");
            System.out.println("2. Marcar tarea como completada");
            System.out.println("3. Mostrar tareas");
            System.out.println("4. Salir");

            int option = scanner.nextInt();
            scanner.nextLine(); // Consumir el salt de línia

            switch (option) {
                case 1:
                    // Agregar una nueva tarea
                    System.out.print("Introduce la descripción de la tarea: ");
                    String description = scanner.nextLine();
                    Task newTask = new Task(description);
                    tasks.add(newTask);
                    System.out.println("Tarea agregada: " + newTask);
                    break;
                case 2:
                    // Marcar una tarea como completada
                    System.out.println("Primera versió, marcat no implementat.");
                    break; // Placeholder
            }
        }
    }
}
