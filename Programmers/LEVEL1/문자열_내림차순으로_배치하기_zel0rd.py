#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Sun Dec  2 21:39:53 2018

@author: zel0rd
"""
def solution(s):
    answer = sorted(s, reverse=True)
    return "".join(answer)