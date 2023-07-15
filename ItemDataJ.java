/*@Author Luis Montenegro
 *@Since 15/07/2023
 */
public class ItemDataJ {

    private Object originalValue;

    public ItemDataJ(Object originalValue){
        this.originalValue = originalValue;
    }

    public String getType(){
        if(originalValue instanceof Integer){
            return "entero";
        }
        else if(originalValue instanceof String){
            return "cadena";
        }
        else if(originalValue instanceof Boolean ){
            return "booleano";
        }
        else{
            return null;
        }
    }

    public String getInfo(){

        //Caso sea String
        if(originalValue instanceof String){
            String S = (String) originalValue, L;
            int x = S.length();
            L = String.valueOf(x);
            return "L"+L;
        }
        //Caso sea entero
        else if(originalValue instanceof Integer){
            int I = (Integer)originalValue%10;
            if(I == 0){
                return "M10";
            }
            else if(I == 5){
                return "M5";
            }
            else if(I == 2){
                return "M2";
            }
            else{
                return null;
            }
        }
        //Caso sea boolean
        else if(originalValue instanceof Boolean){
            if(originalValue.equals(true)){
                return "Verdadero";
            }
            else if(originalValue.equals(false)){
                return "False";
            }
            else{
                return null;
            }
        }
        else{
            return null;
        }
    }


}
