/* Practica de Suma de Arreglo con funciones 

Ejercicio 1

Escribe una función que reciba un array de números y devuelva la suma de esos números. Los números pueden ser negativos. Si el array está vacío, devuelve 0.

Ejemplos

Entrada: [1, 5.2, 4, 0, -1]
Salida:9.2

Entrada: [-2.398]
Salida:-2.398

Entrada: []
Salida:0

*/


public class SumArray {

  public static double sum(double[] numbers) {
            double sum = 0;

  for (double number: numbers) {//Dentro de las funciones es necesario tener la condicion
            sum += number;
        }
        return sum ;
}// esta lla siempre va despues del return
      public static void main (String[] args) {// aqui mande a llamar la funcion  llamada sum para sacar el total que era lo que se me pedia 

        double[] numbers = {1, 5.2, 4, 0, -1};

        double total = sum(numbers);

        System.out.println(total);
  }
}
//Ojo es importante que revises minuciosamente la  sintaxis y el cierre de llaves son detalles a pulir 