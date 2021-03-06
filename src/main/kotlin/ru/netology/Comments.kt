package ru.netology

data class Comments(
    val count: Int = 0, // количество комментариев
    val canPost: Boolean = false, // информация о том, может ли текущий пользователь комментировать запись (1 — может, 0 — не может);
    val groupsCanPost: Boolean = false, //информация о том, могут ли сообщества комментировать запись;
    val canClose: Boolean = false, // может ли текущий пользователь закрыть комментарии к записи;
    val canOpen: Boolean = false // может ли текущий пользователь открыть комментарии к записи.
)
