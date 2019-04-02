/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora_ramas;

/**
 *
 * @author usuario
 */
public class Suma_Resta {
    
    private int num1, num2,result;

    public Suma_Resta() {
     this.num1=8;
     this.num2=2;
    }
    
    public int Suma(){
        result=num1+num2;
        return result;
    }
    public int Resta(){
        result=num1-num2;
        return result;
    }
    public int Multiplicacion(){
        result=num1*num2;
        return result;
    }
    public int Division(){
        result=num1/num2;
        return result;
    }
}
