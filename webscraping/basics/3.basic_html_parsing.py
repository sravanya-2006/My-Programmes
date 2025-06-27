import requests
from bs4 import BeautifulSoup

url = "https://example.com"
response = requests.get(url)
soup = BeautifulSoup(response.text, 'html.parser')

title_tag = soup.title
if title_tag:
    print("Title Tag:", title_tag)
    print("Title Text:", title_tag.string)
else:
    print("No title tag found.")

