#include <complex>
#include <queue>
#include <set>
#include <unordered_set>
#include <list>
#include <chrono>
#include <random>
#include <iostream>
#include <algorithm>
#include <cmath>
#include <string>
#include <vector>
#include <map>
#include <unordered_map>
#include <stack>
#include <iomanip>
#include <fstream>

using namespace std;

int main()
{
#ifndef ONLINE_JUDGE
    freopen("input.txt", "r", stdin);
    freopen("output.txt", "w", stdout);
#endif

    int ballons;
    cin >> ballons;

    unordered_multiset<int> arrows;
    int height;

    for (int i = 0; i < ballons; i++)
    {
        cin >> height;
        if (arrows.empty())
        {
            arrows.insert(height - 1);
            continue;
        }
        if (arrows.find(height) == arrows.end())
        {
            arrows.insert(height - 1);
            continue;
        }
        else
        {
            arrows.erase(arrows.equal_range(height).first);
            arrows.insert(height - 1);
        }
    }

    cout << arrows.size();

    return 0;
}