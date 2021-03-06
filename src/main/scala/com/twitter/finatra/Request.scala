package com.twitter.finatra

import scala.collection.mutable.Map
import com.twitter.finatra_core.FinatraRequest
import org.jboss.netty.handler.codec.http.Cookie

class Request extends FinatraRequest {

  var path: String                            = "/"
  var method: String                          = "GET"
  var body: Array[Byte]                       = Array()
  var params: Map[String, String]             = Map()
  var multiParams: Map[String, MultipartItem] = Map()
  var headers: Map[String, String]            = Map()
  var cookies: Map[String, Cookie]            = Map()

  def finatraPath   = path
  val a = "newasds"
  def finatraMethod = method
  def finatraParams = params

  def path(p:String):Request = {
    this.path = p
    this
  }

  def method(m: String):Request = {
    this.method = m
    this
  }

  def body(b: Array[Byte]):Request = {
    this.body = b
    this
  }

  def params(m: Map[String, String]):Request = {
    this.params = this.params ++ m
    this
  }

  def headers(m: Map[String, String]):Request = {
    this.headers = this.headers ++ m
    this
  }

  def cookies(m: Map[String, Cookie]):Request = {
    this.cookies = this.cookies ++ m
    this
  }

}
