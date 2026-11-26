# Métodos Numéricos en Java

Práctica de resolución numérica de ecuaciones diferenciales ordinarias.

## Métodos implementados

- Método de Euler.
- Método Runge-Kutta de cuarto orden (RK4).

## Archivos del proyecto

- Main.java
- MetodoEuler.java
- MetodoRungeKutta.java

## Parámetros utilizados

- Valor inicial: x0 = 0
- Condición inicial: y0 = 1
- Valor final: x = 0.3

### Método de Euler
Se utilizaron los tamaños de paso:
- h = 0.1
- h = 0.05
- h = 0.01

### Método Runge-Kutta
Se utilizó:
- h = 0.1

## Ejecución del programa

Compilar:

```bash
javac -d out src/*.java
```

Ejecutar:

```bash
java -cp out Main
```

## Lenguaje utilizado

Java.
