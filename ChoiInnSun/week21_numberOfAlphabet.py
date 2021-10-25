from string import ascii_lowercase

word = input()
zero = [0 for i in range(26)]
list_alpha = list(ascii_lowercase)

for i in word:
    zero[list_alpha.index(i)] += 1

print(" ".join(map(str, zero)))
