package tofu.control

import cats.{Applicative, FlatMap}
import tofu.instances.bind._

class CatsInstancesFromBindSuite {
  def summonBindInstances[F[+_, +_]](implicit bind: Bind[F]): Unit = {
    requireApplicative[F[Throwable, _]]
    requireFlatMap[F[Nothing, _]]
  }

  def requireApplicative[F[_]](implicit applicative: Applicative[F]): Unit = ()

  def requireFlatMap[F[_]](implicit flatMap: FlatMap[F]): Unit = ()
}
