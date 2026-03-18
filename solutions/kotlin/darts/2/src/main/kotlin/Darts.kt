import kotlin.math.abs
import kotlin.math.hypot

object Darts {

    fun score(x: Number, y: Number /* choose proper types! */): Int {
        val landingPoint = hypot(x.toDouble(), y.toDouble())

        return when {
            isInInnerCircle(landingPoint) -> 10
            isInMiddleCircle(landingPoint) -> 5
            isInOutsideCircle(landingPoint) -> 1
            else -> 0
        }
    }

    fun isInInnerCircle(n: Double): Boolean = n <= 1
    fun isInMiddleCircle(n: Double): Boolean = n <= 5
    fun isInOutsideCircle(n: Double): Boolean = n <= 10
}
/**
If the dart lands outside the target, player earns no points (0 points).
If the dart lands in the outer circle of the target, player earns 1 point.
If the dart lands in the middle circle of the target, player earns 5 points.
If the dart lands in the inner circle of the target, player earns 10 points.

| Zone          | Condition     | Points |
| ------------- | ------------- | ------ |
| Inner circle  | distance ≤ 1  | 10     |
| Middle circle | distance ≤ 5  | 5      |
| Outer circle  | distance ≤ 10 | 1      |
| Off the board | distance > 10 | 0      |

A few examples from the tests:
 •  score(-9, 9) → sqrt(81 + 81) ≈ 12.7 → off board → 0
 •  score(0, 10) → sqrt(0 + 100) = 10.0 → outer circle → 1
 •  score(-5, 0) → sqrt(25 + 0) = 5.0 → middle circle → 5
 •  score(0, -1) → sqrt(0 + 1) = 1.0 → inner circle → 10
 •  score(0.7, 0.7) → sqrt(0.49 + 0.49) ≈ 0.99 → inner circle → 10
 •  score(0.8, -0.8) → sqrt(0.64 + 0.64) ≈ 1.13 → middle circle → 5
**/