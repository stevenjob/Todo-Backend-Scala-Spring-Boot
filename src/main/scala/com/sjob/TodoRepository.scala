package com.sjob

import org.springframework.stereotype.Repository

@Repository
trait TodoRepository {
  def create(todo: Todo): Todo
  def get(id: Long): Option[Todo]
  def getAll(): Seq[Todo]
  def edit(todo: Todo): Todo
  def delete(id: Long)
  def deleteAll()
}