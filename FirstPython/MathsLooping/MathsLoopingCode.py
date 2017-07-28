'''
Created on 31 May 2017

@author: james
'''

def additionCall (firstNumber, secondNumber):
    print("The result is %d" % (firstNumber + secondNumber))
    
def subtractionCall (firstNumber, secondNumber):
    print("The result is %d" % (firstNumber - secondNumber))

def divisionCall (firstNumber, secondNumber):
    if secondNumber != 0:
        print("The result is %d" % (firstNumber / secondNumber))
    else:
        print("Cannot divide by 0.")

def multiplicationCall (firstNumber, secondNumber):
    print("The result is %d" % (firstNumber * secondNumber))

def timesTablesCall (tableNumber, rangeTables):
    for i in range (1, rangeTables + 1):
        print("%d * %d = %d" % (tableNumber, i, (tableNumber * i)))
        
def enterNumbers (choice):
    quitSubRoutine = False
    typeChoice = choice
    while quitSubRoutine == False:
        num1 = int(input("Please enter the first number."))
        num2 = int(input("Please enter the second number."))
    
        if typeChoice == 1:
            additionCall(num1, num2)
        elif typeChoice == 2:
            subtractionCall(num1, num2)
        elif typeChoice == 3:
            divisionCall(num1, num2)
        elif typeChoice == 4:
            multiplicationCall(num1, num2)
        
        subTest = False
        while subTest == False:
            continueInSubroutine = input("Would you like to repeat the operation? Enter Y for yes and N for no.")
            if continueInSubroutine == "Y":
                quitSubRoutine = False
                subTest = True
            elif continueInSubroutine == "N":
                quitSubRoutine = True
                subTest = True
            else:
                print("Please enter either Y or N.")
                subTest = False

quitMain = False
while quitMain == False:
    print("Your choices are:\n 1. Addition\n 2. Subtraction\n 3. Division \n 4. Multiplication \n 5. Times Tables \n 6. Quit program.")
    userChoice = int(input("Please input your choice."))
    if userChoice > 0 and userChoice < 5:
        enterNumbers(choice=userChoice)
    elif userChoice == 5:
        tableNumber = int(input("Please enter the table number."))
        rangeTables = int(input("Please enter the range."))
        timesTablesCall(tableNumber, rangeTables)
    elif userChoice == 6:
        print("Quitting main program.")
        quitMain = True
    else:
        print("Please input a value between 1 and 6.")
