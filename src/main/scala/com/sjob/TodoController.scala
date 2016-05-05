package com.sjob

import org.springframework.web.bind.annotation._
import org.springframework.validation.BindingResult
import java.lang.Long
import javax.validation.Valid

@RestController
@CrossOrigin
@RequestMapping(Array("/todos"))
class TodoController {

  @RequestMapping(method = Array(RequestMethod.GET))
  def get() = {

  }

  @RequestMapping(value = Array("/{id}"), method = Array(RequestMethod.GET))
  def getByID(@PathVariable("id") id: Long) = {

  }

  @RequestMapping(method = Array(RequestMethod.POST))
  def create(@Valid todo: Todo, bindingResult: BindingResult) = {
    if (bindingResult.hasErrors()) {
      //TODO do something
    } else {

    }
  }

  @RequestMapping(value = Array("/{id}"), method = Array(RequestMethod.PATCH))
  def update(@PathVariable("id") id: String, @RequestBody todoUpdates: Todo) = {

  }

  @RequestMapping(value = Array("/{id}"), method = Array(RequestMethod.DELETE))
  def deleteByID(@PathVariable("id") id: Long) = {

  }

  @RequestMapping(method = Array(RequestMethod.DELETE))
  def deleteAll() {

  }

}
