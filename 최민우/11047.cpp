//
// Created by Dandalf on 2020-08-27.
//

#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    int n, k;
    cin >> n >> k;

    vector<int> nums(n);

    for (int i = 0; i < n; i++) {
        cin >> nums[i];
    }
    int count = 0;
    for (int i = n - 1; i >= 0; i--) {
        while (nums[i] <= k) {
            count++;
            k -= nums[i];
        }
        if (k == 0)
            break;
    }
    cout << count;
    return 0;
}