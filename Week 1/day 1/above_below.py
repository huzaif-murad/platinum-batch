n=int(input())
x=int(input())

my_list=[]

for i in range(n):
    a=int(input())
    my_list.append(a)

above_count=0
below_count=0
equal_count=0
for num in my_list:
    if (num>x):
        above_count+=1
    elif (num<x):
        below_count+=1
    else:
        equal_count+=1
print(my_list)
print("Above count:",above_count)
print("Below count:",below_count)
print("equal count:",equal_count)
