from member import Member

class SeniorMember(Member):
    def __init__(self, name, address, fee):
        super().__init__(name, address)
        self.fee = fee

    def get_fee(self):
        return self.fee