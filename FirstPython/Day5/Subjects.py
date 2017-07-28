'''
Created on 2 Jun 2017

@author: james
'''
from scipy.constants.codata import physical_constants

class Results():
    
    def __init__(self, phy = 0, che = 0, mat = 0):
        self.__phy = 0
        self.__che = 0
        self.__mat = 0

    def SetPhysicsMark(self, phy):
        if phy >= 0 and phy <= 150:
            self.__phy = phy
        else:
            print("Value must be between 0 and 150.")
            
    def SetChemistryMark(self, che):
        if che >= 0 and che <= 150:
            self.che = che
        else:
            print("Value must be between 0 and 150.")
            
    def SetMathsMark(self, mat):
        if mat >= 0 and mat <= 150:
            self.__mat = mat
        else:
            print("Value must be between 0 and 150.")
            
jackResults = Results()
jackResults.SetChemistryMark(46)
jackResults.SetPhysicsMark(99)
jackResults.SetMathsMark(32)