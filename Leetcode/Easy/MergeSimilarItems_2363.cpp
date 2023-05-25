#include <vector>
#include <string>
#include <iostream>
#include <map>
#include <algorithm>

using namespace std;

class Solution {
public:
    vector<vector<int>> mergeSimilarItems(vector<vector<int>>& items1, vector<vector<int>>& items2) {
        map<int, int> mp;

        for(auto i: items1){
            mp[i[0]] += i[1];
        }
        for(auto i: items2){
            mp[i[0]] += i[1];
        }
        
        vector<vector<int>> ret;
        for(auto i: mp){
            ret.push_back({i.first, i.second});
        }
        return ret;
    }
};