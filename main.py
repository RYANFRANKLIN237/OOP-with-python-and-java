from shape import Shape
from polygon import Polygon
from rectangle import Rectangle
from triangle import Triangle

s = Shape()
print(s) 

p = Polygon()
print(p)  

rect = Rectangle()
print(rect) 
print(rect.compute_perimeter()) 

tri = Triangle()
print(tri) 
print(tri.compute_perimeter()) 