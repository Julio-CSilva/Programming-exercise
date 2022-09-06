#include <iostream>

using namespace std;

int main(){

    double distancia, tempo;
    
    cin >> distancia;
    
    tempo = distancia / 30 * 60;
    
    cout << tempo << " minutos" << endl;

    return 0;
}