public class CalculadoraV3 {
    public int somar (int... elementos){
        var res = 0;
        //enhanced for (Java 5)
        //for each
        for(int elemento : elementos){
            res += elemento;
        }
        for(int i = 0; i < elementos.length; i++){
            res += elementos[i];
        }
        return res;
    }
    
}
