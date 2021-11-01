#include <iostream>
#include <iomanip>

using namespace std;

int main(){

    int tempo, velocidade;
    double gasolina, distancia;
    
    cin >> tempo >> velocidade;
    
    distancia = (float)velocidade * (float)tempo;
    gasolina = distancia/12;

    cout << fixed;
    cout << setprecision(3) << gasolina << endl;

    return 0;
}