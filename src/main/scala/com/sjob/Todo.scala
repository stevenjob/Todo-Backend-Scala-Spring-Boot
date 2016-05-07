package com.sjob

import scala.beans.BeanProperty
import java.net.URI
import java.lang.Integer

class Todo {

  @BeanProperty
  var url: URI = _

  var requestURI: String = _

  @BeanProperty
  var id: Long = _

  @BeanProperty
  var title: String = _

  @BeanProperty
  var completed: Boolean = _

  @BeanProperty
  var order: Integer = 0

}