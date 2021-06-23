package fastcampus.aop.part5.chapter04.home

data class ArticleModel(
    val sellerId: String,
    val title: String,
    val createdAt: Long,
    val content: String,
    val imageUrl: String
) {

    constructor(): this("", "", 0, "", "")

}