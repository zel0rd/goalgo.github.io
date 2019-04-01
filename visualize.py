#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Mon Apr  1 13:58:19 2019

@author: zelord
"""

import os
from datetime import date
import matplotlib.pyplot as plt
import matplotlib.pyplot as pyplot


def search(dirname):
    try:
        filenames = os.listdir(dirname)
        for filename in filenames:
            full_filename = os.path.join(dirname, filename)
            
            if os.path.isdir(full_filename):
                folder_list.append(full_filename)
                search(full_filename)
            else:
                file_list.append(full_filename)
                #print(full_filename)
                ext = os.path.splitext(full_filename)[-1]
                file_type.append(ext)
                if ext == '.py':
                    file_list.append(full_filename)
                    
    except PermissionError:
        pass
    
folder_list = []
file_list = []
file_type = []
file_dict = {}


dirname = os.getcwd()

filenames = os.listdir(dirname)



search(dirname)
file_type = list(set(file_type))


file_dict = { i : 0 for i in file_type}

for i in file_list:
    ext = os.path.splitext(i)[-1]
    if ext in file_dict.keys():
        file_dict[ext] += 1

del file_dict['']
print(file_dict)

now = time.localtime()
s = "%04d-%02d-%02d_%02d-%02d-%02d.png" % (now.tm_year, now.tm_mon, now.tm_mday, now.tm_hour, now.tm_min, now.tm_sec)

labels = file_dict.keys()
sizes = file_dict.values()
fig1, ax1 = plt.subplots()
ax1.pie(sizes, labels=labels, autopct='%1.1f%%', shadow=True, startangle=90)
ax1.axis('equal')

plt.savefig('./reference/' + s + '.png')

