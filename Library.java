import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Library
{
    ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(Book b) {
        books.add(b);
    }

    //filename must be a file in the same directory as Library.java
    public void loadBooksFromFile(String filename) {
        try {
            File myFile = new File(filename);
            Scanner scrn = new Scanner(myFile);

            while(scrn.hasNextLine()) {
                String line = scrn.nextLine();
                String[] elements = line.split(","); //split on the "," and store in a String array
                Book b = new Book(elements[0], elements[1], Integer.parseInt(elements[2]));
                books.add(b);//add the new book to the library
            }
        }
        catch(IOException e) {
            System.out.println("ERROR: COULD NOT LOAD LIBRARY");
            e.printStackTrace();
        }
    }

    public String toString() {
        StringBuilder output = new StringBuilder();

        for(Book b: books) {
            output.append(b.toString() + "\n");
        }

        return output.toString();
    }
}
