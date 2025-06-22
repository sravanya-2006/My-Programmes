import time

def delayed_function():
    print("Function invoked!")
def invoke_after_milliseconds(function, seconds):
    time.sleep(seconds)
    function()
seconds_delay = 2
invoke_after_milliseconds(delayed_function, seconds_delay)
print("Program continues...")