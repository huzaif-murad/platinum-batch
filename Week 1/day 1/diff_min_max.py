n=int(input())


my_list=[]

for i in range(n):
    a=int(input())
    my_list.append(a)

largest=my_list[0]
smallest=my_list[0]

for num in my_list:
    if num>largest:
        largest=num
    elif (num<largest):
        smallest=num
print("Difference isL:",largest-smallest)
