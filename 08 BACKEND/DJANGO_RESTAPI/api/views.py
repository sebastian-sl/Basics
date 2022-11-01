from django.shortcuts import render
from rest_framework.decorators import api_view
from rest_framework.response import Response

# Create your views here.
@api_view(["GET"])
def index(request):
    example = {
        "id": 1,
        "user": "test",
        "msg": "Hello World!"
    }

    return Response(example)


@api_view(["GET"])
def getUser(request, username):
    example = {
        "id": 1,
        "name": username,
        "age": 30,
    }

    return Response(example)
