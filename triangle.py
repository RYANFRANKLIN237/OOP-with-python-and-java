from polygon import Polygon

class Triangle(Polygon):
    def __init__(self):
        super().__init__()
        self.shape = 'triangle'
        self.side_lengths = [2, 2, 2]