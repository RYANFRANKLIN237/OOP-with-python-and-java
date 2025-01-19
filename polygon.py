from shape import Shape

class Polygon(Shape):
    def __init__(self):
        super().__init__()  # Call the parent class's initializer
        self.shape = 'polygon'
        self.side_lengths = None

    def compute_perimeter(self):
        if self.side_lengths is None:
            return 0
        return sum(self.side_lengths)

    def get_number_of_edges(self):
         if self.side_lengths is None:
            return 0
         return len(self.side_lengths)