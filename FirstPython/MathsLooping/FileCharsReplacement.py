'''
Created on 31 May 2017

@author: james
'''
f = open("XYZ.txt", "w")
f.write("Hello world")
f.close()
newFileName = input("Please enter a new file name.")
stringToReplace = input("Please enter a string to replace.")
replacementString = input("Please enter a string to replace that character.")
f = open("XYZ.txt", "r")
currentString = f.read()
f.close()
g = open(newFileName, "w")

for char in currentString:
    g.write(char) if char != stringToReplace else g.write(replacementString)
        #currentString[i] = replacementString
#print(currentString)