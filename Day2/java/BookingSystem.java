import java.util.Random;
import java.util.ArrayList;

public class BookingSystem{

  public static ArrayList<String> books = new ArrayList<>();

    public static void main(String [] args){

 while(true){









}








}



public static String title (){

books.add("Dietel");
books.add("the book of ucl");

    Random random = new Random();
    int randomPage = random.nextInt(100)+1;


    int randomBookIndex = random.nextInt(books.size());

    String randomBook= books.get(randomBookIndex);


return "Book Title: "+ randomBook + "\nPage:" + randomPage;

}


public static String add (String book){


    if(!books.contains()){

    books.add(book);
    return "Book added successfully!";


    }


   return "Book already in the list";
  


}


public static String remove (String book){


 books.remove(book);
 return "Book removed successfully!";


  


}


public static String update (String oldBook, String newBook){


int index = books.indexOf(oldBook);

if(index != -1){

books.set(index,newBook);
return "Book updated successfully!";
}   

 
 return "Book not updated successfully!";


  


}




public static void show(){

int number=1;
    for(String book: books){

    System.out.println(number+". " +book);
    number++;


   }


 


  


}



























}
