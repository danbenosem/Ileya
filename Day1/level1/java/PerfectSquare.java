import java.util.ArrayList;

public class PerfectSquare {




public static int [] array(int [] array){


ArrayList<Integer> perfectItems = new ArrayList<Integer>();
  


       

          for(int index= 0; index<array.length; index++){

            int number=  (int) Math.sqrt(array[index]);
            int newNumber = Math.abs(array[index]);
            if(number *number== newNumber){


            perfectItems.add(array[index]);
         }
                
         

  
                    
               


             }


int [] newArray= new int [perfectItems.size()];

for (int index =0; index<newArray.length; index++){

newArray[index]= perfectItems.get(index);

}

   return newArray;





}

















}
