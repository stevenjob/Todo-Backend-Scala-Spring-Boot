package com.sjob

import org.springframework.stereotype.Repository
import scala.collection.mutable.ListBuffer
import scala.collection.mutable.Map

@Repository
class InMemoryTodoRepository extends TodoRepository {

  var todos: Map[Long, Todo] = scala.collection.mutable.Map[Long, Todo]()
  var id: Long = 0;

  def create(todo: Todo) = {
    todo.id = id
    todos += (id -> todo)
    id += 1
    todo
  }

  def delete(id: Long) = {
    todos -= id
  }

  def deleteAll() = {
    todos empty
  }

  def edit(todo: Todo) = {
    todos += (todo.id -> todo)
  }

  def get(id: Long): Option[Todo] = {
    todos get id
  }

  def getAll(): Seq[Todo] = {
    todos.map(_._2).toSeq
  }

}