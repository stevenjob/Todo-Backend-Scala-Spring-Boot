package com.sjob

import org.springframework.web.bind.annotation._
import org.springframework.validation.BindingResult
import org.springframework.beans.factory.annotation.Autowired
import java.lang.Long
import javax.validation.Valid
import scala.collection.JavaConversions._

@RestController
@CrossOrigin
@RequestMapping(Array("/todos"))
class TodoController @Autowired()(private val todoService: TodoService) {

  @RequestMapping(method = Array(RequestMethod.GET))
  def getAll(): java.util.List[Todo] = {
    todoService getAll
  }

  @RequestMapping(value = Array("/{id}"), method = Array(RequestMethod.GET))
  def getByID(@PathVariable("id") id: Long) = {
    todoService.get(id)
  }

  @RequestMapping(method = Array(RequestMethod.POST))
  def create(@Valid todo: Todo, bindingResult: BindingResult) = {
    if (bindingResult.hasErrors()) {
      //TODO do something
    } else {
      todoService.create(todo)
    }
  }

  @RequestMapping(value = Array("/{id}"), method = Array(RequestMethod.PATCH))
  def edit(@PathVariable("id") id: String, @RequestBody todoUpdates: Todo) = {
    todoService.edit(todoUpdates)
  }

  @RequestMapping(value = Array("/{id}"), method = Array(RequestMethod.DELETE))
  def deleteByID(@PathVariable("id") id: Long) = {
    todoService.delete(id)
  }

  @RequestMapping(method = Array(RequestMethod.DELETE))
  def deleteAll() {
    todoService.deleteAll
  }

}
