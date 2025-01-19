from society import Society

my_society = Society("My Professional Society")
my_society.add_standard_member("Alice Smith", "123 Main St")
my_society.add_senior_member("Bob Johnson", "456 Oak Ave", 50)
my_society.add_standard_member("Charlie Brown", "789 Pine Ln")

print("Society Name: ",my_society.get_name())
print("Total Fees:", my_society.get_fee_total())
my_society.print_all_members()