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
        setTitle(title);
        setPages(pages);
        setAuthor(author);
        setPublisher(publisher);
    }

    //Getter per l'attributo title
    public String getTitle(){
        return this.title;
    }
    //Setter per l'attributo title
    public void setTitle(String newTitle){
        if(newTitle.trim().isEmpty()){
            throw new IllegalArgumentException("Il campo non può essere vuoto");
        }
         this.title = newTitle;
    }

    //Getter per l'attributo pages
    public int getPages(){
        return this.pages;
    }
    //Setter per l'attributo pages
    public void setPages(int newPages){
        if (pages <= 0){
            throw new IllegalArgumentException("Il numero di pagine deve essere un numero maggiore di 0");
        }
        this.pages = newPages;
    }

    //Getter per l'attributo author
    public String getAuthor(){
        return this.author;
    }
    //Setter per l'attributo author
    public void setAuthor(String newAuthor){
        if (author.trim().isEmpty()){
            throw new IllegalArgumentException("Il campo non può essere vuoto");

        }
        this.author = newAuthor;
    }

    //Getter per l'attributo publisher
    public String getPublisher(){
        return this.publisher;
    }
    //Setter per l'attributo publisher
    public void setPublisher(String newPublisher){
        if (publisher.trim().isEmpty()){
            throw new IllegalArgumentException("Il campo non può essere vuoto");
        }
        this.publisher = newPublisher;
    }

    // Sovrascrivo il metodo toString()
    @Override
    public String toString() {
        return "Book[title=" + title + ", pages=" + pages + ", " +
                "author=" + author + ", publisher=" + publisher + "]" ;
    }
}
