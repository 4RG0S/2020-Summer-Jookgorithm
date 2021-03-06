//#include <stdio.h>
//
//int arr[200002];
//int size = 0;
//
//void swap(int *a, int *b) {
//    int tmp = *a;
//    *a = *b;
//    *b = tmp;
//}
//void insert(int val) {
//    int idx, p_idx;
//    ++size;
//    arr[size] = val;
//    idx = size;
//    p_idx = idx / 2;
//
//    while(p_idx > 0 && arr[idx] > arr[p_idx]) {
//        swap(&arr[idx], &arr[p_idx]);
//        idx = p_idx;
//        p_idx = idx / 2;
//    }
//}
//
//int delete() {
//     if(size == 0)
//         return 0;
//
//     int l, r, max_idx, idx = 1, delete_num = arr[1];
//     arr[1] = arr[size];
//     arr[size] = 0;
//     --size;
//
//     while(idx * 2 <= size) {
//         max_idx = idx * 2;
//         r = max_idx + 1;
//         if(r <= size && arr[max_idx] < arr[r])
//             ++max_idx;
//
//         if(arr[idx] > arr[max_idx])
//             break;
//
//         swap(&arr[idx], &arr[max_idx]);
//         idx = max_idx;
//     }
//
//     return delete_num;
//}
//
//int main() {
//    int n, x, i, j;
//
//    scanf("%d", &n);
//    for(i = 0; i < n; ++i) {
//        scanf("%d", &x);
//        if(x == 0)
//            printf("%d\n", delete());
//        else
//            insert(x);
//    }
//}