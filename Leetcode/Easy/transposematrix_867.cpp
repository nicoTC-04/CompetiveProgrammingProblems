#include <iostream>
#include <stdlib.h>
#include <vector>

using namespace std;

class Solution
{
public:
    vector<vector<int>> transpose(vector<vector<int>> &matrix)
    {
        int m = matrix.size();
        int n = matrix[0].size();

        vector<vector<int>> newmatrix(n, vector<int>(m, 0));

        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                newmatrix[j][i] = matrix[i][j];
            }
        }

        return newmatrix;
    }
};