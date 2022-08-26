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
    // string es un array de caracteres dinámico
    // char es un array de caracteres estático
    while(getline(cin, inputLine)){ // Toma la entrada y la guarda en "inputLine"
        // Inicialización de variables
        deque<string> textoFinal; //deque = Doubly Linked List
        string Caracteres_acumulados = "";  // CualquierTexto{12345
                                            // 54321CualquierTexto{
        Start = false;
        // Analizar caracter por caracter
        for(int i = 0; i < inputLine.size(); ++i){
    
            // Comprobar si está la señal de inicio
            if(inputLine[i] == '['){
                // start == true 
                if(Start) 
                    textoFinal.push_front(Caracteres_acumulados);
                else // start == false
                    textoFinal.push_back(Caracteres_acumulados);
                // Variables Reset
                Start = true;
                Caracteres_acumulados = ""; 
            }
            
            // Comprobar si está la señal de final
            else if(inputLine[i] == ']'){
                if(Start) // start == true 
                    textoFinal.push_front(Caracteres_acumulados);
                else  // start == false
                    textoFinal.push_back(Caracteres_acumulados);
                // Variables Reset
                Start = false; 
                Caracteres_acumulados = ""; 
            }
            
            // Sino hay ninguna señal, simplemente agregar el texto entrante
            else 
                Caracteres_acumulados = Caracteres_acumulados + inputLine[i];
        }
        
        // Esto ultimo es para cuando sale del for, por si quedan caracteres que agregar
        if(Start) 
            textoFinal.push_front(Caracteres_acumulados);
        
        else 
            textoFinal.push_back(Caracteres_acumulados);
        
        // Print
        for (auto &i: textoFinal) {
            cout << i;
        }
        printf("\n");
    }
 
    return 0;
}