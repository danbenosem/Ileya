
import java.util.ArrayList;
public class MoreOnce{






public static int [] array (int [] array){

ArrayList<Integer> items = new ArrayList<Integer>(); 
 
ArrayList<Integer> duplicateItems = new ArrayList<Integer>(); 

  for (int index=0; index<array.length; index++){

    for (int index2= index+1; index2<array.length; index2++){

         if(array[index]==array[index2]){


                  duplicateItems.add(array[index]);

               
         }


       }
       


   }


int [] newArray= new int [duplicateItems.size()];


for(int index=0; index<newArray.length; index++){

        newArray[index]= duplicateItems.get(index);
         
}



 return newArray;



}

















}
