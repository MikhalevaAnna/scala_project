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
