package ru.netology

data class Comments(
    val count: Int = 0, // количество комментариев
    val can_post: Boolean = false, // информация о том, может ли текущий пользователь комментировать запись (1 — может, 0 — не может);
    val groups_can_post: Boolean = false, //информация о том, могут ли сообщества комментировать запись;
    val can_close: Boolean = false, // может ли текущий пользователь закрыть комментарии к записи;
    val can_open: Boolean = false // может ли текущий пользователь открыть комментарии к записи.
)
