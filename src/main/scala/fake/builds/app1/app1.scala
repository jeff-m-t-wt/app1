package fake.builds.app1

import fake.builds.core.CoreThing
import fake.builds.lib1.Lib1Thing
import fake.builds.lib2.Lib2Thing

object Main extends App {

  println((new CoreThing).info)
  println((new Lib1Thing).info)
  println((new Lib2Thing).info)

}
