# create an empty list
empty_1 = []
empty_2 = list()

#create a list with items
fruits = ["apple", 1, "banana", True, [1, 2, 3], "orange",]#can have int and bools and even lists inside another list
# print(fruits[-1]) to start list from the end
# fruits[1] = "plum" changes banana to plum
#print(fruits)


#pop removes last element defaults to last element
removed_fruit = fruits.pop(1) #put index number in brackets to specify other objects in list
print(f"I removed {removed_fruit}") #f helps format string


# add a new fruit
fruits.append("pear")
print(fruits)