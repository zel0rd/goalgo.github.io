#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Sun Dec  2 21:58:02 2018

@author: zel0rd
"""

def solution(s):
    if(s[0] == "-"):
        return -int(s[1:])
    else:
        return int(s)