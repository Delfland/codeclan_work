class Student:
    def __init__(self, input_student_name, input_cohort):
        self.name = input_student_name
        self.cohort = input_cohort
        
    def talk(self):
        return "I can talk!"


    def say_favourite_language(self, str):
            return f"I love {str}" #insert an argument into a string
