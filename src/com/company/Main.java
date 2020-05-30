package com.company;

public class Main {

    public static void main(String[] args) {
	// Basic operations
        //Addition =+
        //subtraction "-"
        //Multiplication "*"
        //Division "/"
        //Reminder = "what remains.." = 0 because 2*2 = 4 and there's not
        //4*3 = 1


        //==Relational Operations==
        /*
        - == comparison , not assignment
        -!=  NOT equal
        - > greater than
        - < less than
        - >= greater than equals
        - <= less than equals

        //=====Logical operators ====
        - AND (&&)
        - OR  (||)
        - NOT (!)

         */

         double firstNum =10;
         double secondNum =3;
         double result =0;
         Boolean isOld = true;
         Boolean isYoung = false;

         if((isOld && !isYoung) && (firstNum < secondNum)){
             System.out.println("horray");
         }else {
             System.out.println("not right");
         }

//         result = firstNum % secondNum;
        //   if statement
//         if (firstNum <= secondNum){
//             System.out.println("the remainder is " + result );
//        }
//       else{
//           System.out.println("Number aren't equals");
//       }


    }
}
