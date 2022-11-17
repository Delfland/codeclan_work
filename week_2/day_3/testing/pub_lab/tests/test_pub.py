import unittest
from src.pub import Pub
from src.drink import Drink
from src.customer import Customer

class TestPub(unittest.TestCase): 
    def setUp(self):
        self.drink_1 = Drink("beer", 3.00)
        self.drink_2 = Drink("wine", 4.00)
        self.drink_3 = Drink("whisky", 5.00)
        self.pub = Pub("The Prancing Pony", 100.00)
        self.customer = Customer("John", 50.00)
        self.customer = Customer("Flora", 15.00)

    def test_pub_has_name(self):
        self.assertEqual("The Prancing Pony", self.pub.name)

    def test_pub_has_till(self):
        self.assertEqual(100.00, self.pub.till)

    def test_can_get_drinks_count(self):
        self.drinks_count(self.drinks)
        self.assertEqual(0, self.pub.drinks)

    def test_can_add_drinks_to_pub(self):
        self.add_drinks(self.drink_1)
        self.add_drinks(self.drink_2)
        self.assertEqual(2, pub.drinks_count())
    #create test_get_drinks_count

    def test_increase_sum_in_till(self):
        self.pub.increase_sum(5.00)
        self.assertEqual(105.00, self.pub.till)

    #create a test_to_serve_customer that
    #adds drink to drinks
    #reduces wallet by drink price
    #increases till by drink price
    #checks drinks count
