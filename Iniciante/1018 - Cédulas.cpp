#include <iostream>

using namespace std;

int main(){

    int x=0, valor, nota100=0, nota50=0, nota20=0, nota10=0, nota5=0, nota2=0, nota1=0;
    
    cin >> valor;
    x = valor;
    while(valor != 0){
        if (valor >= 100){
            valor -= 100;
            nota100++;
        } else if(valor >= 50){
            valor -= 50;
            nota50++;
        } else if(valor >= 20){
            valor -= 20;
            nota20++;
        } else if(valor >= 10){
            valor -= 10;
            nota10++;
        } else if(valor >= 5){
            valor -= 5;
            nota5++;
        } else if(valor >= 2){
            valor -= 2;
            nota2++;
        } else {
            valor -= 1;
            nota1++;
        }
    }
    
    cout << x << endl;
    cout << nota100 << " nota(s) de R$ 100,00" << endl;
    cout << nota50 << " nota(s) de R$ 50,00" << endl;
    cout << nota20 << " nota(s) de R$ 20,00" << endl;
    cout << nota10 << " nota(s) de R$ 10,00" << endl;
    cout << nota5 << " nota(s) de R$ 5,00" << endl;
    cout << nota2 << " nota(s) de R$ 2,00" << endl;
    cout << nota1 << " nota(s) de R$ 1,00" << endl;
    
    return 0;
}