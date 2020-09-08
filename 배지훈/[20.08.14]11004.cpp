#include <iostream>
#include <string>
#include <algorithm>
#include <vector>
using namespace std;

int main(int argc, char *argv[])
{
    int n, m;
    int num;
    vector<int> v;

    scanf("%d", &n);
    scanf("%d", &m);

    for (int i = 0; i < n; ++i) {
        scanf("%d", &num);
        v.push_back(num);
    }

    sort(v.begin(), v.end());

    printf("%d\n", v[m - 1]);

    return 0;
}
