import java.util.ArrayList;
import java.util.Arrays;

public class SortTwo{


  public static void main(String[] args) {
        int[][] inputArray = {{9, 0, 7}, {3, 5, 1}, {8, 1, 7}, {9, 9, 6}};
        System.out.println(Arrays.toString(array(inputArray))); 
        
    }



 


    public static int[] array(int[][] array) {

ArrayList<Integer>items = new ArrayList<>();

for (int row =0; row<array.length; row++){

        for(int column =0; column<array[row].length; column++){


        items.add(array[row][column]);        
            
        }

   }
        

int [] newArray= new int [items.size()];

for (int index=0; index<newArray.length; index++){


        newArray[index]=items.get(index);

  }


 for(int index =0; index<newArray.length; index++ ){
                
                for(int index2= index+1; index2<newArray.length; index2++){
                        int temp=0;
                        if(newArray[index]>newArray[index2]){
                               temp= newArray[index];
                                newArray[index]= newArray[index2];
                                  newArray[index2] = temp;
                                  }


                    }
            

            }
       


return newArray;
  

    }
















}
