a=[2,3,5,1,3]
b=3;
c=a.copy()
for i in range(0,len(a)):
    c[i]= a[i]+b
 
print(a)
print(c);


for i in range(0,len(a)):
    flag=0
    for j in range (0,len(a)):
        if(c[i]<a[j]):
            flag+=1;
    
    c[i] = 1 if (flag == 0)else 0;

print(c);
