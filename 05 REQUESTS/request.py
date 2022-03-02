import requests
import json
from bs4 import BeautifulSoup


# GET REQUEST (API)
r = requests.get("https://jsonplaceholder.typicode.com/users")

users = r.json()

print(json.dumps(users, indent=4))                                      # Json module isn't needed but its more readable when printing

for user in users:                                                      # iterating over every object in the json and printing some attributes
    print(user["id"], user["name"])


# WEB SCRAPING (not really recommended, because of multiple things like security, cookies, javascript, better use an api and above method)
HEADERS = {"User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/98.0.4758.102 Safari/537.36"}
URL = "https://www.amazon.de/fire-hd-10-plus/dp/B08F682ZHL"

page = requests.get(URL, headers=HEADERS)
soup = BeautifulSoup(page.content, "html.parser")

price = soup.find(attrs={"class": "a-offscreen"}).get_text()            # returns the price of the item
print(price)


# Find multiple Items (just an example)
URL_NEW = "http://wiki.pythonchallenge.com/"

page = requests.get(URL_NEW, headers=HEADERS)
soup = BeautifulSoup(page.content, "html.parser")

level_paragraphs = soup.find_all(attrs={"class": "external text"})      # returns a list of all elements with given argument

levels = []

for level in level_paragraphs:                                          # need to iterate over them
    if "Level" in level.get_text():
        levels.append(level.get_text())

print(levels)
