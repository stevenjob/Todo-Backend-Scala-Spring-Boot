package com.sjob

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class TodoService @Autowired()(private val todoRepository: TodoRepository) {

  def create(todo: Todo): Todo = {
    todoRepository.create(todo)
  }

  def get(id: Long): Option[Todo] = {
    todoRepository.get(id)
  }

  def getAll(): Seq[Todo] = {
    todoRepository.getAll
  }

  def edit(todo: Todo): Todo = {
    todoRepository.edit(todo)
  }

  def delete(id: Long) = {
    todoRepository.delete(id)
  }

  def deleteAll() = {
    todoRepository.deleteAll
  }

}