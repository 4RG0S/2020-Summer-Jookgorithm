N = int(input())
words_list = []

for _ in range(words_num):
    word = input()
    words_list.append((word, word_count))

words_list = list(set(words_list))
words_list.sort(key = lambda word: (word[1], word[0]))