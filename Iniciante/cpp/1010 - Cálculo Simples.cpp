#include <iostream>
#include <iomanip>

using namespace std;

int main(){

    int peca1, peca2, quantidade1, quantidade2;
    float valor1, valor2, total;
    
    cin >> peca1 >> quantidade1 >> valor1;
    cin >> peca2 >> quantidade2 >> valor2;
    
    total = (quantidade1 * valor1) + (quantidade2 * valor2);
    
    cout << fixed;
    cout << "VALOR A PAGAR: R$ " << setprecision(2) << total << endl;

    return 0;
}