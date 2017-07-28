'''
Created on 1 Jun 2017

@author: james
'''
from win32com.servers import dictionary

dictionaryOne = {'Name': "James", 'Height': "182cm"}

for x in dictionaryOne:
    print(dictionaryOne[x])
print(dictionaryOne['Name'])