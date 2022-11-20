grocery_shelf = ["tinned tomatoes", "fusilli pasta", "baked beans", "basmati rice"]
shopping_trolley = []

def add_to_trolley(groceries_available, item_wanted):
    for item in groceries_available:
        if item == item_wanted:
            shopping_trolley.append(item)

add_to_trolley(grocery_shelf, "baked beans")
print(shopping_trolley)