class Solution {
    public int maximumWealth(int[][] accounts) {
    int mw=0;
    for(int[] ca:accounts)
    {
    int cw=0; 
    for(int money:ca)
    {
    cw+=money;
    }
    if(cw>mw)
    {
        mw=cw;
    }
    }
    return mw;
    }
}