package net.pessu

import io.micronaut.http.annotation.Get
import io.micronaut.http.client.annotation.Client

@Client("https://ifconfig.co/json")
interface IfConfigClient {

  /**
   * Post a message to Slack
   * @return response from Slack API
   */
  @Get()
  fun get(): IfConfig

}
