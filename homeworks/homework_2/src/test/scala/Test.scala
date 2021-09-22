import Exercises.Vector2D
import utest._

import scala.math.abs

object Test extends TestSuite{

    val tests = Tests{
        'test_divBy3Or7 - {
            assert(Exercises.divBy3Or7(1, 3) == Seq(3))
            assert(Exercises.divBy3Or7(5, 9) == Seq(6, 7, 9))
            assert(Exercises.divBy3Or7(0, 100) == Seq(0, 3, 6, 7, 9, 12, 14, 15, 18, 21, 24, 27, 28, 30, 33, 35, 36, 39, 42, 45, 48, 49, 51, 54, 56, 57, 60, 63, 66, 69, 70, 72, 75, 77, 78, 81, 84, 87, 90, 91, 93, 96, 98, 99))
        }

        'sumOfDivBy3Or5 - {
            assert(Exercises.sumOfDivBy3Or5(1, 3) == 3)
            assert(Exercises.sumOfDivBy3Or5(3, 5) == 8)
            assert(Exercises.sumOfDivBy3Or5(1, 16) == 60)
        }

        'primeFactor - {
            assert(Exercises.primeFactor(80) == Seq(2, 5))
            assert(Exercises.primeFactor(98) == Seq(2, 7))
            assert(Exercises.primeFactor(111) == Seq(3, 37))
        }

        'sumScalars - {
            assert(Exercises.sumScalars(Vector2D(2, 2), Vector2D(4, 2), Vector2D(5, 5), Vector2D(7, 2)) == 57)
            assert(Exercises.sumScalars(Vector2D(7, -4), Vector2D(-8, 6), Vector2D(1, 2), Vector2D(4, 8)) == -60)
            assert(Exercises.sumScalars(Vector2D(-1, 0.5), Vector2D(5, 5), Vector2D(1.5, -12), Vector2D(1, 1)) == -13)
        }

        'sumCosines - {
            assert(abs(Exercises.sumCosines(Vector2D(4, 3), Vector2D(-8, 6), Vector2D(3, 4), Vector2D(4, 3)) - 0.68) <= 0.1)
            assert(abs(Exercises.sumCosines(Vector2D(7, 1), Vector2D(5, 5), Vector2D(-5, -5), Vector2D(7, -1)) - 0.2) <= 0.1)
        }

        'sortByHeavyweight - {
            assert(Exercises.sortByHeavyweight().head == "Tin")
        }
    }
}
