#include <queue>
#include <string>
#include <iostream>
#include <unordered_set>
#include <algorithm>

using namespace std;

class Solution {
public:
    char findTheDifference(string s, string t) {
        unordered_multiset <char> um;
        queue <char> q;
        for(auto i:t){q.push(i);}
        for(auto i:s){um.insert(i);}
        while(!q.empty()){
            char i = q.front();
            if(um.find(i)==um.end()){return i;}
            q.pop();
            um.erase(um.equal_range(i).first);
        }
        return 'm';
    }
};