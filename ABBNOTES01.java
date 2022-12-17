public class ABBNOTES01 {

   public static void main(String[] args) {

      //// NOTES PURPOSES////

                        //// Printing something under java programs////

      // System.out.println("Hello Java"); //println mai ln next line k liy h
      // System.out.print("Hello Java"); //print normal print krta h without any line
      // k space

                        //// Variables:"Stores some value in memory for temporary basis"////

      // String name1 = "Shivani";
      // String name2 = name1; //asse krne se memory me name2 place pr ek value hogi
      // that is value of name1
      // quki whi likha h :we can assign one variable's value to another variable
      // int age = 18;

      // Types:2;Primitive and non-primitive
      // ((1))primitive=isme simple values store kr skte h: ALREADY DEFINED [Length is
         // fixed]
        // LOWERCASE ME LIKHTE H

        // 1)..byte-1byte memory[-128 to 127]
        // 2)..short-2bytes
        // 3)..int-4bytes
        // 4)..long-8bytes 12345678900L
        // 5)..float-4byte 3.14F
        // 6)..double-8byte 56.876D
        // 7)..boolean-1byte(true/false)
        // 8)..char-2bytes 'a'

      // ((2))non-primitive/Reference=complex values:USER DEFINED--refer to objects
         // these variables are used to call methods for operations
        // FIRST LETTER IS IN UPPERCASE

            // 1)..String (Stringg.java)
      // String name="Shivani";
      // String name= new String("Shivani"); {New is a keyword jrrori ni h use krna
      // but we can..}

      // length:(for finding length of the string)
      // System.out.println(name.length());
      // Concatination:
      // String name1 ="Shivani";
      // String name2 =" Badola";
      // String name3 = name1 + " and " + name2;
      // System.out.println(name3);
      // charAt:(character at konse place pr konsa character h!!)
      // String name = "Shivani";
      // System.out.println(name.charAt(0));
      // Replace:(kisi ek character ko replace krke dusra lga skte h)function
      // String name = "Shivami";
      // String name2 = name.replace("m" , "n");
      // System.out.println(name2);
      // Substring:creating choti string from a badi string!
      // String name = "Shivani and Sona";
      // System.out.println(name.substring(0,7)); //0-7 mtlb 0 include hoga pr 7th
      // wala INCLUDE NA HOGA (inmutable)
      // txt.toUpperCase/LowerCase
      // indexOf():TO FIND the positon of first iccurance of text

      // \n new line hello\nworld
      // \r return value
      // \t tab
      // \b backspace
      // \f form feed

             // 2)..Arrays: (EX--Arr.java)
      // int[] marks = new int[3];
      // marks[0] = 97;
      // marks[1] = 94;
      // marks[2] = 98;
      // System.out.println(marks[0]);

      // length:arr.length
      // 'loop':for(int i=0;i<arr.length;i++)
      // multidimensional : int[][]

           // 3)..Classes:

                          //// JAVA TYPE CASTING////
      // ek primitive data type ki value ko dusre me assign krna is type casting!!

      // 1)..Widening casting(AUTOMATIALLY):smaller to larger (EX--Widening.java)
      //// byte->short->char->int->long->float->double

      // 2)..Narrowing casting(MANUALLY):larger to smaller (EX--Narrowcast.java)
      /// double->float->long->int->char->short->byte

                            //// JAVA OPERATORS////
      // 1)..Arithmetic [+,-,*,/,%,++,--] (EX--Arithmetic.java)
      // 2)..Assignment [=,+=,-=,*=,/=,%=,&=,|=,^=,>>=,<<=] (EX--Assignment.java)
      // 3)..Comparison [==,!=,>,<,>=,<=] (EX--Comparison.java)
      // 4)..Logical [&&,||,!] (EX--Logical.java)
      // 5)..Bitwise [&,|,^,~,<<,>>]

                               //// JAVA MATH////
      // (Math.java)_math.max_math.min_math.sqrt_math.abs_math.random

                             //// JAVA BOOLEANS////
      // one of two values either true/false,,,,,on/off,yes/no...
      // (Booleann.java)

                                //// IF...ELSE JAVA////
      // conditions in java(Ifelse.java)
      // shorthand: variable = (condition) ? expressionTrue : expressionFalse;

                               //// JAVA SWITCH////
      /*
       * switch(expression) case1 //break:breaks out of the switch case //code
       * //default:if no case matches break; //last case need no break case2 //code
       * (EX--Switchh.java)
       */
      
                         //// JAVA WHILE LOOP/DO WHILE////
      // while(condition){
      // code to executed.... (EX--Whilee.java)

      /*
       * do{ //code } while()
       */

                         //// JAVA FOR LOOP//// (EX--Forloop.java)
      // for(statement1;statement2;statement3){
      // code
      // }

   }
}