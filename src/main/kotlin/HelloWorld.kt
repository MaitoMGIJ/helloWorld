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

    val name = "Mauricio Avila"
}