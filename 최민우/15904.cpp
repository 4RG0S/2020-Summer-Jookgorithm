//
// Created by Dandalf on 2020-08-26.
//

#include <iostream>
#include <string>
#include <algorithm>

using namespace std;

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);
    string UCPC = "UCPC";
    string input;
    getline(cin, input);

    int index = 0;
    for (char i : input) {
        if (i == UCPC[index]) {
            index++;
            if (index == 4)
                break;
        }
    }
    cout << ((index == UCPC.length()) ? "I love UCPC" : "I hate UCPC");
    return 0;
}