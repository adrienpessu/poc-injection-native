package net.pessu

import io.micronaut.configuration.picocli.PicocliRunner
import jakarta.inject.Inject
import picocli.CommandLine.Command

@Command(
  name = "ifconfig", description = ["..."],
  mixinStandardHelpOptions = true
)
class IfConfigCommand : Runnable {

  @Inject
  lateinit var ifConfigClient: IfConfigClient

  override fun run() {
    print(ifConfigClient.get())
  }

  companion object {
    @JvmStatic
    fun main(args: Array<String>) {
      PicocliRunner.run(IfConfigCommand::class.java, *args)
    }
  }
}
