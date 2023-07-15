class ItemData constructor(originalValue: Any?){



    fun getType(originalValue: Any): String?{
        if (originalValue is String){
            return "cadena"
        }
        else if (originalValue is Int){
            return "entero"
        }
        else if (originalValue is Boolean){
            return "booleano"
        }
        else {
            return null
        }
    }

    fun getInfo(originalValue: Any): String?{
        if (originalValue is String){
            var l = originalValue.length
            return "L$l"
        }
        else if(originalValue is Int){
            var I = originalValue%10
            if(I == 10){
                return "M10"
            }
            else if(I == 5){
                return "M5"
            }
            else if(I==2){
                return "M2"
            }
            else{
                return null
            }
        }
        else if(originalValue is Boolean){
            if(originalValue == true){
                return "Verdadero"
            }
            else if(originalValue == false){
                return "Falso"
            }
            else{
                return null
            }
        }
        else{
            return null
        }
    }
}