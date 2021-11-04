#include <iostream>
#include <cmath>
 
using namespace std;
 
int main() {
 
    int nota100, nota50, nota20, nota10, nota5, nota2;
    int moeda100=0, moeda50=0, moeda25=0, moeda10=0, moeda5=0, moeda1=0;
    double valor_total;
    
    
    cin >> valor_total;
    
    nota100 = valor_total/100;
    valor_total -= nota100*100;
    nota50 = valor_total/50;
    valor_total -= nota50*50;
    nota20 = valor_total/20;
    valor_total -= nota20*20;
    nota10 = valor_total/10;
    valor_total -= nota10*10;
    nota5 = valor_total/5;
    valor_total -= nota5*5;
    nota2 = valor_total/2;
    valor_total -= nota2*2;
    
    while(valor_total >= 1.0){
        moeda100++;
        valor_total -= 1.0;
    }
    while(valor_total >= 0.50){
        moeda50++;
        valor_total -= 0.50;
    }
    while(valor_total >= 0.25){
        moeda25++;
        valor_total -= 0.25;
    }
    while(valor_total >= 0.10){
        moeda10++;
        valor_total -= 0.10;
    }
    while(valor_total >= 0.05){
        moeda5++;
        valor_total -= 0.05;
    }
    while(valor_total >= 0.01){
        moeda1++;
        valor_total -= 0.01;
    }
    
    if(valor_total >= 0.005){
        moeda1 += 1;
    }

    
    cout << "NOTAS:" << endl;
    cout << nota100 << " nota(s) de R$ 100.00" << endl;
    cout << nota50 << " nota(s) de R$ 50.00" << endl;
    cout << nota20 << " nota(s) de R$ 20.00" << endl;
    cout << nota10 << " nota(s) de R$ 10.00" << endl;
    cout << nota5 << " nota(s) de R$ 5.00" << endl;
    cout << nota2 << " nota(s) de R$ 2.00" << endl;
 
    cout << "MOEDAS:" << endl;
    cout << moeda100 << " moeda(s) de R$ 1.00" << endl;
    cout << moeda50 << " moeda(s) de R$ 0.50" << endl;
    cout << moeda25 << " moeda(s) de R$ 0.25" << endl;
    cout << moeda10 << " moeda(s) de R$ 0.10" << endl;
    cout << moeda5 << " moeda(s) de R$ 0.05" << endl;
    cout << moeda1 << " moeda(s) de R$ 0.01" << endl;
    

    return 0;
}