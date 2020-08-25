#include <iostream>
#include <algorithm>
#include <string>
#include <queue>

bool isbingo(int bingo_table[5][5]);
bool row_check(int bingo_table[5][5], int r);
bool column_check(int bingo_table[5][5], int c);
bool lefttop_rightbot_check(int bingo_table[5][5]);
bool leftbot_righttop_check(int bingo_table[5][5]);

int main() {
	
	int bingo_table[5][5];
	std::queue<int> calls;

	for (int i = 0; i < 5; i++) {
		for (int j = 0; j < 5; j++) {
			std::cin >> bingo_table[i][j];
		}
	}
	
	for (int i = 0; i < 5; i++) {
		for (int j = 0; j < 5; j++) {
			int tmp;
			std::cin >> tmp;
			calls.push(tmp);
		}
	}

	int call_count = 0;
	while (!isbingo(bingo_table)) {
		int call = calls.front();
		calls.pop();
		call_count++;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (bingo_table[i][j] == call) bingo_table[i][j] = 0;
			}
		}
	}

	std::cout << call_count << std::endl;

	return 0;
}

bool isbingo(int bingo_table[5][5]) {
	int cnt = 0;
	for (int i = 0; i < 5; i++) {
		if (row_check(bingo_table, i)) cnt++;
		if (column_check(bingo_table, i)) cnt++;
	}
	if (lefttop_rightbot_check(bingo_table)) cnt++;
	if (leftbot_righttop_check(bingo_table)) cnt++;

	return cnt >= 3;
}

bool row_check(int bingo_table[5][5], int r) {
	for (int i = 0; i < 5; i++) {
		if (bingo_table[r][i] != 0) return false;
	}
	return true;
}

bool column_check(int bingo_table[5][5], int c) {
	for (int i = 0; i < 5; i++) {
		if (bingo_table[i][c] != 0) return false;
	}
	return true;
}

bool lefttop_rightbot_check(int bingo_table[5][5]) {
	for (int i = 0; i < 5; i++) {
		if (bingo_table[i][i]) return false;
	}
	return true;
}

bool leftbot_righttop_check(int bingo_table[5][5]) {
	for (int i = 0; i < 5; i++) {
		if (bingo_table[4 - i][i]) return false;
	}
	return true;
}