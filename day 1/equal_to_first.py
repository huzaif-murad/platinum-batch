my_list=list(map(int,input().split()))
x=my_list[0]
count=0

for num in my_list:
    if num==x:
        count+=1

print(count)