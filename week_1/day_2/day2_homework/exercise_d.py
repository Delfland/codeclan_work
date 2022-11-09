# For the following list of numbers:

numbers = [1, 6, 2, 2, 7, 1, 6, 13, 99, 7]




# 1. Print out a list of the even integers:
even_number = []
for number in numbers:
    if number % 2 == 0:
        even_number.append(number)

# 2. Print the difference between the largest and smallest value:
largest = max(numbers)
smallest = min(number)
print(largest - smallest)

# 3. Print True if the list contains a 2 next to a 2 somewhere.
result = False
index = 0
for number is numbers:
    if (number == 2 and numbers[index-1] == 2)
        result = True
    index += 1
print(result)

# 4. Print the sum of the numbers, 
#    BUT ignore any section of numbers starting with a 6 and extending 
# to the next 7.
#    So [11, 6, 4, 99, 7, 11] would have sum of 22

total = 0
found_6 = False
for number in numbers:
    if number == 6
        found_6 = True 
    elif found_6:
        if number == 7
            found_6 = False
        else:
             total += number #command ignored while found_6 is true but ignored after found_6 returns to false

# 5. HARD! Print the sum of the numbers. 
#    Except the number 13 is very unlucky, so it does not count.
#    And numbers that come immediately after a 13 also do not count.
#    HINT - You will need to track the index throughout the loop.
#
#    So [5, 13, 2] would have sum of 5. 

total = 0
indices_of_13 = []
counter = 0
for num in numbers:
    if num == 13:
        indices_of_13.append(num)
        counter += 1
    elif len(indices_of_13) != 0 and (indices_of_13[-1] == counter -1):
        index += 1
        pass
    else:
        total += num
        index += 1

#or

index = 0
total = 0
for number in numbers:
    if number == 13 or numbers[index-1] == 13:
        pass
    else:
        total += number
    index += 1