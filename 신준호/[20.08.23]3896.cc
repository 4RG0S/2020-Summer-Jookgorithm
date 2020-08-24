#include <iostream>
#include <algorithm>
#include <string>
#include <queue>

bool* eratos(int n);
int left(bool* primes, int idx);
int right(bool* primes, int idx);

int main() {
	
	bool* primes = eratos(1299709);

	int T;
	std::cin >> T;
	
	for (int i = 0; i < T; i++) {
		int k;
		std::cin >> k;

		int leftIdx = left(primes, k);
		int rightIdx = right(primes, k);
		std::cout << rightIdx - leftIdx << std::endl;
	}
	
	return 0;
}

bool* eratos(int n) {
	bool* eratos = (bool*) malloc((n + 1) * sizeof(bool));
	for (int i = 0; i <= n; i++)
		eratos[i] = true;
	eratos[0] = false; eratos[1] = false;
	for (int i = 0; i <= n; i++) {
		if (eratos[i]) {
			for (int j = i * 2; j <= n; j += i) eratos[j] = false;
		}
	}
	return eratos;
}

int left(bool* primes, int idx) {
	for (; !primes[idx]; idx--);
	return idx;
}

int right(bool* primes, int idx) {
	for (; !primes[idx]; idx++);
	return idx;
}