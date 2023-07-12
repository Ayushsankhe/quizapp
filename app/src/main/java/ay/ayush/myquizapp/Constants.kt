package ay.ayush.myquizapp

object Constants {
    const val questio:String ="user_name"
fun getquestion():ArrayList<Questions>{
    val questionslist=ArrayList<Questions>()
    val que1=Questions(
        id = 1, Questions = "Which country does this flag belong to ?",R.drawable.indianflag,"India",
        "Argentina","Brazil","Indonesia",1)
    questionslist.add(que1)
    val que2=Questions(
        id = 1, Questions = "Which country does this flag belong to ?",R.drawable.indianflag,"India",
        "india","Brazil","Indonesia",2)
    questionslist.add(que2)
    val que3=Questions(
        id = 1, Questions = "Which country does this flag belong to ?",R.drawable.indianflag,"India",
        "Argentina","Brazil","Indonesia",1)
    questionslist.add(que3)
    val que4=Questions(
        id = 1, Questions = "Which country does this flag belong to ?",R.drawable.indianflag,"India",
        "Argentina","Brazil","Indonesia",1)
    questionslist.add(que4)
    val que5=Questions(
        id = 1, Questions = "Which country does this flag belong to ?",R.drawable.indianflag,"India",
        "Argentina","Brazil","Indonesia",1)
    questionslist.add(que5)
    val que6=Questions(
        id = 1, Questions = "Which country does this flag belong to ?",R.drawable.indianflag,"India",
        "Argentina","Brazil","Indonesia",1)
    questionslist.add(que6)
    val que7=Questions(
        id = 1, Questions = "Which country does this flag belong to ?",R.drawable.indianflag,"India",
        "Argentina","Brazil","Indonesia",1)
    questionslist.add(que7)
    val que8=Questions(
        id = 1, Questions = "Which country does this flag belong to ?",R.drawable.indianflag,"India",
        "Argentina","Brazil","Indonesia",1)
    questionslist.add(que8)
    val que9=Questions(
        id = 1, Questions = "Which country does this flag belong to ?",R.drawable.indianflag,"India",
        "Argentina","Brazil","Indonesia",1)
    questionslist.add(que9)

    return questionslist
}

}