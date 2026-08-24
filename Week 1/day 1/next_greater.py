my_list=[1,2,3,5,8,4,6]

x=int(input())

first_largest=my_list[0]

for num in my_list:
    if num>x and num<first_largest:
        first_largest=num

print(first_largest)
