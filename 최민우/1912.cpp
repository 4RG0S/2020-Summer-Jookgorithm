//
// Created by Dandalf on 2020-08-18.
//

#include <algorithm>
#include <iostream>
#include <vector>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    // Input()
    int n, result;
    cin >> n;
    vector<int> ar(n, 0);
    vector<int> dp(n, 0);

    for (int i = 0; i < n; i++) {
        cin >> ar[i];
    }
    dp.assign(ar.begin(), ar.end());

    result = dp[0];
    for (int i = 1; i < n; i++) {
        dp[i] += dp[i - 1] > 0 ? dp[i - 1] : 0;
        result = max(dp[i], result);
    }
    cout << result;
}