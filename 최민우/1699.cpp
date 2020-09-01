//
// Created by Dandalf on 2020-08-18.
//

#include <algorithm>
#include <vector>
#include <iostream>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    vector<int> dp;
    dp.push_back(0);

    int n;
    cin >> n;

    if (n == 1){
        cout << '1';
    }
    else{
        for(int i = 1; i <= n; i++) {
            int result = -1;
            for(int j = 1; j * j <= i; j++) {
                if (result == -1)
                    result = dp[i - j * j];
                else
                    result = min(result, dp[i - j * j]);
            }
            dp.push_back(result + 1);
        }

        cout << dp[n];
    }
    return 0;
}