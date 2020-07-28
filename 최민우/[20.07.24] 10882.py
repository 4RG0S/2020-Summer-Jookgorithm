"""
입력
The first line of the input contains an integer N (1 ≤ N ≤ 50) — the number of co-workers.
The next line contains the meeting time in YJ’ s time zone in UTC notation,
HH : MM UTC+D (−12 ≤ D ≤ 12). The time and the text UTC are separated by a single whitespace.

Each of the next N line contains the time zone for a co-worker.
Times are represented as HH : MM, in the standard 24-hour clock convention which makes noon as 12:00, and 12 midnight as 00:00.
The last minute of the day is 23:59, and you may not write 12 midnight as 24:00.

출력
Print exactly N lines — each line should contain the converted time in each co-worker’s time zone.
"""


def UTCtoMin(standard, toward, minute):
    standard, toward = standard.replace('UTC', ''), toward.replace('UTC', '')
    standard = int(standard) * 60 if '.' not in standard else int(standard.split('.')[0]) * 60 + int(
        standard.split('.')[1]) * 6
    toward = int(toward) * 60 if '.' not in toward else int(toward.split('.')[0]) * 60 + int(toward.split('.')[1]) * 6

    diff = int(eval(str(toward) + '-' + str(standard)))
    return minute + diff


def MinToTime(minute):
    minute %= 24 * 60
    return [minute // 60, minute % 60]


def TimeToMin(time):
    hour, minute = int(time.split(':')[0]), int(time.split(':')[1])
    return hour * 60 + minute


N = int(input())
std_time, std_utc = input().split()
std_time = TimeToMin(std_time)

for _ in range(N):
    h, m = MinToTime(UTCtoMin(std_utc, input(), std_time))
    print('%02d:%02d' % (h, m))
