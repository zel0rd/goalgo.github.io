#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Sat Dec 22 15:42:32 2018

@author: zel0rd
"""

def solution(s, n):
    list1 = list(s)
    small = []
    big = []
    for i in range(len(list1)):
        if(ord(list1[i]) >= 97 and ord(list1[i]) <= 122):
            small.append(list1[i])
        elif(ord(list1[i]) >= 65 and ord(list1[i]) <= 90):
            big.append(list1[i])
    answer = ''
    return answer


