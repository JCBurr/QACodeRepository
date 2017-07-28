'''
Created on 2 Jun 2017

@author: james
'''

class One():
    def __init__(self, a, b, c):
        self.a = a
        self.b = b
        self.c = c
    
    def __add__(self, A):
        c = One(0, 0, 0)
        c.a = self.a + A.a
        c.b = self.b + A.b
        c.c = self.c + A.c
        return c
    
    def __sub__(self, A):
        c = One(0, 0, 0)
        c.a = self.a - A.a
        c.b = self.b - A.b
        c.c = self.c - A.c
        return c
    
    def __mul__(self, A):
        c = One(0, 0, 0)
        c.a = self.a * A.a
        c.b = self.b * A.b
        c.c = self.c * A.c
        return c
    
    def __div__(self, A):
        c = One(0, 0, 0)
        c.a = self.a / A.a
        c.b = self.b / A.b
        c.c = self.c / A.c
        return c
    
first = One(10, 15, 20)
second = One(5, 10, 15)
third = first.__div__(second)
print("Third values are %d, %d and %d " %(third.a, third.b, third.c))