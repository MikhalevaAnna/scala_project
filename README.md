# Преобразовать код на scala в функциональный стиль

Задча - ниже дан фрагмент кода, который выполняет операции над списком строк. 
Код написан в императивном стиле, использует изменяемые переменные и циклы. 
Необходимо преобразовать этот код в функциональный стиль.

## Исходный код:
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
Необходимо вывести новый список в верхнем регистре, чтобы длина каждого элемента была больше 3-х.

_Результат работы скрипта:_
```
Processed strings: List(APPLE, BANANA, ELEPHANT)
```

## Преобразованный код:
```scala
object StringProcessor {
  def processStrings(strings: List[String]): List[String] = {
    strings
      .filter(_.length > 3)   // фильтрация по длине элемента списка
      .map(_.toUpperCase)    // преобразование в верхний регистр
  }

  def main(args: Array[String]): Unit = {
    val strings = List("apple", "cat", "banana", "dog", "elephant")
    val processedStrings = processStrings(strings)
    println(s"Processed strings: $processedStrings")
  }
}
```
1) Переменная `result` не используется. Теперь применение заданных функций `filter` и `map` возвращает новый список.
2) Функции высшего порядка `filter` и `map`, используются вместо цикла `for`, они сокращают код и делают его более читаемым.
