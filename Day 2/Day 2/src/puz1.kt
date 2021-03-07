import java.io.File

fun main() {
    val input: List<String> = File("Day 2\\Day 2\\src\\Puzzle_1\\Database").readLines()
    var counter = 0

    for (e in input) {
        val parts = e.split(" ", ":", "-")
        val firstNumber = parts[0].toInt()
        val secondNumber = parts[1].toInt()
        val char = parts[2].trim().single()
        val sentence = parts[4].toCharArray()

        if (sentence.filter { it == char }.count() in firstNumber..secondNumber) counter++
    }
    println(counter)
}