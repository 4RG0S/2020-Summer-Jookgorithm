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
    vector<tuple<int, int, int, string>> arr(n);

    for (int i = 0; i < n; i++) {
        string name;
        int kor, eng, math;
        cin >> name >> kor >> eng >> math;
        arr[i] = make_tuple(-kor, eng, -math, name);
    }

    sort(arr.begin(), arr.end(), [](tuple<int, int, int, string> &a, tuple<int, int, int, string> &b) -> bool {
        return a < b;
    });

    for (int i = 0; i < n; i++) {
        cout << get<3>(arr[i]) << '\n';
    }

    return 0;
}