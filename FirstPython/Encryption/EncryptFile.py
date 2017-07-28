'''
Created on 31 May 2017

@author: james
'''

def encrypt(fileName):
    newString = ""
    file = open(fileName, "r")
    fileContents = file.read()
    for char in fileContents:
        asciiChar = ord(char)
        asciiChar = (asciiChar - 15)
        newString += chr(asciiChar)
    print("Encrypted file contents: %s" %newString)
    file.close()
    newFileName = "Encrypted" + fileName
    file = open(newFileName, "w")
    file.write(newString)
    file.close()

def decrypt(fileName):
    newString = ""
    file = open("Encrypted" + fileName, "r")
    encryptedText = file.read()
    for char in encryptedText:
        asciiChar = ord(char)
        asciiChar = (asciiChar + 15)
        newString += chr(asciiChar)
    print("Unencrypted file contents: %s" %newString)
    
fileName = input("Please enter a file name.")
file = open(fileName, "w")
file.write(input("Please enter file contents"))
file.close()
encrypt(fileName)
decrypt(fileName)
