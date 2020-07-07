num_words = int(input())
words_by_len = [set() for _ in range(51)]

for i in range(num_words):
    word = input()
    words_by_len[len(word)].add(word)

for j in range(1, 51):
    words_by_len[j] = list(words_by_len[j])
    words_by_len[j].sort()
    for k in range(len(words_by_len[j])):
        print(words_by_len[j][k])