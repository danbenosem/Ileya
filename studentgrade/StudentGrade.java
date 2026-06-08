import java.util.Arrays;
import java.util.Scanner;

public class StudentGrade {



    public static void main(String [] args){


    Scanner inputCollector = new Scanner(System.in);

   System.out.print("enter the number of students:");
  int studentsNumber= inputCollector.nextInt();
   
 System.out.print("enter the number of subjects:");
  int subjectsNumber = inputCollector.nextInt();
    
     
     int [][] array= new int [studentsNumber][subjectsNumber];

       
       
      

     

        for (int row = 0; row < array.length; row++) {
            System.out.println("enter score for student " + (row +1) );
             System.out.println();
            for (int column = 0; column < array[row].length; column++) {
                   System.out.println("enter score for subject " + (column +1) );
                array[row][column] = inputCollector.nextInt();
            
       }
       System.out.println("saving>>>>>>>>>>>>>"  );
         System.out.println("saved successfully"  );

          System.out.println(  );
     }


System.out.print("STUDENT  ");
for(int index=0; index<subjectsNumber; index++){

     System.out.print(" SUB" + (index+1));

 }
System.out.print("  TOT  ");
System.out.print("  AVE  " );
System.out.print("  POS  ");
System.out.println();


double [] averageRowArray = averageRowArray(array,studentsNumber,subjectsNumber);
 int []totalRowArray = totalRowArray(array,studentsNumber);
int[]positionRowArray = positionRowArray  ( totalRowArray,studentsNumber);




for (int row = 0; row < array.length; row++) {
                   System.out.printf("student " + (row +1) );
            for (int column = 0; column < array[row].length; column++) {
           
                System.out.printf("   %d ",array[row][column]);
                 
            
       }
    System.out.printf("   %d ",totalRowArray[row]);
    System.out.printf("   %.2f",averageRowArray[row]);
     System.out.printf("  %d ",positionRowArray[row]);
        
       System.out.println();
            
}







summary ( array, subjectsNumber,studentsNumber);
}





        public static double [] averageRowArray (int [][] array , int studentsNumber,int subjectsNumber){

                  double [] averageRowArray = new double [studentsNumber];



                      for (int row = 0; row <averageRowArray.length ; row++) {
                             int total = 0;
                            for (int column = 0; column < array[row].length; column++){
                             total += array[row][column];
                             
                             
                          } 
                          double average= (double)total / subjectsNumber;
                              
                              averageRowArray[row]= average;
                        }



                return averageRowArray;

          }



 public static int []totalRowArray (int [][] array ,int studentsNumber){

           int [] totalRowArray= new int [studentsNumber];


            for (int row = 0; row <totalRowArray.length ; row++) {
                 int total = 0;
                for (int column = 0; column < array[row].length; column++){
                 total += array[row][column];
                 
                 
              } 
                  
                  totalRowArray[row]= total;
            }


        return totalRowArray;


        }


      public static int[]positionRowArray( int []totalRowArray, int studentsNumber){


    int[]positionRowArray = new int [studentsNumber];   


        for (int index = 0; index< totalRowArray.length ; index++) {
           int count=0;
             
            for (int index2= 0; index2 < totalRowArray.length; index2++){
               
                  if(totalRowArray[index]<totalRowArray[index2]){

                                count++;
                         }
             
          } 
           positionRowArray[index] =totalRowArray.length - count;
              
             
        }


return positionRowArray;





      } 






        public static void summary (int [][] array,int subjectsNumber, int studentsNumber){
          int targetColumn = 0; 
         int [] subjectColumnArray= new int[studentsNumber]; 
          while(targetColumn< subjectsNumber){
                int total=0;

             

            for (int row = 0; row < array.length; row++) {
            subjectColumnArray[row] = array[row][targetColumn];
              total+=array[row][targetColumn];
              }


           int max = subjectColumnArray[0]; 
           int min =  subjectColumnArray[0];
           int studentMax=0;
          int studentMin=0;
           for(int index=0; index<subjectColumnArray.length; index++){
             if(subjectColumnArray[index]>max){
                
                max = subjectColumnArray[index];
                studentMax=index;
             }
            
              if(subjectColumnArray[index]<min){
                
                min = subjectColumnArray[index];
                studentMin=index;
              }

           }

          System.out.println();
        System.out.println("Subject: " + (targetColumn +1) ); 
        System.out.println("Highest scoring student is: Student " + (studentMax + 1)+ " scoring " + max);
        System.out.println("Lowest scoring student is: Student " + (studentMin + 1)+ " scoring  " + min);

        System.out.println("The total score is " + total);
        System.out.println("The average score is " + (total/subjectsNumber));


        targetColumn ++;
        }


        }






 

   
















}
