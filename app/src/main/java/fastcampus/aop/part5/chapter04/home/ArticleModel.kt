package fastcampus.aop.part5.chapter04.home

data class ArticleModel(
    val userId: String,
    val title: String,
    val createdAt: Long,
    val content: String,
    val imageUrlList: List<String>
) {

    constructor(): this("", "", 0, "", listOf())

}