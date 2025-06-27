import requests

url = "https://example.com"
response = requests.get(url)

print("Status Code:", response.status_code)
print("HTML Content:", response.text[:500])
