#include <stdio.h>


// void no return
// data type return datatype
float toCelcius(float Kelvin) {

    float Celcius = Kelvin - 273;
    return Celcius;
}
float toKelvin(float celcius) {

   float Kelvin = celcius + 273;
   return Kelvin;
}
int main(){
  float Celcius = 75.3;
  float Kelvin = toKelvin (celcius);
  
  printf("%f",Kelvin);

}
