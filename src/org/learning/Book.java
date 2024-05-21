package org.learning;
/*Vogliamo gestire il catalogo di libri di una biblioteca.
Un libro è composto da :
- titolo
- numero pagine
- autore
- editore
Scrivere un programma che inserisce n libri in un array. Chiede i dati di un
libro (titolo, numero pagine, autore, editore), istanzia un nuovo oggetto della
 classe Book e lo inserisce nell’array. Lo fa per il numero di elementi previsti nell’array.
Quando vengono inseriti i dati, verificare che siano corretti (es. non accettare titolo o
autore o editore vuoto, numero pagine ≤ 0). Se ci sono errori, lanciare un’eccezione e
gestirla mostrando a video il tipo di errore.
Implementare i getter e setter di tutti gli attributi del libro gestendo anche in questo
 caso eventuali errori di dati non corretti (che generano quindi eccezione).
Al termine dell’inserimento scrivere tutti i dati dei libri in un file e in seguito
 rileggerli dal file e mostrarli a video.*/
public class Book {
    //Attributi
    private String title;
    private int pages;
    private String author;
    private String publisher;
    //Costruttore
    Book(String title,int pages, String author,String publisher){
        this.title=title;
        this.pages=pages;
        this.author=author;
        this.publisher=publisher;
    }

    // Sovrascrivo il metodo toString()
    @Override
    public String toString() {
        return "Book[title=" + title + ", pages=" + pages + ", " +
                "author=" + author + ", publisher=" + publisher + "]" ;
    }
}
