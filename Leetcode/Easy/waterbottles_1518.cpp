#include <iostream>
#include <stdlib.h>
#include <vector>

using namespace std;

class Solution
{
public:
    int numWaterBottles(int numBottles, int numExchange)
    {
        int full = numBottles;
        int empty = 0;
        int drank = 0;

        while (true)
        {
            drank += full;
            empty += full;
            full = 0;

            full = empty / numExchange;
            empty = empty - full * numExchange;

            if (empty < numExchange && full == 0)
            {
                break;
            }
        }
        return drank;
    }
};