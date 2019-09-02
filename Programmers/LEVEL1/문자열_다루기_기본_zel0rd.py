#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Sun Dec  2 21:25:21 2018

@author: zel0rd
"""
def solution(s):
    if(s.isdigit()):
        if(len(s) == 4 or len(s) ==  6):
            return True
        else:
            return False
    else:
        return False
    
    
        
        