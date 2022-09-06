#include <iostream>
#include <iomanip>

using namespace std;

int main(){

    char nome[10];
    double salario, venda;
    
    cin >> nome >> salario >> venda;
    
    salario += venda * 0.15;
    
    cout << fixed;
    cout << "TOTAL = R$ " << setprecision(2) << salario << endl;

    return 0;
}