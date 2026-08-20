my_list=[10,20,10,30,20,40,30,50]

new_list=[]

for num in my_list:
    if num not in new_list:
        new_list.append(num)

print(new_list)