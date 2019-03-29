#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Sat Dec 22 15:42:32 2018

@author: zel0rd
"""


def solution(s, n):
    answer = ''
    for i in range(len(s)):
        if s[i].isupper():
            temp = ord(s[i]) + n
            if temp > 90:
                temp = temp % 90 + 64
            answer += chr(temp)
        elif s[i].islower():
            temp = ord(s[i]) + n
            if temp > 122:
                temp = temp % 122 + 96
            answer += chr(temp)
        else:
            answer += ' '
    return answer
