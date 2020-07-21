dirs = [(0, 0), (1, 0), (0, 1), (1, 1)]


def isPosIn(n, left_up_pos):
    """
    :param n: 이 배열의 크기는 2 ** n x 2 ** n 입니다.
    :param left_up_pos: 배열의 좌측상단의 좌표입니다 [x, y] 형태로 입력받습니다
    :return: r, c가 주어진 범위 내에 있는지 여부를 boolean 값으로 반환합니다
    """
    x1, y1 = left_up_pos
    x2, y2 = x1 + 2 ** n, y1 + 2 ** n
    return x1 <= c <= x2 and y1 <= r <= y2


def _1074(n, left_up_pos):
    global count
    x, y = left_up_pos
    if n == 0:
        print(count)
        return
    length = 2 ** (n - 1)
    for dx, dy in dirs:
        if isPosIn(n - 1, [x + (dx * length), y + (dy * length)]):
            _1074(n - 1, [x + (dx * length), y + (dy * length)])
            return
        else:
            count += length * length


count = 0
N, r, c = map(int, input().split())
r, c = r + 1, c + 1
_1074(N, [0, 0])
