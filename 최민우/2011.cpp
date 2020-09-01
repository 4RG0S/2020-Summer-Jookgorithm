//
// Created by Dandalf on 2020-08-19.
//

#include <algorithm>
#include <iostream>
#include <vector>
#include <utility>
#include <string>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    int n;
    cin >> n;

    vector<pair<int, string>> arr(n);
    for (int i = 0; i < n; i++) {
        cin >> arr[i].first >> arr[i].second;
    }

    stable_sort(arr.begin(), arr.end(), [](const pair<int, string> a, const pair<int, string> b) -> bool {
        return a.first < b.first;
    });

    for (int i = 0; i < n; i++) {
        cout << arr[i].first << ' ' << arr[i].second << '\n';
    }

    return 0;
}