import re

def remove_whitespaces(line):
    return re.sub(r'\s+','',line)

with open('source.txt','r') as file:
    with open('Destination.txt','w') as compras:

        for line in file:
            compact_line=remove_whitespaces(line)
            compras.write(f'{compact_line}\n')
print('Comprassed Succesfully....')