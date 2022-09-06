#include <iostream>
#include <iomanip>

using namespace std;

int main(){

    int n, horas;
    float salario, salario_total;
    
    cin >> n >> horas >> salario;
    
    salario_total = horas * salario;
    
    cout << "NUMBER = " << n << endl;
    cout << fixed;
    cout << "SALARY = U$ " << setprecision(2) << salario_total << endl;

    return 0;
}