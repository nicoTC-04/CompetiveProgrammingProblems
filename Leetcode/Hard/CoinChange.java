package Leetcode;
import java.util.*;
import java.io.*;

public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int[] arr = new int[amount+1];
        Arrays.sort(coins);
        
        for(int i=0; i<arr.length; i++){
            arr[i] = 2147483640;
        }
        
        arr[0] = 0;
        
        if(amount == 0){
            return 0;
        }
        
        if(amount < coins[0]){
            return -1;
        }
        
        if(amount%coins[0] != 0 && coins.length == 1){
            return -1;
        }
        
        for(int k=1; k<arr.length; k++){
            
            for(int coin : coins){
                
                if(coin <= k){
                    if(arr[k-coin] != 2147483640){
                        arr[k] = Math.min(arr[k], arr[k-coin]+1);
                    }
                }
            }
        }
        
        return (arr[amount] != 2147483640) ? arr[amount]: -1;
    }
}
