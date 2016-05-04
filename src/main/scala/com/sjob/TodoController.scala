package com.sjob

import org.springframework.web.bind.annotation._

@RestController
@CrossOrigin
@RequestMapping(Array("/todos"))
class TodoController {
  
    @RequestMapping(method = Array(RequestMethod.GET))
    def list() = {

    }
}
