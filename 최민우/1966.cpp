//
// Created by Dandalf on 2020-08-26.
//

#include <iostream>
#include <string>
#include <queue>
#include <algorithm>

using namespace std;

int max_queue(queue<pair<int, int>> pQueue) {
    int max_value = pQueue.front().first;
    while (!pQueue.empty()) {
        max_value = max(max_value, pQueue.front().first);
        pQueue.pop();
    }
    return max_value;
}

int main() {
    ios::sync_with_stdio(false);
    cin.tie(nullptr);

    int test_case;
    cin >> test_case;

    for (int t = 0; t < test_case; t++) {
        int n, target_index;
        cin >> n >> target_index;

        // first = value, second = index
        queue<pair<int, int>> print_queue;
        for (int index = 0; index < n; index++) {
            int value;
            cin >> value;
            print_queue.push(make_pair(value, index));
        }
        int result = 0;
        while (true) {
            int max_value = max_queue(print_queue);
            if (print_queue.front().first == max_value) {
                result++;
                if (print_queue.front().second == target_index) {
                    cout << result << '\n';
                    break;
                }
                print_queue.pop();
            }
            else {
                print_queue.push(print_queue.front());
                print_queue.pop();
            }
        }
    }
}