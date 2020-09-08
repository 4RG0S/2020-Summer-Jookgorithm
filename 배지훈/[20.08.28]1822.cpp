//#include <iostream>
//#include <vector>
//#include <algorithm>
//
//using namespace std;
//int visit[500001];
//int union_a[500001];
//int main() {
////    vector<int> union_a;
//    int size_a, size_b;
//    int input_val, total_num, target, cnt = 0;
//    scanf("%d", &size_a);
//    scanf("%d", &size_b);
//
//    for (int i = 0; i < size_a; ++i) {
//        scanf("%d", &input_val);
////        union_a.push_back(input_val);
//        union_a[i] = input_val;
//    }
//    sort(union_a, union_a + size_a);
//
//    for (int j = 0; j < size_b; ++j) {
//        int l = 0, r = size_a - 1;
//        int mid = (l + r) / 2;
//        scanf("%d", &input_val);
//
//        while (l <= r) {
//            if (union_a[mid] == input_val) {
//                ++cnt;
//                visit[mid] = 1;
//                break;
//            } else if (union_a[mid] > input_val) {
//                r = mid - 1;
//                mid = (l + r) / 2;
//            } else if (union_a[mid] < input_val) {
//                l = mid + 1;
//                mid = (l + r) / 2;
//            }
//        }
//    }
//    total_num = size_a - cnt;
//    if(total_num != 0) {
//        printf("%d\n", total_num);
//        for (int k = 0; k < size_a; ++k) {
//            if(visit[k] == 0) {
//                printf("%d ", union_a[k]);
//            }
//        }
//    } else {
//        printf("0");
//    }
//}