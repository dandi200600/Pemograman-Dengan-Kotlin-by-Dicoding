class User(val name : String, val age : Int)

data class DataUser(val name : String, val age : Int)

fun main(){
    val user = User("dandi", 19)
    val dataUser = DataUser("dandi", 19)

    println(user)
    println(dataUser)
}