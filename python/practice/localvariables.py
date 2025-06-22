def function():
    a = 1
    b = 2
    c = "kesav"
    d = [1,2,3]
    var = locals()
    num = len(var)
    print(f"Local variables: {var}")
    print(f"Number of local variables: {num}")
function()
