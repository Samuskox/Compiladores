public class AnalisadorV1{
    public static int parse(String expressao){
        String[] algebrinha = expressao.split("\\s");
        for (String string : algebrinha) {
            System.out.println(string);
        }

        int n1 = Integer.parseInt(algebrinha[0]);
        int n2 = Integer.parseInt(algebrinha[2]);
        String operando = algebrinha[1];
        int resultado = 0;

        switch (operando) {
            case "+": 
            resultado = n1 + n2;
            break;
            case "-":
            resultado = n1 - n2;
            break;
            case "*":
            resultado = n1 * n2;
            break;
            case "/":
            resultado = n1 / n2;
            break;
        }
        

        System.out.println(resultado);


        return resultado;
    }
    
    public static void main(String[] args) {
        parse("1 + 10");
    }
}
