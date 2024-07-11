class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int maxBottles =0;
        int totalEmptyBottles = 0;
        int emptyBottletobeExchanged = 0;
        int emptyBottlesLeft = 0;

        while(numBottles > 0){
            maxBottles = maxBottles+numBottles;
            totalEmptyBottles = numBottles + emptyBottlesLeft;
            emptyBottletobeExchanged= totalEmptyBottles/numExchange;
            emptyBottlesLeft = totalEmptyBottles%numExchange;
            numBottles = emptyBottletobeExchanged;
        }
        return maxBottles;
    }
}
