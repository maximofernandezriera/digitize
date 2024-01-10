### Codewars Convert number to reversed array of digits
# https://www.codewars.com/kata/5583090cbe83f4fd8c000051/train/java

## Pseudocódigo (es decir, análisis del problema)
```
Función digitize(número):
    Si número es igual a 0:
        Devolver [0]

    temp = número
    longitud = 0

    Mientras temp sea mayor que 0:
        Incrementar longitud en 1
        temp = temp dividido por 10

    Crear una tabla resultado con tamaño igual a longitud

    Para i desde 0 hasta longitud - 1:
        resultado[i] = número módulo 10
        número = número dividido por 10

    Devolver resultado
Fin Función

```


| Bucle | Propósito | Inicialización | Condición | Cuerpo del Bucle | Fin del Bucle |
|-------|-----------|----------------|-----------|------------------|---------------|
| While | Contar el número de dígitos en `número`. | `temp = número`<br>`longitud = 0` | `temp > 0` | - Incrementa `longitud` en 1.<br>- Divide `temp` por 10 para eliminar el último dígito. | Cuando `temp` se reduce a 0, el bucle termina. `longitud` contiene el número total de dígitos. |
| For   | Extraer cada dígito de `número` y almacenarlo en una tabla (o array) en orden inverso. | `i = 0` | `i < longitud` | - Almacena el último dígito de `número` en `resultado[i]`.<br>- Elimina el último dígito de `número`. | Cuando `i` alcanza `longitud`, todos los dígitos han sido procesados y el bucle termina. |
