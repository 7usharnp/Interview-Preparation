package roughWork;

public class Test {
    public static void main(String[] args) {
        int[] prices = {2,1,2,0,1};
        System.out.println(maxProfit(prices));

    }

    public static int maxProfit(int[] prices) {
        int min = 1000000;
        int max = -100000;
        int maxprofit=0;
        for(int i=0;i<prices.length-1;i++){
            for(int j= i+1;j<prices.length;j++){
                if(prices[i]>prices[j]){

                } else{
                    if(prices[i]< min){
                        min =prices[i];
                    }
                    if(prices[j]>max){
                        max = prices[j];
                    }
                    maxprofit = max-min;

                }
            }


        }
        return maxprofit;

    }

}



