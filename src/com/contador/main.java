package com.contador;

import com.contador.Empleado;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        Nomina nomina=new Nomina();
        ArrayList<Empleado> empleados=new ArrayList<>();
        Empleado juan=new Directo("Juan",5360000);
        Empleado julian=new Vendedor("Julian",2450000,55510000);
        Empleado johanna=new Freelancer("Johanna",76000,85);
        Empleado carolina=new Vendedor("Carolina",990000,62487000);
        Empleado david=new Directo("David",2895000);
        Empleado gustavo=new Freelancer("Gustavo",52500,60);
        Empleado pedro=new Promotor("Pedro",1500,250,48);
        nomina.getEmpleados().add(juan);
        nomina.getEmpleados().add(julian);
        nomina.getEmpleados().add(johanna);
        nomina.getEmpleados().add(carolina);
        nomina.getEmpleados().add(david);
        nomina.getEmpleados().add(gustavo);
        nomina.getEmpleados().add(pedro);

        nomina.getEmpleados().forEach(nominaactual->{StringBuilder vistaso = new StringBuilder();
            vistaso.append(nominaactual.getNombre()).append("  el salario es  : ").append(nominaactual.calcularSalario());
            System.out.println(vistaso);
        });
    }
}
