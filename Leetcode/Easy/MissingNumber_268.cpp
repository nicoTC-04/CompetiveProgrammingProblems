#include <vector>
#include <string>
#include <iostream>
#include <unordered_set>
#include <algorithm>

using namespace std;

class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int n = nums.size();
        unordered_set <int> s(n);
        for(int i:nums){
            s.insert(i);
        }
        for(int i=0; i<n; i++){
            if(s.find(i)==s.end()){
                return i;
            }
        }
        return n;
    }
};