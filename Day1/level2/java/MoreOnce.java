
import java.util.ArrayList;
public class MoreOnce{






public static int [] array (int [] array){

ArrayList<Integer> items = new ArrayList<Integer>(); 
 
ArrayList<Integer> duplicateItems = new ArrayList<Integer>(); 

  for (int index=0; index<array.length; index++){
        if(!items.contains(array[index])){

        items.add(array[index]);
        }else{

                if(!duplicateItems.contains(array[index])) duplicateItems.add(array[index]);
     }


   }


int [] newArray= new int [duplicateItems.size()];


for(int index=0; index<newArray.length; index++){

        newArray[index]= duplicateItems.get(index);
         
}



 return newArray;



}

















}
