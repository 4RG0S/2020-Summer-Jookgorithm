word_list = []
n = int(input())

for i in range(n):
    word_list.append(input())

reset_list = list(set(word_list))

sort_list = [] #결과물

for j in reset_list:
    sort_list.append((len(j), j)) #단어길이, 단어 같이 저장
sort_list.sort()

for length, words in sort_list:
    print(words)