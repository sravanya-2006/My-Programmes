import requests
from bs4 import BeautifulSoup

url = "https://example.com"
response = requests.get(url)
soup = BeautifulSoup(response.text, 'html.parser')

links = soup.find_all('a')
for link in links:
    href = link.get('href')
    if href:
        print("Link:", href)
    else:
        print("Link without href found")    