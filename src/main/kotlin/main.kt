fun main() {
    val likes: Int = 111;
    val people: String = " �����"
    val person: String = " ��������"

    if (likes < 100 && likes % 10 == 1) {
        println("����������� " + likes + person)
    } else if (likes % 100 == 11 ) {
        println("����������� " + likes + people)
    } else {
        println("����������� " + likes + people)
    }


}