package Practice.Arrays;

public class BuysSellStock {
    //BUY SELL STOCK PROBLEM-I
    static int maxProfit(int[] prices){
        int buy=prices[0];
        int max=0;
        for(int i=1;i<prices.length;i++){
            buy=Math.min(buy, prices[i]);
            max=Math.max(max, prices[i]-buy);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }
}
