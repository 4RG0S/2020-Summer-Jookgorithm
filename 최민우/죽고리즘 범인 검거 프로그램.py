class player:
    def __init__(self, name):
        self.name = name
        self.work = [0, 0, 1]

    def addWork(self, work):
        self.work = [self.work[0], self.work[1], self.work[2] + work]

    def newDay(self):
        self.work = [self.work[1], self.work[2], 0]

    def isFinished(self):
        if self.work[2]:
            return True
        else:
            return self.work[0] + self.work[1] - 2

    def getName(self):
        return self.name


team = [['이현준', '최민우', '김선규', '김도희'],
        ['강재민', '김지혜', '노수진', '배지훈'],
        ['신준호', '김경민', '노채은', '유혜경'],
        ['이성복', '장범규', '최현철', '손봉우']]

playerList = []

day, dayChange, today = None, None, None

print('카카오톡 - 대화 내보내기 - *.txt')
for line in open(input('Path\t: '), 'r', encoding='utf8').read().split('\n'):
    # 문제풀이
    if line[-3:] == ' 사진':
        name = line.split(']')[0][1:]

        # 플레이어 리스트에 존재하지 않는다면 플레이어를 플레이어 리스트에 추가
        name_list = [name.getName() for name in playerList]
        if name not in name_list:
            playerList.append(player(name))
        else:
            playerList[name_list.index(name)].addWork(1)

    # 날짜 변경 + 문제풀이 점검
    if "---------------" in line:
        day = line.split()[-2]
        today = line.split()[1:4]
        bad_player = []
        bad_team = set()

        if day not in ['일요일', '월요일']:  # 토요일 / 일요일
            for student in playerList:
                if not student.isFinished():
                    bad_player.append(student.getName())
                    for i in range(len(team)):
                        if student.getName() in team[i]:
                            bad_team.add(', '.join(team[i]))
        if bad_player:
            print('\n* ', end='')
            print(' '.join(today))
            print('미제출\t: ' + ', '.join(bad_player))
            print('회식\t: ' + ', '.join(map(str, bad_team)))

        # TODO 토요일, 일요일날 채팅이 없으면 하루로 인식 X -> NEW DAY PROCESS 실행 X
        # New Day!
        for student in playerList:
            student.newDay()

input('\n계속하려면 아무 키나 누르십시오')
