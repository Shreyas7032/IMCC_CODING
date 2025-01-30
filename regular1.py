import re

string="Hello my name is tejas,my hello is my"

result=re.findall(r"^[H\w\w\w\w]",string)
print(result)
print("Length of {is} is=",len(result))