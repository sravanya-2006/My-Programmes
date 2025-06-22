from logic import *

rain = Symbol("rain") #It is raining.
hagrid = Symbol("hagrid") #Harry visited Hagrid.
dumbeldore = Symbol("dumbledore") #Harry visited Dumbledore.

sentence = And(rain,hagrid)

print(sentence.formula())