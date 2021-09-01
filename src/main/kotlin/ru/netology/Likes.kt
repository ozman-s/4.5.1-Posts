package ru.netology

data class Likes(
    val count: Int = 0, // число пользователей, которым понравилась запись
    val userLikes: Boolean = false, // наличие отметки «Мне нравится» от текущего пользователя
    val canLike: Boolean = false, // информация о том, может ли текущий пользователь поставить отметку «Мне нравится»
    val canPublish: Boolean = false // информация о том, может ли текущий пользователь сделать репост записи
)
