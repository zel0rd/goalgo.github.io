#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Sun Dec  2 21:47:17 2018

@author: zel0rd
"""
def solution(seoul):
    if("Kim" in seoul):
        return "김서방은 " + str(seoul.index("Kim")) +"에 있다"