#include <iostream>
#include <algorithm>
#include <string>

void sheep_cluster(bool** field, int r, int c, int h, int w);

int main() {

	int T;
	std::cin >> T;

	for (int t = 0; t < T; t++) {
		// field size input
		int h, w;
		std::cin >> h >> w;

		// malloc
		bool** field;
		field = new bool* [h];
		for (int i = 0; i < h; i++)
			field[i] = new bool[w];

		// field input
		for (int i = 0; i < h; i++) {
			std::string str;
			std::cin >> str;

			for (int j = 0; j < w; j++)
				field[i][j] = str.at(j) == '#';
		}

		int cnt = 0;
		for (int y = 0; y < h; y++) {
			for (int x = 0; x < w; x++) {
				if (field[y][x]) {
					sheep_cluster(field, y, x, h, w);
					cnt++;
				}
			}
		}

		std::cout << cnt << std::endl;

		// release
		for (int i = 0; i < h; i++)
			delete[] field[i];
		delete[] field;

	}


	return 0;
}


void sheep_cluster(bool** field, int y, int x, int h, int w) {

	field[y][x] = false;

	int dxy[4][2] = { {-1, 0}, {0, -1}, {1, 0}, {0, 1} };
	
	for (int i = 0; i < 4; i++) {
		int dx = x + dxy[i][0];
		int dy = y + dxy[i][1];

		if (dx == -1) dx++;
		if (dy == -1) dy++;
		if (dx == w) dx--;
		if (dy == h) dy--;

		if (field[dy][dx]) sheep_cluster(field, dy, dx, h, w);
	}

}