package Segundo_punto;

public class rectangulo {
int base,altura;
rectangulo(int base, int altura){
this.base=base;
this.altura=altura;
}
 double calcularArea() {
return base*altura;
}
double calcularPerimetro() {
return (2*base)+(2*altura);
}
}