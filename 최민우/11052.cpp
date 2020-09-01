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

    int n;
    cin >> n;
    vector<int> ar(n + 1, 0);
    vector<int> dp(n + 1, 0);
    for (int i = 1; i <= n; i++)
        cin >> ar[i];
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= i; j++) {
            dp[i] = max(dp[i], dp[i - j] + ar[j]);
        }
    }
    cout << dp[n];
    return 0;
}