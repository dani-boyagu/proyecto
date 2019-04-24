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
    
    //Esta es la segunda rama
    //Con los metodos de suma,resta,multiplicacion y division
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

    @Override
    public String toString() {
        return "Suma_Resta{" + "num1=" + num1 + ", num2=" + num2 + ", result=" + result + '}';
    }
    
}
