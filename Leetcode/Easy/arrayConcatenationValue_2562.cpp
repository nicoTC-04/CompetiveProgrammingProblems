#include <iostream>
#include <stdlib.h>
#include <string>
#include <vector>
#include <deque>

using namespace std;

class Solution
{
public:
    long long findTheArrayConcVal(vector<int> &nums)
    {
        deque<int> dq;
        long long sums = 0;
        int front, back;
        string n;
        for (int i : nums)
        {
            dq.push_back(i);
        }

        while (dq.size() > 1)
        {
            n = to_string(dq.front()) + to_string(dq.back());
            sums += stoll(n);
            dq.pop_back();
            dq.pop_front();
        }
        if (dq.size() == 1)
        {
            sums += dq.front();
        }

        return sums;
    }
};