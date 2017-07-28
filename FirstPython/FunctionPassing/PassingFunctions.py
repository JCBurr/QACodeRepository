'''
Created on 1 Jun 2017

@author: james
'''

def Message(firstOutput, secondOutput):
    print("Message passed with values %d, %d" %(firstOutput, secondOutput))

def Function(A, B, C):
    A(B,C)
    
Function(Message, 3,4)