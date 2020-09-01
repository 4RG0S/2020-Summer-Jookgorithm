//
// Created by Dandalf on 2020-08-26.
//

#include <iostream>
#include <string>
#include <algorithm>
#include <vector>

using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    vector<int> w(10);
    vector<int> k(10);

    for(int i = 0; i < 10; i++)
        cin >> w[i];
    for(int i = 0; i < 10; i++)
        cin >> k[i];

    sort(w.begin(), w.end());
    sort(k.begin(), k.end());

    cout << w[9] + w[8] + w[7] << ' ' << k[9] + k[8] + k[7];
    return 0;
}