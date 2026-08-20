n=int(input())


my_list=[]

for i in range(n):
    a=int(input())
    my_list.append(a)
found=True
index=0
while(found and index<len(my_list)):
    if my_list[index]%2==0:
        found=False
        largest=my_list[index]
        smallest=my_list[index]
    index+=1

for num in my_list:
    if (num%2==0 and num>largest):
        largest=num
    elif (num%2==0 and num<smallest):
        smallest=num

print("Largest:",largest)
print("Smallest:",smallest)
print("Difference is:",largest-smallest)

