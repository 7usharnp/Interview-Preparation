package array;

import java.io.FilterOutputStream;
import java.util.*;

public class ArrayProblems {

    //Write a script to count the number of occurrences of the given element in an array
 /*   public static void main(String[] args) {
        int arr [] = {10,11,11,5,4,3,34,5,3,5,7,9};
        Map<Integer,Integer> countMap = new HashMap<Integer,Integer>();

        for(int i =0;i<arr.length;i++){
            if(countMap.containsKey(arr[i])){
                countMap.put(arr[i],countMap.get(arr[i])+1);
            }else{
                countMap.put(arr[i],1);
            }
        }
        countMap.forEach((k,v)-> System.out.println("Number "+ k + " is occured "+ v +" times"));
*/


    //Given a number in an array form. Write a program to move all zeros to the end.

  /*public static void main(String[] args) {
            int arr [] = {10,11,11,0,10,0,5,4,0,3,34,5,3,5,7,-9};
            int noncountZero=0;
              for(int i=0;i<arr.length;i++){
                  if(arr[i]!=0){
                      arr[noncountZero] = arr[i];
                      noncountZero++;
                  }
              }
              while (noncountZero<arr.length){
                  arr[noncountZero]=0;
                  noncountZero++;
              }

              for(int i :arr){
                  System.out.println(i);
              }
       }*/


    //Given are two ordered lists of sizes 7 and 3. The first list has three vacant spots in the end.
    // Merge them in a sorted manner with a minimum number of steps.


    //How to reverse an array in the subset of N?
    // e.g. Input: [1,3,5,7,9,11,15,17,19], Output: [5,3,1,11,9,7,19,17,15].

        /* public static void main(String[] args) {
             int[] inputArray = {1, 3, 5, 7, 9, 11, 15, 17, 19};
             int subsetSize = 3;

             // Reverse the array in subsets
             reverseArrayInSubsets(inputArray, subsetSize);

             // Print the reversed array
             System.out.println("Reversed array: " + Arrays.toString(inputArray));
         }

         public static void reverseArrayInSubsets(int[] arr, int n) {
             for (int i = 0; i < arr.length; i += n) {
                 int left = i;
                 int right = Math.min(i + n - 1, arr.length - 1);
                 while (left < right) {
                     int temp = arr[left];
                     arr[left] = arr[right];
                     arr[right] = temp;
                     left++;
                     right--;
                 }
             }
         }*/

    //Write a program to print the first non-repeated char in a string.
    // e.g. A string “Is it your first company” returns ‘u’

 /*   public static void main(String[] args) {
        String str = "Is it your first company";
        char [] arr = str.toCharArray();
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<arr.length;i++){
            char c = arr[i];
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else {
                map.put(c,1);
            }
        }
        map.forEach((k,v)-> {
            if(v ==1){
                System.out.println("First char "+ k);
            }
        });
    }*/

    //find length longest substring

   /* public static void main(String[] args) {
        System.out.println(longestUniqueSubstringLinear("aab"));
    }
    public static int longestUniqueSubstringLinear(String str) {
        int n = str.length();
        int maxLen = 0;
        int start = 0;
        Map<Character, Integer> charIndexMap = new HashMap<>();

        for (int end = 0; end < n; end++) {
            if (charIndexMap.containsKey(str.charAt(end))) {
                start = Math.max(start, charIndexMap.get(str.charAt(end)) + 1);
            }
            charIndexMap.put(str.charAt(end), end);
            maxLen = Math.max(maxLen, end - start + 1);
        }
        return maxLen;
    }*/


    //WAP to Concatenate Characters From Each String [{“Rama”, “Test”, “Type”, “Tata”} –>> RTTTaeyamsptatea]
    //Input String arr[] = {“Rama”, “Test”, “Type”, “Tata”}
    //Output should be – “RTTTaeyamsptatea”

  /*  public static void main(String[] args) {
        String arr[] = {"Rama", "Test", "Type", "Tata"};
        String str = "";
        for(int i=0;i< arr.length;i++){
            String char1 = String.valueOf(arr[0].charAt(i));
            String char2 = String.valueOf(arr[1].charAt(i));
            String char3 = String.valueOf(arr[2].charAt(i));
            String char4 = String.valueOf(arr[3].charAt(i));
             str =str + char1.concat(char2).concat(char3)+ char4;


        }
        System.out.println(str);
    }*/

    // Write a program  to Find the Number Of Times Substring Appear in a String

    /*public static void main(String[] args) {
        String str = "Tushar Sandesh Tushar Vandana Sandesh Ganpatrao Nangare  Tushar";
        String strTofind = "Tushar";
        String updatedStr = str.replace("Tushar","");
        int OccuranceOfTushar = (str.length()-updatedStr.length())/strTofind.length();
        System.out.println("Tushar occured "+ OccuranceOfTushar);
    }*/

    //WAP to Order Character Based On Number Of Occurrences
    //Input string: “dadeadrs”
    //Output: “dddaaers”

    /*public static void main(String[] args) {
        String s = "dadeadrs";
        List<Character>ls = new LinkedList<>();
        for(int i =0;i<s.length()-1;i++){
            if(!ls.contains(s.charAt(i))){
                ls.add(s.charAt(i));
                for(int j = i+1;j<s.length();j++){
                    if(s.charAt(i)==s.charAt(j)){
                        ls.add(s.charAt(i));
                    }
                }
            }
        }
        for(Character ch: ls){
            System.out.print(ch);
        }


    }*/
    //Write a Java Program to Print the Preceding Character By the Value
    //Input: Welcome to Mis2is2ip2i Bla4k Adam
    //Output:Welcome to Mississippi Blaaaak Adam
    /*public static void main(String[] args) {
        String str = "Welcome to Mis2is2ip2i Bla4k Adam";
       StringBuilder finalStr = new StringBuilder();
       for(int i =0;i<str.length();i++){
           char ch = str.charAt(i);
           if(Character.isDigit(ch)){
               int count = Character.getNumericValue(ch);
               char repeatingChar = str.charAt(i-1);
               while(count>0){
                   finalStr.append(repeatingChar);
                   count--;
               }
           }else {
               finalStr.append(ch);
           }
       }
        System.out.println(finalStr);
    }
*/

    // Write a Java Program[ abbcccdeee –>a1b2c3d1e3]
    //Input= abbcccdeee
    //Output= a1b2c3d1e3
    /*public static void main(String[] args) {
        String str = "abbcccdeee";
         Map <Character,Integer> map = new HashMap<>();
        for(int i = 0;i<str.length();i++){
           char ch = str.charAt(i);
           if(map.containsKey(ch)){
               map.put(ch,map.get(ch)+1);
           }else{
               map.put(ch,1);
           }

        }
        map.forEach((k,v)-> System.out.print(k+""+v));

    }
*/
// WAP to Sort Array Of String According To String Length
//Input { “Hi” , “maven” , “selenium ” , “java” }
//Output { “Hi”, “java”, “maven” , “selenium” }

   /* public static void main(String[] args) {
        String ip[]={"Hi","maven","selenium","java"};
        String temp;
        for(int i =0;i<ip.length-1;i++){
            for(int j=i+1;j< ip.length;j++){
                if(ip[i].length() > ip[j].length()){
                    temp = ip[i];
                    ip[i]=ip[j];
                    ip[j] = temp;
                }
            }
        }
        System.out.print("{");
        for(String st : ip){
            System.out.print(st+",");
        }
        System.out.print("}");
    }*/


    //WAP to Format a Phone Number in Human-Readable View
    //Input is a phone number Ex : 1234567890
    //Output: (123)45-67-890
   /* public static void main(String[] args) {
        String number = "1234567890";
        String first = number.substring(0,3);
        String second = number.substring(3,5);
        String third = number.substring(5,7);
        String fourth = number.substring(7);
        String Readable_number = "("+first+")-"+second+"-"+third+"-"+fourth;
        System.out.println(Readable_number);

    }*/

    // WAP to find the first non-repeated character in a String?
    //Input: “minimum”
    //Output: n=1
   /* public static void main(String[] args) {
        String str = "minimum";
       char [] charArray = str.toCharArray();
       Map<Character,Integer> map = new LinkedHashMap<>();
       for(int i=0;i<charArray.length;i++){
           char ch = str.charAt(i);
           if(map.containsKey(ch)){
               map.put(ch,map.get(ch)+1);
           }else {
               map.put(ch,1);
           }
       }
        final char[] first = new char[1];
        map.forEach((k,v)->{
            if(v==1){
                first[0] =k;
            }
        });
        System.out.println(first[0]);
    }*/

    //WAP For Sum Of Digits Of a String
    //Find Sum of numbers in given strings.
    //Input : “Welcome[21], Java1How are you78”
    //OutPut : 100 [21+1+78]
    //Find Sum of digits in given strings.
    //Input : “Welcome[21], Java1How are you78”
    //OutPut : 19 [2+1+1+7+8]
    /*public static void main(String[] args) {
        String str = "Welcome[21], Java1How are you78";
        int count =0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){
                int num = Character.getNumericValue(ch);
                count = count +num;
            }
        }
        System.out.println("Sum of the numbers "+ count);
    }*/

   /* public static void main(String[] args) {
        String str = "Welcome[21], Java1How are you78";
        String cleanedString = str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println("Cleaned String "+ cleanedString);
        String num[] = cleanedString.split("[a-zA-Z]");
           int sum = 0;
        int[] intArr= new int[num.length];
        for(int i =0;i<num.length;i++){
          try{
              intArr[i] = Integer.parseInt(num[i]);
          }catch (Exception e){

          }

        }
        for(int b: intArr){
            sum = sum + b;
        }
        System.out.println("Sum "+sum);

    }*/

    //WAP to Reverse Every Third Word In a String
    //Input – Hi I am Naveen I need and answer
    //Output – answer and deen I Naveen ma I Hi


//WAP to Reverse String Based on Commas
//Input : Hello world,welcome to my world,my world
//Output:world  Hello ,world my to welcome ,world my
/*
public static void main(String[] args) {
    String str ="Hello world,welcome to my world,my world";
    String [] arr = str.split(",");
    List <String>ls = new LinkedList<>();
    for(int i=0;i<arr.length;i++){
        String[] subArr = arr[i].split(" ");
        for(int j=subArr.length-1;j>=0;j--){
            ls.add(subArr[j]);
        }
        ls.add(",");
    }
   for(String s:ls){
       System.out.print(s+" ");
   }
}
*/

    //WAP to Print Unique Digits Of an Integer Array
    //List a[ ] = [2, 1,1,4,5,5,6,7]
    //Expected output : [2,4,6,7] (Delete Duplicate Ones)

  /*  public static void main(String[] args) {
        int arr [] = {2, 1,1,4,5,5,6,7};
        Set st = new HashSet<>();
        for(int i =0;i<arr.length;i++){
            st.add(arr[i]);
        }
        st.forEach(s-> System.out.print(s+" "));
    }
*/
    //WAP to Reverse Letter Only From String
    //Input: today110is210my310interview
    //Output: yadot110si210ym310weivretni
 /* public static void main(String[] args) {
      String input = "today10is20my30interview";
      System.out.println("Input:  "+input);
      StringBuilder res = new StringBuilder ( );
      StringBuilder temp = new StringBuilder ( );
      for ( int i = 0 ; i < input.length ( ) ; i ++ )
      {
          char ch = input.charAt (i);
          if ( Character.isDigit (ch) )
          {
              while ( i < input.length ( ) && Character.isDigit ( input.charAt ( i ) ) )
              {
                  temp.append ( input.charAt ( i ) ) ;
                  i ++ ;
              }
              res.append ( temp ) ;
              temp.setLength ( 0 ) ;
              i-- ;
          }
          else
          {
              temp.insert ( 0 , ch ) ;
          }
      }
      res.append(temp);
      System.out.println("Output: "+res.toString());
  }*/

    //WAP to Replace a Character Sequence With Increase Order
    //Input: “HELLO WORLD”
    //Output: “HExxxO WORxxxD”
    /*public static void main(String[] args) {
        String input = "HELLO WORLD";
        int counter =0;
        int incrementer ;
        List <String> ls = new LinkedList<>();
        for(int i =0;i<input.length()-1;i++){
            String ch = String.valueOf(input.charAt(i));
            if(ch.equals("L")){
               counter= counter+1;
                incrementer = counter;
                while(incrementer>0){
                    ls.add("x");
                    incrementer--;
                }
            }else {
                ls.add(ch);
            }

        }
        ls.forEach(s -> System.out.print(s));

    }*/

    //WAP to Cyclically Shifting the Input String
    //Input=”Selenium”
    //Output:
    //eleniumS
    //leniumeS
    //eniumleS
    //niumeleS
    //iumneleS
    //umineleS
    //muineleS

    /*public static void main(String[] args) {
        String input = "Selenium";
        String prefix;
        String suffix ;

        for(int i=0;i<input.length();i++){
            prefix = input.substring(0,i+1);
            suffix = input.substring(i+1);
            System.out.println(suffix.concat(prefix));
        }
    }*/
    /*public static void main(String[] args)
    {
        String str = "Selenium";
        char [ ] input = str.toCharArray();
        int len = input.length ;
        printArr(input, len);
    }
    public static void printArr (char[] input, int len)
    {
        for (int i = 0 ; i<input.length ; i++ )
        {
            char temp = input[0];
            for ( int j = 1 ; j < len ; j ++ )
            {
                input[j-1]=input[j];
            }
            input[len-1]=temp;
            len--;
            System.out.println(input);
        }
    }*/

    //WAP to Leave the first 6 digit and last 4 digit of a card number and mask the rest.
    //Input: 5450595638154862
    //After Masking Output: 545059******4862
    //Modified Output: 5450-59**-****-4862
/*
    public static void main(String[] args) {
        String input = "5450595638154862";
        List ls = new LinkedList();
        for(int i=0;i<input.length()-1;i++){
            char ch = input.charAt(i);
            if(i<6){
                ls.add(ch);
            }else if(i>=6 && i<input.length()-5){
                ls.add("X");
            }else{
                ls.add(ch);
            }
        }
        ls.forEach(s-> System.out.print(s));
    }
  }
*/


//paliandrom
/*public static void main(String[] args) {
    int number = 122;
    int temp;
    int reverse=0;
    while(number>0){
        temp = number%10;
        reverse= reverse*10+temp;
        number = number/10;
    }
    System.out.println(reverse);
}*/


//list of devices is given and you one string you have to fetch all devices in sorted order with given pattern
    // list = camera, mobile charger, laptop, mouse, keyboard, computer, cooker, calculator
    // string serach = ca
    //output : calculator, camera , charger

  /*  public static void main(String[] args) {
        List<String> ls = new LinkedList<>();
        ls.add("camera");
        ls.add("mobile");
        ls.add("charger");
        ls.add("laptop");
        ls.add("mouse");
        ls.add("keyboard");
        ls.add("computer");
        ls.add("cooker");
        ls.add("calculator");
        Collections.sort(ls);



        String search = "ca";
        for(String str: ls){
            if(str.startsWith(search)){
                System.out.println(str);
            }
        }
    }
*/


    //equilateral triangle print
   /* public static void main(String[] args) {
        int rows = 5; // Adjust the number of rows as needed

        for (int i = 1; i <= rows; i++) {
            // Print spaces before the stars
            for (int j = rows - i; j > 0; j--) {
                System.out.print(" ");
            }

            // Print the stars
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }*/

    /*public static void main(String[] args) {
        String str = "Tushar Nangare";
        StringBuilder modifiedStr = new StringBuilder();
        char ch;
        for(int i=0;i<str.length();i++){
            if((str.charAt(i) == 'a')||str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o' || str.charAt(i) == 'u'){
                  continue;
            }
            else{
                modifiedStr.append(str.charAt(i));
            }

        }
        System.out.println(modifiedStr);
    }*/

    /*public static void main(String[] args) {
        String str = "online online w";
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);
            if(map.containsKey(str.charAt(i))){

                map.put(ch,map.get(str.charAt(i))+1);
            }else{
                map.put(ch,1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue().equals(1)){
                System.out.println("First not repeating char :- "+ entry.getKey());
                break;
            }
        }
        }
*/

   /* public static void main(String[] args) {
        String str = "Is it your first company";
        char charArr [] = str.toCharArray();
        Map<Character,Integer> charCounter = new LinkedHashMap<>();


        for (int i = 0; i < charArr.length; i++) {

            char ch = charArr[i];
            if(charCounter.containsKey(ch)){
                charCounter.put(ch,charCounter.get(ch)+1);
            }else {
                charCounter.put(ch,1);
            }
        }
        for (Map.Entry<Character, Integer> characterIntegerEntry : charCounter.entrySet()) {
            if(characterIntegerEntry.getValue().equals(1)){
                System.out.println("First non duplicate cahr is "+ characterIntegerEntry.getKey());
                break;
            }
        }
    }*/

    //input : "I am boy"
    //output: "y ob maI"
    public static void main(String[] args) {
      String str = "I am boy";

    }

}


