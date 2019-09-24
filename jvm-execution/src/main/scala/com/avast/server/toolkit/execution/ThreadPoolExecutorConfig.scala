package com.avast.server.toolkit.execution

import java.util.concurrent.TimeUnit

import scala.concurrent.duration.{Duration, FiniteDuration}

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments"))
final case class ThreadPoolExecutorConfig(coreSize: Int,
                                          maxSize: Int,
                                          keepAlive: FiniteDuration = Duration(1000L, TimeUnit.MILLISECONDS),
                                          allowCoreThreadTimeout: Boolean = false)
