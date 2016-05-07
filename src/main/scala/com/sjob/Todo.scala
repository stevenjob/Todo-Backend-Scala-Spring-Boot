package com.sjob

import scala.beans.BeanProperty
import java.net.URI;

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
}