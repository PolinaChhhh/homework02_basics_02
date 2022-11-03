fun main() {
    val likes: Int = 111;
    val people: String = " людям"
    val person: String = " человеку"

    if (likes < 100 && likes % 10 == 1) {
        println("Понравилось " + likes + person)
    } else if (likes % 100 == 11 ) {
        println("Понравилось " + likes + people)
    } else {
        println("Понравилось " + likes + people)
    }


}