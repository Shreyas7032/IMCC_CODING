from django.shortcuts import render
from django.http import HttpResponse

def index(Request):
    return render(Request,'index.html')


def index2(request):
    return HttpResponse("name={{u_name}},address={{addr}}")

