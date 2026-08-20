my_list=list(map(int,input().split()))
x=int(input())
count=0
for num in my_list:
    if num==x:
        count+=1

print(count)