package org.learning;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength;
        //Continuo a chiedere fino a quando non viene dato un valore corretto
        while (true){
            try {
            //Variabile per la lunghezza dell'array
            System.out.println("quanti libri sono?");
            //Assegno il valore alla variuabile
            arrayLength = Integer.parseInt(scanner.nextLine());
                if (arrayLength <= 0){
                    throw new IllegalArgumentException("Deve essere un numero maggiore di 0");
                }
                //Se il valore è corretto esco dal ciclo
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        //Definisco la lunghezza dell'array
        Book[] books = new Book[arrayLength];
        //Faccio un ciclo che itera sulla lunghezza dell'array books
        for (int i = 0; i < books.length;i++){
            String title;
            //Continuo a chiedere fino a quando non viene dato un valore corretto
            while(true){
                System.out.println("Qual'è il titolo del libro?");
                title = (scanner.nextLine());
                try {
                    if (title.trim().isEmpty()){
                        throw new IllegalArgumentException("Il campo non può essere vuoto");
                    }
                    //Se il valore è corretto esco dal ciclo
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                }
            }
            int pages;
            //Continuo a chiedere fino a quando non viene dato un valore corretto
            while(true){
                System.out.println("Quate pagina ha?");
                pages = Integer.parseInt(scanner.nextLine());
                try {
                    if (pages <= 0){
                       throw new IllegalArgumentException("Il numero di pagine deve essere un numero maggiore di 0");
                    }
                    //Se il valore è corretto esco dal ciclo
                    break;
                }
                //Catturo prima la sottoclasse NumberFormatException
                catch (NumberFormatException e) {
                    System.out.println("Inserisci un numero valido");
                } catch (IllegalArgumentException e){
                    System.out.println(e.getMessage());
                }
            }
            String author;
            //Continuo a chiedere fino a quando non viene dato un valore corretto
            while(true){
                System.out.println("Chi è l'autore");
                author = (scanner.nextLine());
                try {
                    if (author.trim().isEmpty()){
                        throw new IllegalArgumentException("Il campo non può essere vuoto");
                    }
                    //Se il valore è corretto esco dal ciclo
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getClass());
                }
            }
            String publisher;
            //Continuo a chiedere fino a quando non viene dato un valore corretto
            while(true){
                System.out.println("Chi è l'editore");
                publisher = (scanner.nextLine());
                try {
                    if (publisher.trim().isEmpty()){
                        throw new IllegalArgumentException("Il campo non può essere vuoto");
                    }
                    //Se il valore è corretto esco dal ciclo
                    break;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
            books[i]= new Book(title,pages,author,publisher);
            books[i].setPages(0);
        }

        System.out.println(Arrays.toString(books));
        scanner.close();



    }
}
