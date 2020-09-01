//
// Created by Dandalf on 2020-08-26.
//

#include <iostream>
#include <algorithm>

using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);

    string input;
    int test_case, cur = 65, result = 0;
    cin >> test_case;

    for (int t = 0; t < test_case; t++) {
        result = 0;
        cin >> input;
        for (int i : input) {
            result += min(i - cur, (cur - 65) + (65 + 25 - i) + 1);
            result++;
        }
        cout << result << '\n';
    }
    return 0;
}