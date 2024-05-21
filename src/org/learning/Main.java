package org.learning;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
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
        File file = new File("./resources/data.txt");
        writeToFile(file, books);
        readFile(file);
    }
    //Metodo per leggere il testo del file
    public static void readFile(File file){
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            //Itero su tutte le righe del file
            while (scanner.hasNextLine()){
                String line= scanner.nextLine();
                System.out.println(line);
            }
        }
        //Gestisco l'eccezione che il file non venga trovato
        catch (FileNotFoundException e) {
            System.out.println("Unable to read");
        }finally {
            if (scanner != null){
                //Chiudo lo scanner
                scanner.close();
            }
        }
    }
    //Metodo per scrivere nel file
    private static void writeToFile(File file, Book[] books) {
        FileWriter fileWriter=null;
        try{
            fileWriter = new FileWriter(file);
            fileWriter.write(Arrays.toString(books));
        }catch (IOException e){
            System.out.println("Unable to open file writer");
        }finally {
            if (fileWriter != null){
                try {
                    fileWriter.close();
                }catch (IOException e){
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
