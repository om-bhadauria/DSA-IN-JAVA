/* Buy & Sell Stocks

->You are given an array prices where prices[i] is the price of a given stock
on the ith day. You want to maximize your profit by choosing a single day to
buy one stock and choosing a different day in the future to sell that stock.
Return the maximum profit you can achieve from this transaction. If you
cannot achieve any profit, return 0.

Price : [7,1,5,3,6,4]

Profit = selling price - buy price 

DAY.1.) 7 ; BUYING PRICE = X
DAY.2.) 1 ; SELLING PRICE = 1
            BUYING PRICE = 7
            PROFIT = 1- 7 = -6(LOSS)
DAY.3.) 1 ; SELLING PRICE = 5
            BUYING PRICE = 1
            PROFIT = 5-1 = 4(PROFIT)
DAY.2.) 1 ; SELLING PRICE = 3
            BUYING PRICE = 1
            PROFIT = 3-1 = 2(PROFIT)
DAY.2.) 1 ; SELLING PRICE = 6
            BUYING PRICE = 1
            PROFIT = 6-1 = 5(PROFIT)         -> MAXIMUM PROFIT
DAY.2.) 1 ; SELLING PRICE = 4
            BUYING PRICE = 1
            PROFIT = 4-1 = 3(PROFIT)
            */


package I_Array_Part_II;

public class E_Best_time_to_buy_Stock {

    public static int buyandsellstock(int prices[]){
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for(int i=0 ; i<prices.length; i++){
            if(buyprice < prices[i]){                    //this is the case where we can get a profit
                int profit = prices[i] - buyprice;       //today profit
                maxprofit = Math.max(maxprofit,profit);
            } else {
                buyprice = prices[i];
            }
        }

        return maxprofit;
    }
    
    public static void main(String[] args) {
        int prices[] ={7,1,5,3,6,4};
        System.out.println(buyandsellstock(prices));
    }
    
}
