//fun main() {
//    var number = 1
//    while (number <= 5) {
//        println("Число:$number")
//        number++
//    }
//    var number = 1
////    while (number <= 10) {
////        println("Число:$number")
////        number++
////    }
//    while (number <= 10) {
//        println(number)
//        number++
//        if (number == 5) {
//            println("Останавливается на $number")
//            break
//        }
//    }
//    var number = 0
//    while (number < 10)
//        number++
//    if (number == 3) {
//        println("Останавливается на $number")
//    }
//
//    println("Напишите что-нибудь(для выходя введите 'выход'):")
//    while (true){
//        val input = readLine()
//        if (input =="выход"){
//            println("До свидания!")
//            break
//        }
//        println("Вы ввели $input")
//    }
//    var letter = "A"
//    while (letter <= "Z") {
//        print(letter)
//        letter++
//    }
//fun main() {
//    var level = 0
//    println("Добро пожаловать в Подземелье!")
//    while(level <5){
//        println("\n Вы на уровне $level")
//        println("Выберите действие: [1] Впреред | [2]Осмотреться|[0] Сдаться")
//        val input = readLine()
//        when(input) {
//            "1" -> {
//                level++
//                println("Вы переходите на уровень $level")
//            }
//
//            "2" -> {
//                println("Вы осматриваетесь. Тут ничего интрересного ")
//                continue
//            }
//            "0" -> {
//                println("Вы сдались. Игра окончена")
//            break
//            }
//            else -> {
//                println("Неверный ввод. Попробуйте снова")
//                continue
//            }
//        }
//        if (level ==5)
//            println("Поздравляю.Вы выбрались из подземелья")
//
//    }
//    var number: Int
//    do{
//        print("Введите число больше 10")
//        number = readln().toInt()
//    } while (number<=10)
//    println("Спасибо! Вы ввели $number")
//    print("")
//    var password: String? = readln()
//    while (password != "qwerty"){
//        print("Введите пароль")
//        password = readln()
//    }
//    println("Доступ разрешен")
//    var password: String?
//
//    do{ print("Введите пароль")
//        password = readln()
//    } while (password != "qwerty")
//    println("Доступ разрешен")
//    val fruits= listOf("apple","bananas", "cherry")
//    for (fruit in fruits){
//        println("Шаг $fruits")
//    }
//    val sentence = "kotlin is awesome"
//    val words = sentence.split(",")
//    print(words)
//    val data = "apple,banana,orange"
//    val fruits = data.split(",")
//    for (fruit in fruits){
//        println(fruit)
//    }
//    val messy = "word1,word2;word3|word4"
//    val parts = messy.split(",",";")
//    println(parts)
//    val fullName ="Иванов Иван"
//    val parts = fullName.split(" ")
//    val lastname = parts[0]
//    val firstName = parts[1]
//    println(" Фамилия $lastname, Имя $firstName")
//    print("Введите числа через пробел: ")
//    val input = readln()
//    val numbers = input.split(" ")
//    var sum = 0
//    for (number in numbers) {
//        sum += number.toInt()
//    }
//    println("Сумма чисел": $sum)
//fun main() {
//    val input = readln().split(",")
//    val symbol = input[1]
//    val fstnumber = input[0].toDouble()
//    val ndnumber = input[2].toDouble()
//    print("Введите первое число, знак операции и второе число через пробел:")
//    var rezult = 0.0
//    when (symbol) {
//        "/" -> rezult = fstnumber / ndnumber
//        "*" -> rezult = fstnumber * ndnumber
//        "+" -> rezult = fstnumber + ndnumber
//        "-" -> rezult = fstnumber - ndnumber
//        else -> println("Некоректный ввод")
//    }
//    println("$fstnumber $symbol $ndnumber = $rezult")
//    }

//}
//    import kotlin.random.Random
//    fun main() {
//    println(Random.nextInt())
//    println(Random.nextFloat())
//    println(Random.nextLong())
//    println(Random.nextDouble())
//    Random.nextInt(100 )
//    Random.nextInt(1,100 )
//    Random.nextLong(100 )
//    Random.nextLong(1,100 )
//    Random.nextDouble(5.0 )
//    Random.nextDouble(0.0, 5.0 )
//    val target = Random.nextInt(1,100)
//    println("Угадай число от 1 до 100")
//    while(true){
//        print("Введи число")
//        val input = readln().toInt()
//    when{
//        input < target -> println("Згаданное число больше")
//        input > target -> println("Загаданное число меньше")
//        else ->{
//            println("Поздравляю. Ты угадал число $target")
//            break
//        }
//    val part1 = arrayOf("Опытный","Скрытый", "Гигачад")
//    val part2 = arrayOf("стрелок", "волшебник", "трейдер")
//    val part3 = arrayOf("из CSGO","на максималках","из будущего, "," в бане у Гарбена","Безумный","Легендарный","с проклятым лутом")
//    val rand1 = (Math. random() * part1.size).toInt()
//    val rand2 = (Math. random() * part1.size).toInt()
//    val rand3 = (Math. random() * part1.size).toInt()
//    val phrase = "$-[part1[rand1]]- $-part2[rand2]] $-part3[rand3]}"
//    println("Ваш титул: $phrase")
//    }
