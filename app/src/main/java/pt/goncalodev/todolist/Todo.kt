package pt.goncalodev.todolist

import android.os.Build
import androidx.annotation.RequiresApi
import java.time.Instant
import java.util.Date

data class Todo(
    var id: Int,
    var title: String,
    var createdAt: Date
)


@RequiresApi(Build.VERSION_CODES.O)
fun getFakeTodos(): List<Todo>{
    return listOf<Todo>(
        Todo(1,"First todo", Date.from(Instant.now())),
        Todo(2,"First2 todo", Date.from(Instant.now())),
        Todo(3,"First3 todo", Date.from(Instant.now())),
        Todo(4,"First4 todo", Date.from(Instant.now())),
        Todo(5,"First5 todo", Date.from(Instant.now())),
    )
}
