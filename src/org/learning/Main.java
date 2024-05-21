package org.learning;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = 0;
        //Continuo a chiedere fino a quando tutti i campi sono corretti
        while(true){
            try{
                //Variabile per la lunghezza dell'array
                System.out.println("quanti libri sono?");
                //Assegno il valore alla variuabile
                arrayLength = Integer.parseInt(scanner.nextLine());
                    if (arrayLength <= 0){
                        throw new IllegalArgumentException("Deve essere un numero maggiore di 0");
                    }
                    //Esco dal ciclo se il valore è corretto
                    break;
            }catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        //Definisco la lunghezza dell'array
        Book[] books = new Book[arrayLength];

        //Faccio un ciclo che itera sulla lunghezza dell'array books
        for (int i = 0; i < books.length;i++){
            //Continuo a chiedere fino a quando tutti i campi sono corretti
            while(true){
                try{
                    System.out.println("Qual'è il titolo del libro?");
                    String title = (scanner.nextLine());
                    System.out.println("Quate pagina ha?");
                    //Variabile pagine
                    int pages = Integer.parseInt(scanner.nextLine());
                    //Variabile Autore
                    System.out.println("Chi è l'autore");
                    String author = (scanner.nextLine());
                    //Variabile Editore
                    System.out.println("Chi è l'editore");
                    String publisher = (scanner.nextLine());
                    //Istanzio la classe Book nell'array
                    books[i]= new Book(title,pages,author,publisher);
                    break;
                }
                //Prendo prima l'exeption della sottoclasse NumberFormatException
                catch (NumberFormatException e){
                    System.out.println("Il numero di pagine deve essere un numero valido.");
                }
                catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                }
            }
        }
        System.out.println(Arrays.toString(books));
        scanner.close();
    }
}
