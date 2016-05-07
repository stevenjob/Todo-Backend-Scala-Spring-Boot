package com.sjob

import java.net.URI

import org.springframework.stereotype.Repository

import scala.collection.mutable.ListBuffer
import scala.collection.mutable.Map


@Repository
class InMemoryTodoRepository extends TodoRepository {

  var todos: Map[Long, Todo] = scala.collection.mutable.Map[Long, Todo]()
  var id: Long = 0;

  def create(todo: Todo): Todo = {
    todo.id = id
    todo.url = URI.create(todo.requestURI + "/" + id)
    todos += (id -> todo)
    id += 1
    todo
  }

  def delete(id: Long) = {
    todos -= id
  }

  def deleteAll() = {
    todos = scala.collection.mutable.Map[Long, Todo]()
  }

  def edit(todoUpdate: Todo): Todo = {

    //what should happen if you try to edit a todo that doesnt exist?
    var currentTodo = todos get todoUpdate.id getOrElse todoUpdate

    if (todoUpdate.titleOption.isDefined) {
      currentTodo.title = todoUpdate.title
    }

    if (todoUpdate.completedOption.isDefined) {
      currentTodo.completed = todoUpdate.completed
    }

    if (todoUpdate.orderOption.isDefined) {
      currentTodo.order = todoUpdate.order
    }

    todos += (currentTodo.id -> currentTodo)
    currentTodo
  }

  def get(id: Long): Option[Todo] = {
    todos get id
  }

  def getAll(): Seq[Todo] = {
    todos.map(_._2).toSeq.sortBy(_.orderOption)
  }

}