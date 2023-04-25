#include <iostream>
#include <stdlib.h>
#include <queue>

using namespace std;

class Solution
{
public:
    int lastStoneWeight(vector<int> &stones)
    {
        priority_queue<int> allst;
        for (int i : stones)
        {
            allst.push(i);
        }

        while (true)
        {
            if (allst.size() == 1)
            {
                return allst.top();
            }
            else if (allst.size() == 0)
            {
                return 0;
            }
            int one = allst.top();
            allst.pop();
            int two = allst.top();
            allst.pop();
            if (one - two != 0)
            {
                allst.push(one - two);
            }
        }
    }
};