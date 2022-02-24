package com.example.gooseNotes.ui.detail

import androidx.lifecycle.ViewModel
import com.example.gooseNotes.models.TaskList

class ListDetailViewModel : ViewModel() {
    lateinit var onTaskAdded: () -> Unit
    lateinit var list: TaskList

    fun addTask(task: String) {
        list.tasks.add(task)
        onTaskAdded.invoke()
    }
}