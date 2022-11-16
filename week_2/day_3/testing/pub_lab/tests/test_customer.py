import unittest
from src.customer import Customer

class TestCustomer(unittest.TestCase): 

    def setUp(self):
        self.customer = Customer("John", 50.00)

    def test_customer_has_name(self):
        self.assertEqual("John", self.customer.name)

    def test_customer_has_wallet(self):
        self.assertEqual(50.00, self.customer.wallet)

    def test_reduce_sum_in_wallet(self):
        self.customer.reduce_sum(5.00)
        self.assertEqual(45.00, self.customer.wallet)