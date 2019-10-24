# Module PureConfig

[![Maven Central](https://img.shields.io/maven-central/v/com.avast/sst-pureconfig_2.12)](https://repo1.maven.org/maven2/com/avast/sst-pureconfig_2.12/)

`libraryDependencies += "com.avast" %% "sst-pureconfig" % "<VERSION>"`

This module allows you to load your application's configuration file into a case class. It uses [PureConfig](https://pureconfig.github.io) 
library to do so which uses [Lightbend Config](https://github.com/lightbend/config) which means that your application's configuration 
will be in [HOCON](https://github.com/lightbend/config/blob/master/HOCON.md) format.

Loading of configuration is side-effectful so it is wrapped in `F` which is `Sync`. This module also tweaks the error messages a little.

```scala mdoc:silent
import com.avast.sst.pureconfig.PureConfigModule
import pureconfig.ConfigReader
import pureconfig.generic.semiauto.deriveReader
import zio.interop.catz._
import zio.Task

final case class ServerConfiguration(listenAddress: String, listenPort: Int)

implicit val serverConfigurationReader: ConfigReader[ServerConfiguration] = deriveReader

val maybeConfiguration = PureConfigModule.make[Task, ServerConfiguration]
```

Look for `sst-*-pureconfig` modules to get `implicit` instances of `ConfigReader` for specific libraries, e.g.:

```scala
import com.avast.sst.http4s.server.pureconfig.implicits._
```