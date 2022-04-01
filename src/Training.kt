data class Training(val tame: Int, val exercises: String, val repeat: Int, val difficult: String = "Easy"){
}

fun main() {
    val training = Training(10, "squats", 30,)
    print(training)
}