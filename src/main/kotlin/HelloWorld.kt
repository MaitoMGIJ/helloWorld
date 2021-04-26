const val N = "NAME"

fun main (args: Array<String>){
    println("Hello World")
    println("Datatype primitives")
    println(1+1)
    println(3-1)
    println(2*2)
    println(4/2)
    println(7%2)

    val a = 4
    val b = 2

    println("Datatype as objects")
    println(a.plus(b))
    println(a.minus(b))
    println(a.times(b))
    println(a.div(b))

    println("var - val - const")

    val nameArgs = args[0]

    println(nameArgs)
    println(N)

    //Strings
    val name = "Mauricio"
    val lastname:String = "Avila"
    val fullname:String = "Mauricio\nAvila"

    println("Your name is: $name $lastname")
    println("Now, your name is: $fullname")
    //Raw String
    val paragraph = """
        ** Lorem Ipsum is simply dummy text of the printing and typesetting industry. 
        ** Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, 
        ** when an unknown printer took a galley of type and scrambled it to make a type specimen book. 
        ** It has survived not only five centuries, but also the leap into electronic typesetting, 
        ** remaining essentially unchanged.
        It was popularised in the 1960s with the release of Letraset 
        ** sheets containing Lorem Ipsum passages, and more recently with desktop 
        ** publishing software like Aldus PageMaker including versions of Lorem Ipsum
    """.trimIndent()

    println(paragraph.trimMargin("** "))

    //Ranges
    println("Ranges")
    val oneToFive:IntRange = 1..5
    val oneToA:IntRange = 1..a
    println("oneToFive")
    for (i in oneToFive){
        println(i)
    }
    println("oneToA")
    for (i in oneToA){
        println(i)
    }

    println("Range of char")
    val letterAToC:CharRange = 'A'..'C'
    for(letter in letterAToC){
        println(letter)
    }

    //Control statements
    val number = 7
    if(number.equals(2)){
        println("Yes, the number is equal to 2")
    }else{
        println("No, the number isn't equal to 2")
    }

    //Switch is now When
    when(number){
        in 1..5 -> println("Yes, the number is between 1 and 5")
        in 1..3 -> println("Yes, the number is between 1 and 3")
        !in 5..10 -> println("No, the number isn't between 5 and 10")
        else -> println("Ops, the number isn't in any before cases")
    }

    //Loops
    var i = 1
    println("While")
    while (i.compareTo(10) <= 0){
        println("Message: $i")
        i++
    }

    println("Do While")
    i = 1
    do{
        println("Message: $i")
        i++
    }while(i.compareTo(10) <= 0)

    println("For")
    var daysOfWeek = listOf("Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday")

    for(day in daysOfWeek){
        println(day)
    }

    for((index,day) in daysOfWeek.withIndex()){
        println("$index :$day")
    }

    println("ForEach")
    daysOfWeek.forEach{
        println(it)
    }

    var compute:String? = null

    var long: Int = compute?.length ?: 0

    println("Null Safety and Elvis Operator")
    println("String length for $compute is $long")

    val listWithNulls: List<Int?> = listOf<Int?>(7,null,null,4)
    val listWithoutNulls: List<Int> = listWithNulls.filterNotNull();

    println("List With Nulls")
    println(listWithNulls)
    println("List Without Nulls")
    println(listWithoutNulls)

    println("Array")
    var countries = arrayOf("India", "Mexico", "Colombia", "Argentina", "Chile", "Peru")
    val days = arrayOf<String>("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    val numbers = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    countries = countries.reversedArray()
    days.reverse()
    println("Countries:")
    println(countries.contentToString())
    println("Days:")
    println(days.contentToString())
    println("Numbers Sum:")
    println(numbers.sum())


}