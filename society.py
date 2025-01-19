from standard_member import StandardMember
from senior_member import SeniorMember

class Society:
    def __init__(self, name):
        self.name = name
        self.members = []  # Python list

    def add_standard_member(self, name, address):
        self.members.append(StandardMember(name, address))

    def add_senior_member(self, name, address, fee):
        self.members.append(SeniorMember(name, address, fee))

    def get_fee_total(self):
        total_fees = 0
        for member in self.members:
            total_fees += member.get_fee()
        return total_fees

    def print_all_members(self):
        for i, member in enumerate(self.members):
            print(f"i = {i} {member}")
            #print(f"i = {i} Name = {member.get_name()} Address = {member.get_address()} Fees = {member.get_fee()}")

    def get_name(self):
        return self.name