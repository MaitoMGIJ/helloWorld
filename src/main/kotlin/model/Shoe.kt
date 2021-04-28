package model

class Shoe {
    var size: Int = 34
        set(value) {
            field = if(value >= 34) {
                value
            }else {
                34
            }
        }
    var color: String = "White"
    var model: String = "Boots"
        set(value) {
            field = if(value == "Tennis") {
                "Boots"
            } else{
                value
            }
        }
}