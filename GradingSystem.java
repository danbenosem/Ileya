import java.util.ArrayList;
import java.util.Scanner;


public class GradingSystem{

public static void main(String [] args){
int numStudents=2;
int numQuiz=4;
ArrayList<Integer>grades= new ArrayList<Integer>();
ArrayList<Double>compareGrades= new ArrayList<Double>();


Scanner inputCollector= new Scanner(System.in);
int score;

 System.out.println("student 1 ");

   for(int index=0; index<numStudents; index++){
                  
                for (int index2=0; index2<numQuiz; index2++){
                        System.out.print("enter the score for quiz "+(index2+1)   +":");
                        score= inputCollector.nextInt();

                        if(score>=0 && score <101){
                                  grades.add(score);

                             }
                       
   
                  } 
             if (index==numStudents-1){

                break;
    
             }
           
         System.out.println("for student " + (index+2));


          }


System.out.println(grades);






for(int index =0; index<numStudents; index++){
    
        int count=1;
        int sum=0;
        double average=0;
            System.out.println("for student"+ (index+1));
          for(int index2=0; index2<numQuiz; index2++){
                System.out.print("quiz"+ (index2+1)+ ":");
                System.out.println(grades.get(index2));
                sum+=grades.get(index2);
                average= sum/count;
                count++;
                
           }
         System.out.println("Average:"+average );
          
     
}



int count=0;

for(int newIndex =0; newIndex<numQuiz; newIndex++){
    
        int count1=1;
        int sum=0;
        double average=0;
            System.out.println("for quiz"+ (newIndex+1));
            
          for(int index2=count; index2<grades.size(); index2+=numQuiz){
                
                sum+=grades.get(count);
                average= sum/count1;
                count1++;
                
                
           }
          compareGrades.add(average);
          count++;
     
}


System.out.print(compareGrades);

}







//

















}
