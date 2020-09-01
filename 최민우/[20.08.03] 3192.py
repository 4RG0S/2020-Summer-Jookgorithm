"""
first IDEA:
    우선 행과 열에 0이 포함한 개수를 나타내는 배열을 만든다
    그중 0이 존재하지 않는 배열을 통해 매직 넘버를 구한다
    매직 넘버를 토대로 0의 개수가 1인 라인을 채운다
    위 방식을 반복하여 매직 스퀘어를 채운다
second IDEA:
    위의 방법을 생각하마자 그냥 빈간을 모두 두칸씩 채우면 어떡하나 고민했지만
    우선 구현을 먼저 해보고 생각해보기로 했다.
"""


def getMagicNumber():
    for i in range(3):
        if col[i] == 0:
            print(i)
            return sum(magic_square[j][i] for j in range(3))
        if row[i] == 0:
            print(i)
            return sum(magic_square[i][j] for j in range(3))
    return None


def countZero():
    zero_col = [0, 0, 0]
    zero_row = [0,
                0,
                0]

    for y in range(3):
        for x in range(3):
            if magic_square[y][x] == 0:
                zero_col[x] += 1
                zero_row[y] += 1

    return zero_col, zero_row


magic_square = list(list(map(int, input().split())) for _ in range(3))
col, row = countZero()
magic_number = getMagicNumber()

while True:
    col, row = countZero()
    if sum(col) + sum(row) == 0:
        break