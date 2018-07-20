class Triangle(val side1: Double, val side2: Double, val side3: Double) {
    val isEquilateral: Boolean by lazy { side2 == side1 && side1 == side3 }
    val isIsosceles: Boolean by lazy { side2 == side3 || side1 == side2 || side1 == side3 }
    val isScalene: Boolean by lazy { side1 != side2 && side1 != side3 }

    constructor(side1: Int, side2: Int, side3: Int): this(side1 = side1.toDouble(), side2 = side2.toDouble(), side3 = side3.toDouble()){}

    init {
        if(side1 == 0.0 && side2 == 0.0 && side3 == 0.0)
            throw IllegalArgumentException()

        if(side1.plus(side2) <= side3)
            throw IllegalArgumentException()

        if(side2.plus(side3) <= side1)
            throw IllegalArgumentException()
    }
}
