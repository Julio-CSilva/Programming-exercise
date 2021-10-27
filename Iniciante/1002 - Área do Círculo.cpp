#include <iostream>
#include <cmath> //biblioteca de funções matematicas
#include <iomanip> //bibliotecas de funções para formatar numeros

using namespace std;

int main(){

    double n = 3.14159;
    double area, raio;
    
    cin >> raio;
    area = n * pow(raio, 2);

    cout << fixed;
    cout << "A=" << setprecision(4) << area << endl;
    
    return 0;
}