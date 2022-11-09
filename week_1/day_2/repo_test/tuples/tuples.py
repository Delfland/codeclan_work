car = ("Ford", "Escort", 1300, "Red")
car_2 = "Ford", "Escort", 1300, "Red"

print(car)
print(type(car))
print(car_2)
print(type(car_2))

#define an empty tupple
empty_tuple = ()
empty_tuple_2 = tuple()

#access value by index
model = car[1]
colour = car[-1]
print(f"Model: {model} colour: {colour}")

# can't modify value - immutable!
# car[1] = 'Focus' can't be done

#count tupple elements
tupple_count = len(car)
print(tupple_count)

fruits = ("apple", "apple", "banana")
print(fruits.count("banana"))
print(car.count(1300))

#tupple of a single element
single_tupple = ('ben',)
