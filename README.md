# Преобразовать код на scala в функциональный стиль

Задча - ниже дан фрагмент кода, который выполняет операции над списком строк. 
Код написан в императивном стиле, использует изменяемые переменные и циклы. 
Необходимо преобразовать этот код в функциональный стиль.

```scala
object StringProcessor {
  def processStrings(strings: List[String]): List[String] = {
    var result = List[String]()
    for (str <- strings) {
      if (str.length > 3) {
        result = result :+ str.toUpperCase
      }
    }
    result
  }

  def main(args: Array[String]): Unit = {
    val strings = List("apple", "cat", "banana", "dog", "elephant")
    val processedStrings = processStrings(strings)
    println(s"Processed strings: $processedStrings")
  }
}
```
Необходимо вывести из списка значения, длина которых больше 3-х, в верхнем регистре.

_Результат работы скрипта:_
```
Processed strings: List(APPLE, BANANA, ELEPHANT)
```

## Основные изменения в коде:
1) Вместо переменной result, используются методы filter и map, которые возвращают новый список.
2) Вместо цикла for, используются методы высшего порядка filter и map, которые сокращают код и делают его более читаемым.
