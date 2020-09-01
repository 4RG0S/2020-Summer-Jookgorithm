//
// Created by Dandalf on 2020-08-19.
//

#include <algorithm>
#include <iostream>
#include <vector>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    int n, k;
    cin >> n;
    cin >> k;

    vector<vector<long long int>> dp;
    for (int i = 0; i < n + 1; i++) {
        vector<long long int> var(k + 1, 0);
        dp.push_back(var);
    }

    for (int i = 0; i <= n; i++) {
        dp[i][1] = 1;
    }

    for (int i = 1; i <= k; i++) {
        for(int q = 0; q <= n; q++) {
            for (int p = 0; p <= q; p++) {
                dp[q][i] += dp[p][i - 1] % 1000000000;
            }
            dp[q][i] %= 1000000000;
        }
    }

    cout << dp[n][k] % 1000000000;
    return 0;
}