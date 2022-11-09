#While loop

counter = 0
my_number = 5
while(counter < my_number):
    print(f"counter is {counter}")
    counter += 1 #adds 1 to the current value of counter



my_number = 5
value = int(input("What number am I thinking of?")) 

while(value != my_number):
    value = int(input("Nope! Try again..."))

print("Yes!") #keeps on running until you type the number assigned to my_number



while(True):
    line = input("typesomething: ")
    if(line.lower() == 'q'): #used to add in an escape command to escape 
        #a perpetual loop
        break #breaks the loop
    print(f"you typed: {line}")



#3 using list
numbers = [1, 2, 3, 4, 5]

for number in numbers:
    print(number*3)

print(number)

total = 0
for number in numbers:
    total = total + number
print(total)



#using list
chickens = ["margaret", "Hetty", "Henrietta", "Audrey", "Mabel"]
for chicken in chickens:
    print(chicken)


#using dictionary
chickens = [
  {"name": "Margaret", "age": 2, "eggs": 0},
  {"name": "Hetty", "age": 1, "eggs": 2},
  {"name": "Henrietta", "age": 3, "eggs": 1},
  {"name": "Audrey", "age": 2, "eggs": 0},
  {"name": "Mabel", "age": 5, "eggs": 1},
]
for chicken in chickens:
    print(f'{chicken["name"]} is {chicken["age"]}')

total_eggs = 0
for chicken in chickens:
    total_eggs += chicken["eggs"] #adds up all the eggs in dictionary
    chicken["eggs"] = 0 #replaces value of eggs with 0

print(f'{total_eggs} eggs collected') #adds up all the eggs in dictionary
print(chickens) #should return 0