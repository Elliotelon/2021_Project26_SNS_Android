package fastcampus.aop.part5.chapter04.chatdetail

data class ChatItem(
    val senderId: String,
    val message: String
) {

    constructor(): this("", "")
}