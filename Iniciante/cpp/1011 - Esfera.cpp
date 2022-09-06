#include <iostream>
#include <iomanip>
#include <cmath>

using namespace std;

int main(){

    double VOLUME, R;
    double pi = 3.14159;
    cin >> R;
    
    VOLUME = (4.0/3) * (pi) * pow(R, 3);

    cout << fixed;
    cout << "VOLUME = " << setprecision(3) << VOLUME << endl;

    return 0;
}