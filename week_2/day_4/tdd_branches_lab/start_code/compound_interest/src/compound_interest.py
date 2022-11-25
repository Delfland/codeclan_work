class CompoundInterest:

    def __init__(self, principal, rate, years, monthly_contributions):
        self.principal = principal
        self.rate = rate/100
        self.years = years
        self.number_of_times_per_year = 12
        self.monthly_contributions_total = monthly_contributions * self.number_of_times_per_year

    
    def calculate_investment(self):
        investment_compounded = self.principal * (1 + (self.rate/self.number_of_times_per_year)) ** (self.number_of_times_per_year * self.years)
        return round(investment_compounded, 2)

    # def calculate_investment_with_contributions(self):
    #     total_amount = (self.principal + self.monthly_contributions_total) * (1 + (self.rate/self.number_of_times_per_year)) ** (self.number_of_times_per_year * self.years)
    #     return round(total_amount, 2)