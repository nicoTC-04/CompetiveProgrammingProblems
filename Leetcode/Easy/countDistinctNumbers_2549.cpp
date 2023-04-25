#include <iostream>
#include <stdlib.h>
#include <unordered_set>

using namespace std;

class Solution
{
public:
    int distinctIntegers(int n)
    {
        unordered_set<int> board;
        board.insert(n);
        int count = 1;
        while (true)
        {
            bool x = true;
            for (int i : board)
            {
                for (int j = 2; j < i; j++)
                {
                    if (i % j == 1)
                    {
                        unordered_set<int>::const_iterator got = board.find(j);
                        if (got == board.end())
                        {
                            x = false;
                            board.insert(j);
                            count++;
                        }
                    }
                }
            }
            if (x)
            {
                break;
            }
        }
        return count;
    }
};