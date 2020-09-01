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
    int n, result;
    cin >> n;
    vector<int> ar(n, 0);
    vector<int> dp(n, 0);
    for (int i = 0; i < n; i++) {
        cin >> ar[i];
    }
    for (int i = 0; i < n; i++) {
        if (i == 0)
            dp[i] = ar[i];
        else if (i == 1)
            dp[i] = ar[i] + ar[i - 1];
        else if (i == 2)
            dp[i] = max(ar[i] + dp[i - 2], ar[i] + ar[i - 1]);
        else
            dp[i] = max(ar[i] + dp[i - 2], ar[i] + ar[i - 1] + dp[i - 3]);
    }
    cout << dp[n - 1];
}