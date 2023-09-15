import kotlin.math.pow

fun main(args: Array<String>) {
    //1
    val exercises = 13
    var exercisesSolved = 0
    exercisesSolved += 1

    //2
    val myAge: Int = 18

    //3
    var personAge: Double = 18.0
    val anotherPersonAge: Double = 30.0
    personAge = (personAge + anotherPersonAge) / 2.0

    //4
    val testNumber = 7 //
    val evenOdd = testNumber % 2

    //5
    var answer = 0
    answer += 1 // answer = 1
    answer += 10 // answer = 11
    answer *= 10 // answer = 110
    answer = answer shr 3 // answer = 13


    //6
    var age = 16
    println(age)
    age = 30
    println(age)


    //7
    val a:Int=46
    val b:Int=10
    val answer1:Int=(a*100)+b
    println(answer1)
    val answer2:Int=(a*100)+(b*100)
    println(answer2)
    val answer3:Int=(a*100)+(b/10)
    println(answer3)

    //8
    println((5*3)-((4/2)*2))


    //9
    val aa: Double = 10.0
    val bb: Double = 20.0
    val average: Double = (aa + bb) / 2.0
    println("Среднее арифметическое чисел a и b: $average")



    //10
    val fahrenheit: Double = 68.0 // Пример температуры в градусах Фаренгейта
    val celcius: Double = (fahrenheit - 32) / 1.8
    println(celcius)
    println("Температура в °C: $celcius")



    //11
    val position: Int = 42 // Пример номера позиции на доске
    val row: Int = position / 8
    val column: Int = position % 8
    println("Номер строки: $row, Номер столбца: $column")



    //12
    val degrees: Double = 45.0 // Пример угла в градусах
    val radians: Double = degrees * (Math.PI / 180.0)
    println("Угол в радианах: $radians")


    //13
    val x1: Double = 1.0
    val y1: Double = 2.0
    val x2: Double = 4.0
    val y2: Double = 6.0

    val distance: Double = Math.sqrt((x2 - x1).pow(2) + (y2 - y1).pow(2))

    println("Расстояние между точками: $distance")

}