'''
Created on 1 Jun 2017

@author: james
'''

instancesArray = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
alphabetDictionary = {'A': 0, 'B': 1, 'C': 2, 'D': 3, 'E': 4, 'F': 5, 'G': 6, 'H': 7, 'I': 8, 'J': 9, 'K': 10, 'L': 11, 'M': 12, 'N': 13, 'O': 14, 'P': 15,
                      'Q': 16, 'R': 17, 'S': 18, 'T': 19, 'U': 20, 'V': 21, 'W': 22, 'X': 23, 'Y': 24, 'Z': 25}


inputString = input("Please enter a string.")


#asciiChar = ord(char)
    #    asciiChar = (asciiChar - 15)
       # newString += chr(asciiChar)

letterASCII = 65

for i in range(len(inputString)):
    for j in range (25):
        letterASCII = 65
        if ord(inputString[i]) == letterASCII or ord(inputString[i]) == letterASCII + 32:
            instancesArray[j] += 1
            letterASCII += 1
        else:
            letterASCII += 1

for i in range (25):
    if instancesArray[i] != 0:
        print(instancesArray[i])