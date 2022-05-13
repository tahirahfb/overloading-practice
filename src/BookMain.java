import java.util.*;

public class BookMain {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    ArrayList<Book> listOfBooks = new ArrayList<>();

    listOfBooks.add(new Book("The Queen's Gambit", 243, 1983));
    listOfBooks.add(new Book("For One More Day", 197, 2006 ));
    listOfBooks.add(new Book("What Is to Be Done?", 445, 1989));
    listOfBooks.add(new Book("Great Expectations", 466));
    listOfBooks.add(new Book("Lord of the Flies"));
    listOfBooks.add(new Book(267, 1969));
    listOfBooks.add(new Book(1951));

    System.out.println("Club members, please add to our book list!");
    System.out.println("If the entry is blank the list will stop!");

    while(true){
        System.out.println("Book Title: ");
        String title = input.nextLine();

        if(title.isBlank()){
            break;
        }

        System.out.println("Number of pages: ");
        int numOfPages = Integer.valueOf(input.nextLine());

        System.out.println("Publication Year: ");
        int publicationYear = Integer.valueOf(input.nextLine());

        listOfBooks.add(new Book(title, numOfPages, publicationYear));
    }

    System.out.println("What information would you like to print? For all book information, enter 'everything', for the book title, enter 'name'.");
    String printInfo = input.nextLine();

    System.out.println("");
    
    System.out.println("Our Book Club Book List:");
    if(printInfo.equalsIgnoreCase("everything")){
        for (Book list : listOfBooks){
            System.out.println(list.toString());
        }
    } else if(printInfo.equalsIgnoreCase("name")){
        for (Book list : listOfBooks){
            System.out.println(list.getTitle());
        }
    } else {
        System.out.println("Input invalid!");
    }


    input.close();
    }
}
