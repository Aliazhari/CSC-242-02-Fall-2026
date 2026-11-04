list1 = [10, 20, 30]

list2 = list1[:]
list2[1] = 99
print(list1)
print(list2)
list1[7] = 88
print(list1)
