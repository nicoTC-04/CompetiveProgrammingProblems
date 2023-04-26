#include <iostream>
#include <stdlib.h>
#include <stack>

using namespace std;

class Solution
{
public:
    bool backspaceCompare(string s, string t)
    {
        stack<char> sr;
        stack<char> st;

        for (char i : s)
        {
            if (i == '#' && sr.size() != 0)
            {
                sr.pop();
            }
            else if (i != '#')
            {
                sr.push(i);
            }
        }
        for (char i : t)
        {
            if (i == '#' && st.size() != 0)
            {
                st.pop();
            }
            else if (i != '#')
            {
                st.push(i);
            }
        }
        if (sr.size() != st.size())
        {
            return false;
        }

        while (sr.size() != 0)
        {
            if (sr.top() == st.top())
            {
                sr.pop();
                st.pop();
            }
            else
            {
                return false;
            }
        }
        return true;
    }
};