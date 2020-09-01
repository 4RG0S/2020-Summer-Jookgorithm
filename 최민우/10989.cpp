//
// Created by Dandalf on 2020-08-19.
//

#include <algorithm>
#include <iostream>
#include <vector>
#include <string>
#include <tuple>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    int n, k;
    cin >> n;
    vector<int> arr(10000 + 1, 0);

    for (int i = 0; i < n; i++) {
        cin >> k;
        arr[k]++;
    }
    for(int i = 1; i <= 10000 + 1; i++) {
        if (arr[i]) {
            for (int j = 0; j < arr[i]; j++) {
                cout << i << '\n';
            }
        }

    }
    return 0;
}