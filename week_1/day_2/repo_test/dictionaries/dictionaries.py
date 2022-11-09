meals = ('yoghurts', 'roll', 'steak')
print (meals[0])

my_first_empty_dictionary = {} #dictionary shortcut
my_second_empty_dictionary = dict() #dictionary function

meals = {'breakfast':'yoghurt', 'lunch':'roll', 'dinner':"steak"} #populate dictionary
print(meals)

things = {1:'2', "steve":[1,2,3]}
print(things)

print(meals["breakfast"])
print(things["steve"][2]) #print 3rd item of list assigned to key "steve"

print("breakfast" in meals) #check if key is in dictionary

meals["supper"] = "pancakes" #add item to dictionary, can also be used to change the value assigned to a key
print(meals)

del(meals["breakfast"]) #delete from dictionary
print(meals)

print(list(meals)) #print dictionary keys as a list

print(meals.keys()) #print dictionary keys as a list
print(meals.values()) #print dictionary values as a list

valuesList = meals.values()

#nesting
countries = {
    "uk": {"capital":"London", "population": 1000},
    "germany":{"capital":"Berlin", "population": 5000}
}

print(countries["germany"]["population"]) #print population