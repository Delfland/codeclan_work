def return_10():
    return 10

def add(num_1,num_2):
    return num_1 + num_2

def subtract(num_1,num_2):
    return num_1 - num_2

def multiply(num_1,num_2):
    return num_1 * num_2

def divide(num_1,num_2):
    return num_1 / num_2

def length_of_string(string):
    return len(string)

def join_string(first_str, second_str):
    full_str = first_str + second_str
    return full_str

def add_string_as_number(str_1, str_2):
    return int(str_1) + int(str_2)

def number_to_full_month_name(index_num):
    months_of_the_year = ["January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"]
    return months_of_the_year[index_num-1]

def number_to_short_month_name(index_num):
    short_months = ["Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"]
    return short_months[index_num-1]

def volume_calculation(length):
    total_volume = length * length * length
    return total_volume

def reverse_string(string):
    reverse_result = string[::-1]
    return reverse_result

def farenheit_convert(farenheit):
    celsius = (farenheit - 32) * 0.5556
    return celsius
