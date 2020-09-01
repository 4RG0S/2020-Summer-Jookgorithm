//
// Created by Dandalf on 2020-08-27.
//

#include <iostream>
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

vector<vector<string>> DP;

string buf(int num) {
    if (num == 1)
        return "1";
    if (num == 2)
        return "-2";
    return buf(num - to_string(num).length() - 1).append("-").append(to_string(num));
}

string periodicity(int digit, int count) {
    return "";
}

void init_DP() {
    for (int i = 0; i < 3; i++) {
        vector<string> var = {""};
        DP.push_back(var);
    }
    vector<string> var = {"-2-4-6-8-11-14-17...", "1-3-5-7-9-12-15-1...", "1-3-5-7-10-13-16-..."};
    DP.push_back(var);
    for (int i = 3; i <= 1000009; i++) {

    }
}

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(nullptr);
    init_DP();

    int test_case;
    cin >> test_case;

    for(int i = 90; i < 101; i++) {
        cout << i << ' ' << buf(i) << '\n';
    }

//    for (int t = 0; t < test_case; t++) {
//        int a, b;
//        cin >> a >> b;
//    }

    return 0;
}