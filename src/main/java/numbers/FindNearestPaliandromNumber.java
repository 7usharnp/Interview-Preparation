package numbers;

public class FindNearestPaliandromNumber {
    //given integer find the nearest paliandrome to the number
    //eg :i/p : 115 o/p : 111
    //ip: 117, op: 121
    static boolean  paliandromNumberFound= false;

    public static void main(String[] args) {
        int number = 115;
       int smallPallindrom = checkForSmallPaliandromNumber(number);
       int largePalindrom = checkForLargePaliandromNumber(number);
       int diffSmall = number -smallPallindrom;
       int diffBig = largePalindrom - number;
       if(diffBig>diffSmall){
           System.out.println("Closest paliandrom is "+ smallPallindrom);
       }else {
           System.out.println("Closest palindrom is "+ largePalindrom);
       }
    }
    public static int checkForSmallPaliandromNumber(int number){
        int paliandromNumber=0;
        for(int i = number;i<number;i--){
           while(!checkPaliandrom(i)){
               
           }
        }
        return paliandromNumber;

    }
    public static int checkForLargePaliandromNumber(int number){
        int paliandromNumber=0;
        for(int i = number;i>number;i++){
            if(checkPaliandrom(i)){
                paliandromNumber = i;
                break;
            }
        }
        return paliandromNumber;
    }

    public static boolean checkPaliandrom(int number){

        boolean boo;
        int temp;
        int reverse =0;
        while(number>0){
            temp = number%10;
            reverse = temp +reverse*10;
            number = number/10;
        }
        if(reverse == number){
            boo = true;
        }else boo = false;
        return boo;


    }
}
