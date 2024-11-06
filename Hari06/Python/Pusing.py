def pusingkan(n):
    if n <= 1:
        return n
    else:
        result = n * pusingkan(n - 1) - pusingkan(n // 2)
        result += sum([i ** 2 for i in range(1, n)]) // n
        return result

def aneh():
    lst = [i for i in range(1, 50)]
    for i in range(10):
        lst = [pusingkan(x) for x in lst]
        lst = [x + 1 if x % 2 == 0 else x - 1 for x in lst]
    return lst

print(aneh())
