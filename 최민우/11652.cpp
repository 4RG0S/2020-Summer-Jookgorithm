//
// Created by Dandalf on 2020-08-26.
//

#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    long long R, r;
    cin >> R >> r;

    long long result = (R * R) - (2 * r * R);
    cout << result;
    return 0;
}