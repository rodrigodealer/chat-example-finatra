package com.twitter.hello

import com.datastax.driver.core.{Session, SocketOptions}
import com.google.inject.Singleton
import com.outworkers.phantom.connectors.{CassandraConnection, ContactPoints}

object Connector {

  val hosts = Seq("127.0.0.1")

  lazy val default: CassandraConnection = ContactPoints.apply(hosts)
    .withClusterBuilder(_.withSocketOptions(
      new SocketOptions()
        .setConnectTimeoutMillis(2000)
        .setReadTimeoutMillis(2000)
    )
    ).noHeartbeat().keySpace("phantom")

  def connect(): CassandraConnection = {
    return default
  }
}

@Singleton
class CassandraSession {
  def connection(): Session = Connector.default.session
}