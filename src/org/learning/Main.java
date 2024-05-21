package org.learning;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Variabile per la lunghezza dell'array
        System.out.println("quanti libri sono?");
        //Assegno il valore alla variuabile
        int arrayLength = Integer.parseInt(scanner.nextLine());
        try {
            if (arrayLength <= 0){
                throw new IllegalArgumentException("Deve essere un numero maggiore di 0");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        //Definisco la lunghezza dell'array
        Book[] books = new Book[arrayLength];
        for (int i = 0; i < books.length;i++){
            System.out.println("Qual'è il titolo del libro?");
            String title = (scanner.nextLine());
            try {
                if (title.trim().isEmpty()){
                    throw new IllegalArgumentException("Il campo non può essere vuoto");
                }
                System.out.println("Il titolo del libro è: " + title);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Quate pagina ha?");
            int pages = Integer.parseInt(scanner.nextLine());
            try {
                if (pages <= 0){
                   throw new IllegalArgumentException("Il numero di pagine deve essere un numero maggiore di 0");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println("Chi è l'autore");
            String author = (scanner.nextLine());
            try {
                if (author.trim().isEmpty()){
                    throw new IllegalArgumentException("Il campo non può essere vuoto");
                }
            } catch (IllegalArgumentException e) {
                System.out.println(e.getClass());
            }
            System.out.println("Chi è l'editore");
            String publisher = (scanner.nextLine());
            try {
                if (publisher.trim().isEmpty()){
                    throw new IllegalArgumentException("Il campo non può essere vuoto");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            books[i]= new Book(title,pages,author,publisher);
            books[i].setPages(0);
        }

        System.out.println(Arrays.toString(books));
        scanner.close();



    }
}
