//#include <iostream>
//#include <vector>
//
//using namespace std;
//
//int main() {
//    vector <char> sequence;
//    vector <char> word;
//    int i = 0, cnt = 0;
//    char b;
//
//    cin.get(b);
//    while(b != '\n') {
//        sequence.push_back(b);
//        cin.get(b);
//    }
//
//    cin.get(b);
//    while(b != '\n') {
//        word.push_back(b);
//        cin.get(b);
//    }
//
//    while(!sequence.empty() && sequence.size() >= word.size()) {
//        if(sequence[i] == word[i]) {
//            if(i == word.size() - 1) {
//                ++cnt;
//                sequence.erase(sequence.begin(), sequence.begin() + i + 1);
//                i = 0;
//            } else {
//                ++i;
//            }
//        } else {
//            sequence.erase(sequence.begin());
//            i = 0;
//        }
//    }
//
//    cout << cnt;
//}