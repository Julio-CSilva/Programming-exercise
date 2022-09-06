#include <iostream>
#include <iomanip>

using namespace std;

int main(){

    int X;
    float Y;
    double consumo;

    cin >> X >> Y;
    
    consumo = (float)X / Y;

    cout << fixed;
    cout << setprecision(3) << consumo << " km/l" << endl;

    return 0;
}