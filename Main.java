public class Main
{
    public static void main(String args[])
    {
        Library myLibrary = new Library();
        myLibrary.loadBooksFromFile("data.dat");    

        System.out.println(myLibrary);
    }
}
