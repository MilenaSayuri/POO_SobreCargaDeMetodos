public class TesteV2 {
    public static void main(String[] args){
        var c =new CalculadoraV2();
        float r1 = c.somar(2, 3);

        int r2 = c.somar(2, 3);
        //sobrecarga de metodos ^|^
        System.out.println(c.somar(2, 3));
    }
}
