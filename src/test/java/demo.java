import java.util.*;

public class demo {
//Write a script to count the number of occurrences of the given element in an array
   /* public static void main(String[] args) {
        int [] arr = {1,3,3,4,5};
        Map<Integer,Integer> numOccurance = new HashMap<>();
        for(int i=0;i< arr.length;i++){
            if(numOccurance.containsKey(arr[i])){
                numOccurance.put(arr[i],numOccurance.get(arr[i])+1);

            }else{
                numOccurance.put(arr[i],1);
            }
        }
        numOccurance.forEach((k,v)->{
            System.out.println(k+ " occured "+ v + " times");
        });

    }*/

//Given a number in an array form. Write a program to move all zeros to the end.
  /*public static void main(String[] args) {
      int arr[] = {10, 11, 11, 0, 10, 0, 5, 4, 0, 3, 34, 5, 3, 5, 7, -9};
      int nonZeroCounter =0;
      for(int i = 0;i<arr.length;i++){
          if(arr[i]!=0){
              arr[nonZeroCounter] = arr[i];
              nonZeroCounter++;
          }

      }
      while(nonZeroCounter<arr.length){
          arr[nonZeroCounter] = 0;
          nonZeroCounter++;
      }
      System.out.println(Arrays.toString(arr));
  }*/

    //Write a program to print the first non-repeated char in a string.
    // e.g. A string “Is it your first company” returns ‘u’
   /* public static void main(String[] args) {
        String str = "Is it your first company";
        char [] charArr = str.toCharArray();
        Map<Character,Integer> occuranceCalculate = new LinkedHashMap<>();
        for(int i=0;i< charArr.length;i++){
            if(occuranceCalculate.containsKey(charArr[i])){
                occuranceCalculate.put(charArr[i],occuranceCalculate.get(charArr[i])+1);
            }else{
                occuranceCalculate.put(charArr[i],1);
            }
        }
        for (Map.Entry<Character, Integer> characterIntegerEntry : occuranceCalculate.entrySet()) {
           if(characterIntegerEntry.getValue()==1){
               System.out.println("First character to occur "+characterIntegerEntry.getKey());
               break;
           }
        }

       }

     */

    //WAP to Concatenate Characters From Each String [{“Rama”, “Test”, “Type”, “Tata”} –>> RTTTaeyamsptatea]
    //Input String arr[] = {“Rama”, “Test”, “Type”, “Tata”}
    //Output should be – “RTTTaeyamsptatea”

   /* public static void main(String[] args) {
        String arr[] = {"Rama","Test","Type","Tata"};
        StringBuilder Str = new StringBuilder();
        for(int i =0;i<arr.length-1;i++){
            String str1 = String.valueOf(arr[0].charAt(i));
            String str2 = String.valueOf(arr[1].charAt(i));
            String str3 = String.valueOf(arr[2].charAt(i));
            String Str4 = String.valueOf(arr[3].charAt(i));
            Str.append(str1).append(str2).append(str3).append(Str4);
        }
        System.out.println(Str.toString());
    }
*/
//Write a program  to Find the Number Of Times Substring Appear in a String

/*    public static void main(String[] args) {
        String str = "Tushar Sandesh Tushar Vandana Sandesh Ganpatrao Nangare Tushar";
        String [] stringArray = str.split(" ");
        Map<String,Integer> stringMap  = new HashMap<>();
       for(int i=0;i<stringArray.length;i++){
           if(stringMap.containsKey(stringArray[i])){
               stringMap.put(stringArray[i],stringMap.get(stringArray[i])+1);

           }else {
               stringMap.put(stringArray[i],1);
           }
       }

        for (Map.Entry<String, Integer> stringIntegerEntry : stringMap.entrySet()) {
            System.out.println("String "+  stringIntegerEntry.getKey() + " occured "+ stringIntegerEntry.getValue() + " times");
        }

//        stringMap.forEach((k,v)->{
//          System.out.println("String "+  k + " occured "+ v + " times");
//
//        });
    }*/

//Write a Java Program to Print the Preceding Character By the Value
//Input: Welcome to Mis2is2ip2i Bla4k Adam
//Output:Welcome to Mississippi Blaaaak Adam
   /* public static void main(String[] args) {
        String str = "Welcome to Mis2is2ip2i Bla4k Adam";
        StringBuilder updatedStr = new StringBuilder();
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isDigit(ch)){

                int digit = Character.getNumericValue(ch);
                while(digit > 0){
                    updatedStr.append(str.charAt(i-1));
                    digit--;

                }
            }else{
                updatedStr.append(ch);
            }
        }
        System.out.println(updatedStr);
    }*/



    // Write a Java Program[ abbcccdeee –>a1b2c3d1e3]
    //Input= abbcccdeee
    //Output= a1b2c3d1e3

   /* public static void main(String[] args) {
        String input = "abbcccdeee";
        Map<Character,Integer> map = new LinkedHashMap<>();
        for(int i=0;i<input.length();i++){
            if(map.containsKey(input.charAt(i))){
                map.put(input.charAt(i),map.get(input.charAt(i))+1);

            }else {
                map.put(input.charAt(i),1);
            }
        }
        map.forEach((k,v)->{
            System.out.print(k+""+v);
        });
    }*/

    // WAP to Sort Array Of String According To String Length
//Input { “Hi” , “maven” , “selenium ” , “java” }
//Output { “Hi”, “java”, “maven” , “selenium” }

   /* public static void main(String[] args) {
        String [] input = {"Hi","maven","selenium","java"};
        String temp;
        for(int i=0;i<input.length-1;i++){
            for(int j=i+1;j<input.length;j++){
                if(input[i].length()>input[j].length()){
                    temp = input[i];
                    input[i]=input[j];
                    input[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(input));
    }*/

    //WAP to Format a Phone Number in Human-Readable View
    //Input is a phone number Ex : 1234567890
    //Output: (123)45-67-890

   /* public static void main(String[] args) {
        StringBuilder stringBuilder=new StringBuilder();
        String input = "1234567890";
        String str1 = input.substring(0,3);
        String str2 = input.substring(3,5);
        String str3 = input.substring(5,7);
        String str4 = input.substring(7);
        stringBuilder.append("(").append(str1).append(")").append(str2).append("-").append(str3).append("-").append(str4);
        System.out.println(stringBuilder.toString());
    }
    */

    // WAP to find the first non-repeated character in a String?
    //Input: “minimum”
    //Output: n=1
    /*public static void main(String[] args) {
        String input = "minimum";
        Map<Character,Integer>map = new LinkedHashMap<>();
        for(int i=0;i<input.length();i++){
            if(map.containsKey(input.charAt(i))){
                map.put(input.charAt(i),map.get(input.charAt(i))+1);

            }else {
                map.put(input.charAt(i),1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue()==1){
                System.out.println("Character "+ entry.getKey());
                break;

            }
        }


    }*/

    //WAP For Sum Of Digits Of a String
    //Find Sum of numbers in given strings.
    //Input : “Welcome[21], Java1How are you78”
    //OutPut : 100 [21+1+78]
    //Find Sum of digits in given strings.
    //Input : “Welcome[21], Java1How are you78”
    //OutPut : 19 [2+1+1+7+8]

    /*public static void main(String[] args) {
        String string = "Welcome[21], Java1How are you78";
        List<Integer> ls=new ArrayList<>();
        for(int i=0;i<string.length();i++){
            char ch = string.charAt(i);
            if(Character.isDigit(ch)){
                ls.add(Character.getNumericValue(ch));
            }
        }
        int sum=0;
        for(int num:ls){
          sum =  sum+num;
        };
        System.out.println("Total sum"+ sum);
    }*/

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



}
