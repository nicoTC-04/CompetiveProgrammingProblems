#include <vector>
#include <string>
#include <iostream>
#include <unordered_map>
#include <algorithm>

using namespace std;

class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        vector<string> ordStrs(strs);
        unordered_map <string, int> um;
        vector<vector<string>> sol;
        vector<string> emp;
        string sorted;

        for(int i=0; i<ordStrs.size(); i++){
            sort(ordStrs[i].begin(),ordStrs[i].end());
        }

        string temp;
        int count = 0;

        for(int i=0; i<ordStrs.size(); i++){
            temp = ordStrs[i];
            
            if(um.find(temp) == um.end()){
                um[temp]=count;
                sol.push_back(emp);
                count++;
            }
            sol[um[temp]].push_back(strs[i]);
        }
        return sol;
    }
};