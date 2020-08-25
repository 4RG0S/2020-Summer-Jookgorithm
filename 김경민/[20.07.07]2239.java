package July;

import java.util.HashSet;
import java.util.Scanner;

public class July_07_2239 {

	static HashSet<Integer> xSet[];
	static HashSet<Integer> ySet[];
	static HashSet<Integer> squareSet[];
	static HashSet<Integer> crossSet[];
	static int board[][];

	static boolean boardCheck() {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (board[i][j] == 0)
					return false;
			}
		}
		return true;
	}

	static void track() {
		int crossNum = -1;
		if (boardCheck()) {
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					System.out.print(board[i][j]);
				}
				System.out.println();
			}
			// System.out.println("finish");
			System.exit(0);
		}

		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				if (board[i][j] == 0) {
					if (i == j)
						crossNum = 0;
					else if (8 - j == i)
						crossNum = 1;
					for (int k = 1; k <= 9; k++) {
						if (!xSet[i].contains(k) && !ySet[j].contains(k) && !squareSet[(i / 3) * 3 + j / 3].contains(k)) {
							if(crossNum != -1)
								crossSet[crossNum].add(k);
							board[i][j] = k;
							xSet[i].add(k);
							ySet[j].add(k);
							squareSet[(i / 3) * 3 + j / 3].add(k);
							track();
							if(crossNum != -1)
								crossSet[crossNum].remove(k);
							board[i][j] = 0;
							xSet[i].remove(k);
							ySet[j].remove(k);
							squareSet[(i / 3) * 3 + j / 3].remove(k);
						}
					}
					return;
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		xSet = new HashSet[9];
		ySet = new HashSet[9];
		squareSet = new HashSet[9];
		crossSet = new HashSet[2];
		board = new int[9][9];
		for (int i = 0; i < 9; i++) {
			xSet[i] = new HashSet<>();
			ySet[i] = new HashSet<>();
			squareSet[i] = new HashSet<>();
		}
		crossSet[0] = new HashSet<>();
		crossSet[1] = new HashSet<>();
		for (int i = 0; i < 9; i++) {
			String line = scan.nextLine();
			for (int j = 0; j < 9; j++) {
				board[i][j] += line.charAt(j) - '0';
				if (board[i][j] != 0) {
					xSet[i].add(board[i][j]);
					ySet[j].add(board[i][j]);
					squareSet[(i / 3) * 3 + j / 3].add(board[i][j]);
					if (i == j)
						crossSet[0].add(board[i][j]);
					if (8 - j == i)
						crossSet[1].add(board[i][j]);
				}
			}
		}
		track();

	}

}
