def Divide(num1, num2):  # WhereAreOurChocolates?
    
    try:
        num3 = num1 / num2
        assert (num2 > 0)
    except ZeroDivisionError:
        print("Cannot divide by zero.")
    except ValueError:
        print("Cannot divide using non-numeric values.")
    finally:
        print("Finally statement executed")
    return num3

print(Divide(3, 0))
