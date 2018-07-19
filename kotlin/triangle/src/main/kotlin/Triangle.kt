class Triangle(side1: Double, side2: Double, side3: Double) {
    var isEquilateral: Boolean = false
    var isIsosceles: Boolean = false
    var isScalene: Boolean = false

    constructor(side1: Int, side2: Int, side3: Int): this(side1 = side1.toDouble(), side2 = side2.toDouble(), side3 = side3.toDouble()){}

    init {
        if(side1 == 0.0 && side2 == 0.0 && side3 == 0.0)
            throw IllegalArgumentException()

        if(side1.plus(side2) <= side3)
            throw IllegalArgumentException()

        if(side2.plus(side3) <= side1)
            throw IllegalArgumentException()

        isEquilateral = side1 == side2 && side1 == side3

        isIsosceles = side2 == side3 || side1 == side2 || side1 == side3

        isScalene = side1 != side2 && side1 != side3
    }
}
