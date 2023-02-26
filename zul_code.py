#!/usr/bin/env python
# coding: utf-8

# In[1]:


var = "I am zulqarnain"
print(var)


# In[3]:


type(var)


# In[4]:


print(type(var))


# In[7]:


var1=var2=var3 = 3
print(var1)
print(var2)
print(var3)


# In[10]:


# how to unpack the lists, tuples etc. 

list = [3, 5, 6, 9, 1]
a, b, c, d, e=list
print(c)


# In[14]:


a, b, c = '2', '3', '4'
print(a+b+c)


# In[2]:


lis=[3, 5, 6,3,6 ,5]
lis[1]=10
print(lis)


# In[12]:


tupl= (2, 3, 4, 2)

tupl.index(4)


# In[14]:


import numpy as np

arr = np.array([1, 2, 3, 4, 5])

print(arr)

print(type(arr))


# In[22]:


def mySimpleFunction(a, b):
    c=a+b
    return c
    

print(mySimpleFunction(5,4))


# In[1]:


get_ipython().system('pip list')


# In[9]:


import numpy
x=(dir(numpy))
y=iter(x)
for i in range(len(x)):
    i=i+1
print(i)


# In[ ]:




