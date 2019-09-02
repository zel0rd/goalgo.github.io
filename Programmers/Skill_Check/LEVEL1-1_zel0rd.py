#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Mon Sep  2 17:11:30 2019

@author: zelord
"""

def solution(arr1, arr2):
    answer = []
    for i in range(len(arr1)):
        temp = []
        for j in range(len(arr1[0])):
            temp.append(arr1[i][j] + arr2[i][j])
        answer.append(temp)
    return answer