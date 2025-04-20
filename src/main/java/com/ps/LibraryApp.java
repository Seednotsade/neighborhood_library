package com.ps;

import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Book[] library = new Book[20];
        String[] books = {
                "Hope", "Dream", "Journey", "Shadow", "Light",
                "Whisper", "Echo", "Storm", "Fire", "Bloom",
                "Frost", "Wander", "Pulse", "Grace", "Drift",
                "Flame", "Haven", "Spark", "Thorn", "Quest"
        };

        for (int i = 0; i < library.length; i++) {
            library[i] = new Book(i+1, "100"+i, books[i]);
//            System.out.println(library[i].getTitle());
        }

        boolean running = true;

        while(running) {
            System.out.println("\n- Main Menu -");
            System.out.println("[1] Show Available Books - ");
            System.out.println("[2] Show Checked Out Books - ");
            System.out.println("[3] Exit Menu - ");
            System.out.println("Choose an option: ");
            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                System.out.println("Available Books: ");
                for (Book book : library) {
                    if (!book.isCheckedOut()) {
                        System.out.println(" ID: " + book.getId() +" ISBN: " + book.getIsbn() +" Title: " + book.getTitle());
                    }
                }
            }
        }
    }
}
