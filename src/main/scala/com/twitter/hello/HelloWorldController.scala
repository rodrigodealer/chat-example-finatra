package com.twitter.hello

import com.google.inject.Inject
import com.twitter.finagle.http.Request
import com.twitter.finatra.http.Controller

class HelloWorldController @Inject()(dao: CassandraSession) extends Controller {

  get("/hi") { request: Request =>
    info("hi")
    info(dao.connection().execute("SELECT now() FROM system.local;").one())
    "Hello " + request.params.getOrElse("name", "unnamed")
  }

  post("/hi") { hiRequest: HiRequest =>
    "Hello " + hiRequest.name + " with id " + hiRequest.id
  }
}