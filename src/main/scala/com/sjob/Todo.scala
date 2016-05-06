package com.sjob
import scala.beans.BeanProperty

class Todo {

  @BeanProperty
  var id: Long = _

  @BeanProperty
  var title: String = _

  @BeanProperty
  var completed: Boolean = _
}