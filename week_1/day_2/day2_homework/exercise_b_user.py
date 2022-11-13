users = {
  "Jonathan": {
    "twitter": "jonnyt",
    "lottery_numbers": [6, 12, 49, 33, 45, 20],
    "home_town": "Stirling",
    "pets": [
    {
      "name": "fluffy",
      "species": "cat"
    },
    {
      "name": "fido",
      "species": "dog"
    },
    {
      "name": "spike",
      "species": "dog"
    }
  ]
  },
  "Erik": {
    "twitter": "eriksf",
    "lottery_numbers": [18, 34, 8, 11, 24],
    "home_town": "Linlithgow",
    "pets": [
    {
      "name": "nemo",
      "species": "fish"
    },
    {
      "name": "kevin",
      "species": "fish"
    },
    {
      "name": "spike",
      "species": "dog"
    },
    {
      "name": "rupert",
      "species": "parrot"
    }
  ]
  },
  "Avril": {
    "twitter": "bridgpally",
    "lottery_numbers": [12, 14, 33, 38, 9, 25],
    "home_town": "Dunbar",
    "pets": [
      {
        "name": "monty",
        "species": "snake"
      }
    ]
  }
}

# 1. Get Jonathan's Twitter handle (i.e. the string `"jonnyt"`)
print(users["Jonathan"]["twitter"])
# 2. Get Erik's hometown
print(users["Erik"]["home_town"])
# 3. Get the list of Erik's lottery numbers
print(users["Erik"]["lottery_numbers"])
# 4. Get the species of Avril's pet Monty
users["Avril"]["pets"][0]["names"]
# 5. Get the smallest of Erik's lottery numbers
lottery_numbers = users["Erik"]["lottery_numbers"]
print(min(lottery_numbers))

#or
sorted(users["Erik"]["lottery_numbers"][0])
# 6. Return an list of Avril's lottery numbers that are even
avril_lottery = users["Avril"]["lottery_numbers"]
even_lottery = [even_num for even_num in avril_lottery if even_num % 2 == 0]
#if you print number by 2 and it has no remainder
print(even_lottery)
# 7. Erik is one lottery number short! Add the number `7` to be included in his lottery numbers
lottery_list = users["Erik"]["lottery_numbers"] 
lottery_list.append(7)
print(users["Erik"])

#or

users["Erik"]["lottery_numbers"].append(7)

# 8. Change Erik's hometown to Edinburgh
users["Erik"]["home_town"] = "Edinburgh"
print(users["Erik"]["home_town"])
# 9. Add a pet dog to Erik called "fluffy"
 users["Erik"]["pets"].append({ #could also use .insert()
        "name": "fluffy",
        "species": "dog"
      })

print(users["Erik"]["pets"])
# 10. Add another person to the users dictionary
users["Delph"] = {
    "twitter": "delfland",
    "lottery_numbers": [3, 11, 50, 40, 25, 2],
    "home_town": "Glasgow",
    "pets": [
    {
      "name": "precious",
      "species": "cat"
    },
    {
      "name": "cluedo",
      "species": "dog"
    }
  ]
  }
print(users)