'''
Created on 1 Jun 2017

@author: james
'''


class ONS():
    def Message(self):
        print("Message printed")
    
    def Add(self, A, B):
        print("%d + %d = %d" %(A, B, (A + B)))
        self.Message()
        
onsObject = ONS()
onsObject.Add(7, 9)