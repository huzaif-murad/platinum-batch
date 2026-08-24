my_list=list(map(int,input().split()))

print(my_list)

left=0
right=len(my_list)-1

while(left<right):
    while(my_list[left]%2!=0):
        left+=1
    while(my_list[right]%2!=0):
        right-=1

    my_list[left],my_list[right]=my_list[right],my_list[left]
    left+=1
    right-=1

print(my_list)