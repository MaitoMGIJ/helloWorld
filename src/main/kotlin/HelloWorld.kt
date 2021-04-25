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
    """.trimIndent();

    println(paragraph.trimMargin("** "))
}