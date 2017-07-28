'''
Created on 31 May 2017

@author: james
'''

def BaseFunction(functionChoice):
    if functionChoice == 1:
        def Addition(A, B):
            print("%d + %d = %d" %(A, B, (A + B)))
    elif functionChoice == 2:
        def Addition(A, B):
            print("%d - %d = %d" %(A, B, (A - B)))
    
    return Addition

ABC = BaseFunction(2)
ABC(3,5)