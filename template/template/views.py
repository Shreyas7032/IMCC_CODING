from django.http import HttpResponse
from django.shortcuts import render

def index(request):
    params={"name":"shreyas","place":"khatav"}
    return render(request,'index.html',params)