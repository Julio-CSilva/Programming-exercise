#include <iostream>
 
using namespace std;
 
int main() {
 
    int ano, mes, dia, tempo_total;
    
    cin >> tempo_total;
    
    ano = tempo_total/365;
    tempo_total -= ano*365;
    mes = tempo_total/30;
    tempo_total -= mes*30;
    dia = tempo_total;
    
    cout << ano << " ano(s)" << endl;
    cout << mes << " mes(es)" << endl;
    cout << dia << " dia(s)" << endl;
 
    return 0;
}