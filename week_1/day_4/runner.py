# from calculator import add --- to import a specific function from a file


# import calculator 
# print(calculator.add(10, 20))
# or import calculator as calc (functions need to be preceded by calc.)

# from calculator import *

#from calculator import add, multiply

from modules.calculator import *


print(add(10, 20))

# create runner file on same level as module folder --- package of code related to the runner file
# must create an __init__.py file in module folder
# functions are defined in calculator file inside the module folder
# runner file draws code from the module folder