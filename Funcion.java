public class Funcion {
    static void calculoNomina(int salario) {
        float pension = (salario/100)*4;
        float eps = (salario/100)*4;
        float total;
        int auxilio;
        if (salario>=2320000 ) {
            total= salario - pension - eps;
            auxilio = 0;
        }else {
            total= salario + 140606 - pension - eps;
            auxilio = 140606;
        }
        System.out.println("Su nomina es de: \n salario:         +" + salario +"\n eps:             -"+ eps + "\n pension:         -"+ pension +"\n aux. transporte: +"+ auxilio +"\n --------------------------"+ "\n total:           " + total);
    }

    public static void main(String[] args) {
        calculoNomina(1160000);
    }
}

