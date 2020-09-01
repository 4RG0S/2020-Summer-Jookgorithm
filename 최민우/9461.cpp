//
// Created by Dandalf on 2020-08-19.
//

#include <algorithm>
#include <vector>
#include <iostream>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    vector<long long int> dp;
    dp.push_back(1); dp.push_back(1); dp.push_back(1);
    dp.push_back(2); dp.push_back(2);

    int n;
    cin >> n;
    vector<int> input;

    int max_value = 0;
    for (int i = 0; i < n; i++){
        int var;
        cin >> var;
        input.push_back(var);
        max_value = max(max_value, var);
    }

    for(int i = 5; i < max_value; i++) {
        dp.push_back(dp[i - 1] + dp[i - 5]);
    }

    for (int i = 0; i < n; i++) {
        cout << dp[input[i] - 1] << '\n';
    }
    return 0;
}