package com.sjob

import org.springframework.stereotype.Repository
import scala.collection.mutable.ListBuffer

@Repository
class InMemoryTodoRepository extends TodoRepository {

  var todos: ListBuffer[Todo] = new ListBuffer[Todo]()

  def create(todo: Todo) = {
    todos += todo
  }

  def delete(id: Long) = {}

  def deleteAll() = {}

  def edit(todo: Todo) = {

  }

  def get(id: Long): Todo = {
    null
  }

  def getAll(): ListBuffer[Todo] = {
    todos
  }

}