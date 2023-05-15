#include <string>
#include <unordered_map>
#include <stdlib.h>

using namespace std;

class Solution {
public:
    int romanToInt(string s) {
        unordered_map<char,int> m;
        m['I']=1;
        m['V']=5;
        m['X']=10;
        m['L']=50;
        m['C']=100;
        m['D']=500;
        m['M']=1000;

        int numero=0;

        for(int i=0;i<s.length();i++){
            if (i == s.length()-1){ 
                numero += m.at(s[i]);
            }else{
                if(m.at(s[i]) < m.at(s[i+1])){
                    numero+=m.at(s[i+1])-m.at(s[i]);
                    i++;
                }else{
                    numero+=m.at(s[i]);
                }
            }
        }

        return numero;
    }
};