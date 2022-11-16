ages = [5, 15, 64, 27, 84, 26]
# Return a list of only the odd ages.
odd_ages = [item for item in ages if item % 2 != 0]
print(odd_ages)

chicken_names = ["Hen Solo", "Cluck Norris", "Hennifer Lopez", "ChewPekka", "Feather Locklear"]
# Return a list with chickens whose name is more than 10 characters
# Return a list of chickens whose name starts with the letter H
long_chicken = [item for item in chicken_names if len(item) >= 10]
print(long_chicken)

h_chicken = [item for item in chicken_names if item[0] == "H"]
print(h_chicken)

words = ["The", "quick", "brown", "fox", "jumped", "over", "the", "lazy", "dog"]
# Build a new list, with the first letter from each word
# Convert each letter to lower case
# Expected output: ["t", "q", "b", "f", "j", "o", "t", "l", "d"]

# Hint: Strings in Python work as if they were a tuple full of characters. How would you get the first element from a tuple or list?

