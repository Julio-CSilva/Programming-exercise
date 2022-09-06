#include <iostream>

int main(){

    int a, b, c;
    
    std::cin >> a >> b >> c;
    
    if(a >= b && a >= c){
        std::cout << a << " eh o maior" << std::endl;
    } else if(b >= a && b >= c){
        std::cout << b << " eh o maior" << std::endl;
    } else {
        std::cout << c << " eh o maior" << std::endl;
    }


    return 0;
}