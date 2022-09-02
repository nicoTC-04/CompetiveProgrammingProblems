#include <iostream>
#include <string>
#include <deque>

//#include <bits/stdc++.h>

using std::deque;
using std::string;
using std::getline;
using std::cin;
using std::cout;
#define endl "\n"

int main(){
    
    string inputLine;
    bool Start;
    
    while(getline(cin, inputLine)){ // Toma la entrada y la guarda en "inputLine"
        
        deque<string> textoFinal; //deque = Doubly Linked List
        string Caracteres_acumulados = "";
        
        Start = false;
        
        for(int i = 0; i < inputLine.size(); ++i){
    
            if(inputLine[i] == '['){
                if(Start) 
                    textoFinal.push_front(Caracteres_acumulados);
                else
                    textoFinal.push_back(Caracteres_acumulados);
                
                Start = true;
                Caracteres_acumulados = ""; 
            }
            
            else if(inputLine[i] == ']'){
                if(Start)
                    textoFinal.push_front(Caracteres_acumulados);
                else 
                    textoFinal.push_back(Caracteres_acumulados);
             
                Start = false; 
                Caracteres_acumulados = ""; 
            }
            else 
                Caracteres_acumulados = Caracteres_acumulados + inputLine[i];
        }
        
        if(Start) 
            textoFinal.push_front(Caracteres_acumulados);
        
        else 
            textoFinal.push_back(Caracteres_acumulados);
        
        for (auto &i: textoFinal) {
            cout << i;
        }
        printf("\n");
    }
 
    return 0;
}
