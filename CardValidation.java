public class CardValidation{


public static void main(String [] args){


System.out.println(result("4388576018410707"));



}






public static int stepDigit (String number){

    int firstStep=0;


    for(int index= 0; index<number.length(); index+=2){

     char digit = number.charAt(index);

    int digit2= (digit-'0') *2;

      if(digit2<9){
      firstStep+=digit2;


      } else {

     
        firstStep+=(digit2%10) + (digit2/10);



      }
}
return firstStep;


}


public static int step2Digit (String number){

    int firstStep=0;


    for(int index= 1; index<number.length(); index+=2){

     char digit = number.charAt(index);

    int digit2= (digit-'0') ;

      
      firstStep+=digit2;

   }
       
return firstStep;


}





public static String result(String number){


int total = step2Digit ( number) + stepDigit ( number);

if(total % 10 ==0){

  return "valid";

}else{


  return "invalid";
}



public static String cardType(String number){


char letter= number.charAt(0);

if(letter=='4'){

    return "Visa Cards";

} else if(letter=='5'){

    return "Master Cards";

}else if(number.charAt(0)=='3' && number.charAt(1)=='7'){

    return "American Express Cards";

} else if(letter=='6'){

    return "Discover Cards";

} 









}













}
