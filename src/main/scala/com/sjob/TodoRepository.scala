package com.sjob

import org.springframework.stereotype.Repository

@Repository
trait TodoRepository {
  def create(todo: Todo)
  def get(id: Long): Todo
  def getAll(): Seq[Todo]
  def edit(todo: Todo)
  def delete(id: Long)
  def deleteAll()
}