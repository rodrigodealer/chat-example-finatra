package com.twitter.hello.model


import java.util.{Date, UUID}

case class Message(id: UUID, from: String, to: String, message: String, timestamp: Date)

