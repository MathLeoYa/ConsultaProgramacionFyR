// Funcion integral(por metodo Simpson)
def integral(f: Double => Double, a: Double, b: Double): Double = {
  (b - a) * ((f(a) + 4 * f((a + b) / 2) + f(b)) / 6)
}
// Función para calcular el error
def calcularError(x: Double, y: Double): Double = {
  math.abs(x - y)
}


// Ejercicio 1:
val f: Double => Double = x => -(x * x) + 8 * x - 12
val resultado = integral(f, 3, 5)
val error = calcularError(7.33, resultado)


//Ejercicio 2:
val f2: Double => Double = x => 3 * (x * x)
val resultado2 = integral(f2, 0, 2)
val error2 = calcularError(8.0, resultado2)


//Ejercicio 3:
val f3: Double => Double = x => x + 2 * (x * x) - (x * x * x) + 5 * (x * x * x * x)
val resultado3 = integral(f3, -1.0, 1.0)
val error3 = calcularError(3.333, resultado3)


//Ejercicio 4:
val f4: Double => Double = x => (2 * x + 1) / (x * x + x)
val resultado4 = integral(f4, 1.0, 2.0)
val error4 = calcularError(1.09861, resultado4)


//Ejercicio 5:
val f5: Double => Double = x => math.pow(math.E,x)
val resultado5 = integral(f5,0.0, 1.0)
val errorExponencial = calcularError(1.71828, resultado5)


//Ejercicio 6:
import scala.math.sqrt
val f6: Double => Double = x => 1.0 / (sqrt(x) - 1)
val resultado6 = integral(f6, 2.0,3.0)
val error6 = calcularError(0.828427, resultado6)


//Ejercicio 7:
val f7: Double => Double = x => 1.0 / (1 + x * x)
val resultado7 = integral(f7, 0.0, 1.0)
val error7 = calcularError(0.785398, resultado7)