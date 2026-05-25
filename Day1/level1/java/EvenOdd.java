
import java.util.ArrayList;
public class EvenOdd {






public static int [][] array (int [] array){

ArrayList<Integer> evenItems = new ArrayList<Integer>(); 
ArrayList<Integer> oddItems = new ArrayList<Integer>(); 


  for (int index=0; index<array.length; index++){
        if(array[index]%2==0){

        evenItems.add(array[index]);
        } else {
        
        oddItems.add(array[index]);
              }



   }

int evenSize = evenItems.size();
int oddSize = oddItems.size();


int [] odd= new int [oddSize];
int [] even= new int [evenSize];


for(int index=0; index<odd.length; index++){

        odd[index]= oddItems.get(index);
         
}

for(int index=0; index<even.length; index++){

        even[index]= evenItems.get(index);
         
}


int [] [] newArray = {odd, even};

 return newArray;



}

















}
