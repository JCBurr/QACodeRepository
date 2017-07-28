import math
number = int(input("Please enter a number to be converted."))
numDigits = int(math.log10(number))+1
numberString = str(number)
tensDictionary = {'0': "Zero", '1': "Ten", '2': "Twenty", '3': "Thirty", '4': "Forty", '5': "Fifty", '6': "Sixty", '7': "Seventy", '8':"Eighty", '9': "Ninety"}
singlesDictionary = {'0': "Zero",'1': "One", '2': "Two", '3': "Three", '4': "Four", '5': "Five", '6': "Six", '7': "Seven", '8':"Eight", '9': "Nine"}
if numDigits == 1:
    print("Number is %s" % singlesDictionary[numberString[0]])
elif numDigits > 1:
    currentDigitIndex = numDigits - 1
    for i in range (numDigits):
        if currentDigitIndex == 3:
            print(singlesDictionary[numberString[i]] + " Thousand ", end="")
        elif currentDigitIndex == 2:
            print(singlesDictionary[numberString[i]] + " Hundred ", end=""),
        elif currentDigitIndex == 1:
            print(tensDictionary[numberString[i]] + " ", end=""),
        elif currentDigitIndex == 0:
            print(singlesDictionary[numberString[i]])
        currentDigitIndex -= 1