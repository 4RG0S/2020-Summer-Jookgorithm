def _2505_front(array):
    # 0, 1, 2, 3, 4, ..., n
    result = ''
    for t in range(2):
        for i in range(1, length + 1):
            if array[i] != i:
                result += '%d %d\n' % (i, array.i(i))
                array[i:array.i(i) + 1] = array[array.i(i):i - 1:-1]
                break

    for i in range(1, length + 1):
        if array[i] != i:
            return False

    if result.count('\n') != 2:
        for i in range(2 - result.count('\n')):
            result = '1 1\n' + result

    return result


def _2505_back(array):
    result = ''
    for t in range(2):
        # 0, 1, 2, 3, 4, 5
        # 0, n, n-1, ...
        for i in range(1, length + 1):
            if array[i] != length - i + 1:
                result += '%d %d\n' % (length - array.i(length - i + 1) + 1, length - i + 1)
                array[i:array.i(length - i + 1) + 1] = array[array.i(length - i + 1):i - 1:-1]
                break

    if result.count('\n') != 2:
        for i in range(2 - result.count('\n')):
            result = '1 1\n' + result

    return result


length = int(input())
nums = list(map(int, input().split()))
rev_nums = list(reversed(nums))
rev_nums.insert(0, 0)
nums.insert(0, 0)

final = _2505_front(nums)
if final:
    print(final)
else:
    print(_2505_back(rev_nums))
