//
// Created by Dandalf on 2020-08-18.
//

#include <algorithm>
#include <vector>
#include <iostream>

using namespace std;

vector<int> dp(30 + 1, 0);

int getDP(int num) {
    for (int i = 4; i <= num; i += 2) {
        dp[i] = dp[2] * (2 + dp[i - 2]) + 2;
    }
    return dp[num];
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    int n;
    cin >> n;
    dp[0] = 1, dp[2] = 3;

    int result = (n % 2 == 0) ? getDP(n) : 0;
    cout << result;
    return 0;
}