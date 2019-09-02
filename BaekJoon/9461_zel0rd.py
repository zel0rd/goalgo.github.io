#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Mon Sep  2 15:44:20 2019

@author: zelord
"""
    
#1
T = int(input())
for i in range(T):
    a = int(input())
    list = [1, 1, 1, 2, 2, 3, 4, 5, 7, 9]
    for i in range(11,a+1):
        temp = list[i-2]+list[i-6]
        list.append(temp)
    print(list[a-1])
    
    
    
    
#2
list = []
result = [1, 1, 1, 2, 2, 3, 4, 5, 7, 9]
T = int(input())
for _ in range(T):
    list.append(int(input()))

if int(max(list)) > 10:
    for i in range(11,max(list) + 1):
        result.append(int(result[i-2] + result[i-6]))

for i in list:
    print(result[i-1])
        