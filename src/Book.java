public class Book {
    private String title;
    private int numOfPages;
    private int publicationYear;

public Book (){}

public Book (String title){
    this.title = title;
}    

public Book (String title, int numOfPages){
    this.title = title;
    this.numOfPages = numOfPages;
}

public Book (int numOfPages, int publicationYear){
    this.numOfPages = numOfPages;
    this.publicationYear = publicationYear;
}

public Book (int publicationYear){
    this.publicationYear = publicationYear;
}
 
 public Book (String title, int numOfPages, int publicationYear){
     this.title = title;
     this.numOfPages = numOfPages;
     this.publicationYear = publicationYear;
 }
 
 public String getTitle(){
     return title;
 }
 
 public void setTitle (String title){
     this.title = title;
 }
 
 public int getNumOfPages(){
     return numOfPages;
 }
 
 public void setNumOfPages(int numOfPages){
     this.numOfPages = numOfPages;
 }
 
 public int getPublicationYear(){
     return publicationYear;
 }
 
 public void setPublicationYear(int publicationYear){
     this.publicationYear = publicationYear;
 }
 
 @Override
 
 public String toString(){
     return getTitle() + ", " + getNumOfPages() + " pages, " + getPublicationYear();
 }
 
 
 
 }
