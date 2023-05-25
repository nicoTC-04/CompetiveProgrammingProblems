#include <unordered_set>
#include <vector>
#include <iostream>

using namespace std;

class Solution {
public:
    bool isValidSudoku(vector<vector<char>>& board) {
        unordered_set <char> us;
        char temp;

        for(int i=0; i<9; i++){
            us.clear();
            for(int j=0; j<9; j++){
                temp = board[i][j];
                if(temp == '.'){continue;}
                if(us.find(temp) == us.end()){
                    us.insert(temp);
                }else{
                    return false;
                }
            }
        }
        for(int i=0; i<9; i++){
            us.clear();
            for(int j=0; j<9; j++){
                temp = board[j][i];
                if(temp == '.'){continue;}
                if(us.find(temp) == us.end()){
                    us.insert(temp);
                }else{
                    return false;
                }
            }
        }
        for(int l=0; l<3; l++){
            for(int k=0; k<3; k++){
                us.clear();
                for(int i=0; i<3; i++){
                    for(int j=0; j<3; j++){
                        temp = board[i+(l*3)][j+(k*3)];
                        if(temp == '.'){continue;}
                        if(us.find(temp) == us.end()){
                            us.insert(temp);
                        }else{
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
};