/**
  * Created by saumil.shah on 5/3/17.
  */

import org.scalatest
import org.scalatest.FlatSpec

class MySystemSpec extends FlatSpec {
  val mySystem = new MySystem

  behavior of "#testMe"

  it should "print properly" in {
    mySystem.testMe
    assert(1 == 1)
  }

}
