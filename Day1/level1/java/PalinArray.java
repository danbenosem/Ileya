
public class PalinArray {





public static boolean array(int [] array){


int [] newArray =  new int[array.length]; 

boolean isEqual= false;
  


       

          for(int index= 0; index<array.length; index++){

              
        newArray[index]= array[array.length-1-index];        

  
                    
               


             }
    
for(int index=0; index<array.length; index++){

    if (newArray[index]!= array[index]){

        return isEqual;
   }



}


return true;


   





}

















}
