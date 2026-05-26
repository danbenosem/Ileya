import java.util.Arrays;





public class DuplicateIndex{

public static void main(String [] args){

int [] array ={-11, -9, 3, -9, 2, -11};

System.out.print(Arrays.deepToString(array(array)));


}





public static int [] []array (int [] array){

int [] [] newArray= new int[2][3];

int row=0;


 for (int index=0; index<array.length; index++){

    for (int index2= index+1; index2<array.length; index2++){

         if(array[index]==array[index2]){


                  newArray[row][0]= array[index];


                  int []pair= new int[2];
                
                    pair[0]= index;
                pair[1]= index2;
   newArray[row][1]= pair;
               row++;
               
         }


       }
       


   }
   



return newArray;

}

















}
