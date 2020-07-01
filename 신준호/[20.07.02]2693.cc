#include <iostream>
#include <cmath>
#include <algorithm>

int main() {
    
    int n;
    int arr[10];
    std::cin >> n;
    for(int i = 0; i < n; i++) {
        for(int j = 0; j < 10; j++)
            std::cin >> arr[j];
        std::sort(arr, arr+10);
        std::cout << arr[7] << std::endl;
    }

    return 0;
}