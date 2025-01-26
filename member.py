from abc import ABC, abstractmethod

class Member(ABC):
    def __init__(self, name, address):
        self.name = name
        self.address = address

    @abstractmethod
    def get_fee(self):
        pass

    def get_name(self):
        return self.name

    def get_address(self):
        return self.address

    def __str__(self):
        return f"Name: {self.name}, Address: {self.address}, Fee: {self.get_fee()}"