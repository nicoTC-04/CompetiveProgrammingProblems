#include <iostream>
#include <stdlib.h>
#include <vector>
#include <unordered_map>

using namespace std;

class Solution
{
public:
    vector<int> twoSum(vector<int> &nums, int target)
    {
        unordered_map<int, int> numbers;
        int index0, index1;

        for (int i = 0; i < nums.size(); i++)
        {

            numbers.emplace(nums.at(i), i);

            if ((numbers.count(target - nums.at(i)) > 0) && (numbers.at(target - nums.at(i)) != i))
            {
                index0 = numbers.at(target - nums.at(i));
                index1 = i;
                break;
            }
        }

        vector<int> ind;
        ind.push_back(index0);
        ind.push_back(index1);
        return ind;
    }
};