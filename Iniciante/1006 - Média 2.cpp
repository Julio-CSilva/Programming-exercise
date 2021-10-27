#include <iostream>
#include <iomanip>

using namespace std;

int main(){

    float A, B, C, MEDIA;
    cin >> A >> B >> C;
    
    MEDIA = ((A*2)+(B*3)+(C*5)) / 10;

    cout << fixed;
    cout << "MEDIA = " << setprecision(1) << MEDIA << endl;

    return 0;
}