#include <iostream>
 
using namespace std;
 
int main() {
 
    int segundos=0, minutos=0, horas=0, tempo_total;
    
    cin >> tempo_total;
    
    horas = tempo_total/3600;
    tempo_total = tempo_total - (3600*horas);
    minutos = tempo_total/60;
    tempo_total = tempo_total - (60*minutos);
    segundos = tempo_total;
    
    cout << horas << ":" << minutos << ":" << segundos << endl;
 
    return 0;
}