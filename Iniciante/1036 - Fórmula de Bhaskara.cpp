#include <iostream>
#include <iomanip>
#include <cmath>
 
using namespace std;

void bhaskara(double A, double B, double C){
    double delta, r1, r2;
    delta = sqrt(pow(B, 2) - (4*A*C));
    r1 = ((-1*B) + delta)/(2*A);
    r2 = ((-1*B) - delta)/(2*A);
    
    cout << fixed;
    cout << "R1 = " << setprecision(5) << r1 << endl;
    cout << "R2 = " << setprecision(5) << r2 << endl;
}
 
int main() {
 
    double A, B, C;
    
    cin >> A >> B >> C;
    
    if(((pow(B, 2) - 4*A*C) > 0) & ((2*A) != 0)){
        bhaskara(A, B, C);
    } else {
        cout << "Impossivel calcular" << endl;
    }
 
    return 0;
}