from member import Member

class StandardMember(Member):
    STANDARD_FEE = 30

    def __init__(self, name, address):
        super().__init__(name, address)

    def get_fee(self):
        return StandardMember.STANDARD_FEE