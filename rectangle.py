from polygon import Polygon

class Rectangle(Polygon):
    def __init__(self):
        super().__init__()
        self.shape = 'rectangle'
        self.side_lengths = [1, 1, 1, 1]