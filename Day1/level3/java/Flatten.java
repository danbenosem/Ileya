import java.util.ArrayList;


public class Flatten{


  


 


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


return newArray;
  

    }
















}
