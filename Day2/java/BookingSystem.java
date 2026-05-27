import java.util.Random;
import java.util.ArrayList;
import java.util.Scanner;

public class BookingSystem{

  public static ArrayList<String> books = new ArrayList<>();

    public static void main(String [] args){
     books.add("The Hobbit");
        books.add("The Mystery");

    Scanner inputCollector= new Scanner(System.in);

     while(true){
            System.out.println("Welcome to the Book Suggestion System!");
            System.out.println("1. Get Suggestions");
            System.out.println("2. Add Book");
            System.out.println("3. Remove Book");
            System.out.println("4. Update book");
            System.out.println("5. Show books");



            System.out.print("Enter operation: ");
           int choice= inputCollector.nextInt();
            inputCollector.nextLine();
   
    
    

    if(choice==1){

    while (true){
      System.out.println("Book for the Day:");
      System.out.println(title());

      System.out.print("Would you like to get another suggestion? (yes/no): ");
      String answer = inputCollector.nextLine();


           if (answer.equals("no")) {
                        break; 
                    }

           }


} else  if(choice==2){

    
      System.out.println("Enter the book title:");
      String book= inputCollector.nextLine();
      System.out.print(add(book));

      
          


}
else  if(choice==3){

    
      System.out.println("Enter the book title to remove:");
      String book= inputCollector.nextLine();
      System.out.print(remove(book));

      
          


}


else  if(choice==4){

    
      System.out.println("Enter the old title: ");
      String oldBook= inputCollector.nextLine();
      inputCollector.nextLine();

      System.out.println("Enter the new title:");
      String newBook= inputCollector.nextLine();
      inputCollector.nextLine();


         System.out.print( update (oldBook, newBook));

}
else  if(choice==5){

    
      System.out.println("All books ");
      show();

}





        }// big while








}// main method



public static String title (){



    Random random = new Random();
    int randomPage = random.nextInt(100)+1;


    int randomBookIndex = random.nextInt(books.size());

    String randomBook= books.get(randomBookIndex);


return "Book Title: "+ randomBook + "\nPage:" + randomPage;

}


public static String add (String book){


    if(!books.contains(book)){

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
