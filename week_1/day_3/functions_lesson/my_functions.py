def greet():
    print("Hey!")
greet() #function we want to do a task then finish

def greet():
    return "Hey!" #return statement needed
greeting = greet()
print(greeting)

def greet():
    print ( "Hey!") 
greeting = greet()
print(greeting) #will print none as no return statement

def greet(name): #parameter
    return "Hey " + name
greeting = greet("Ash") #argument
print(greeting)

def greet(name, time_of_day): #parameter
    return "Good " + time_of_day + ", " + name
greeting = greet("Ash", "morning") #argument
print(greeting)

name_1 = "Ash"
time_of_day_1 = "Morning"
greeting = greet(name_1, time_of_day_1)
print(greeting)

name_2 = "Ben"
time_of_day_2 = "Afternoon"
greeting = greet(name_2, time_of_day_2)
print(greeting)

def greet():
    words = "Hey"
    return words

def greet_two():
    words = "Hey"
    return words
print(greet_two())
