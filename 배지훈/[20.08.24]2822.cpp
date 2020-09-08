//#include <iostream>
//#include <vector>
//#include <algorithm>
//
//using  namespace std;
//
//int main() {
//    vector <pair<int, int>> a;
//    vector <int> b;
//    int input, sum = 0;
//    for(int i = 1; i <= 8; ++i) {
//        cin >> input;
//        a.push_back(pair<int, int>(input, i));
//    }
//    sort(a.begin(), a.end());
//
//    for(int i = 3; i < 8; ++i) {
//        sum += a[i].first;
//        b.push_back(a[i].second);
//    }
//    cout << sum << endl;
//    sort(b.begin(), b.end());
//
//    for(int i = 0; i < b.size(); ++i) {
//        cout << b[i] << " ";
//    }
//}