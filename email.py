import re

pat=r"[a-z0-9][@][a-z][.][a-z]{2,}$"

str="tejasjadhav1222003@gmail.com"

result=re.match(pat,str)
if result:
    print("ok")
else:
    print("not")