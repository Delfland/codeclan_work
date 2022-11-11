# WRITE YOUR FUNCTIONS HERE
def get_pet_shop_name(name):
    return name["name"]


def get_total_cash(sum):
    return sum["admin"]["total_cash"]

def add_or_remove_cash(location, price):
    location["admin"]["total_cash"] += price
    
def get_pets_sold(list):
    return list["admin"]["pets_sold"]

def increase_pets_sold(location, number_of_pets):
    location["admin"]["pets_sold"] = location["admin"]["pets_sold"] + number_of_pets

def get_stock_count(location):
    return len(location["pets"])

def get_pets_by_breed(pet_shop, breed):
    same_breed_pets = []
    for pet in pet_shop["pets"]:
        if pet["breed"] == breed:
            same_breed_pets.append(breed)
    return same_breed_pets
        
def find_pet_by_name(pet_shop, name):
    for pet in pet_shop["pets"]:
        if pet["name"] == name:
            return pet

def remove_pet_by_name(pet_shop, name):
    for pet in pet_shop["pets"]:
        if pet["name"] == name:
            pet_shop["pets"].remove(pet)

def add_pet_to_stock(pet_shop, new_pet):
    pet_shop["pets"].append(new_pet)

def get_customer_cash(costumer):
    return costumer["cash"]

def remove_customer_cash(costumer, cash):
    costumer["cash"] -= cash

def get_customer_pet_count(costumer):
    return len(costumer["pets"])

def add_pet_to_customer(costumer, new_pet):
    costumer["pets"].append(new_pet)

def customer_can_afford_pet(customer, new_pet):
    if customer["cash"] >= new_pet["price"]:
        return True
    else:
        return False

# def sell_pet_to_customer(pet_shop, pet, customer):
#     for pet in pet_shop:
#         customer["pets"].append(pet)
#         customer["cash"]  -= pet_shop["pets"]["price"]
#         pet_shop["admin"]["total_cash"] += pet_shop["pets"]["price"]
#         pet_shop["admin"]["pets_sold"] = 
#     return 

