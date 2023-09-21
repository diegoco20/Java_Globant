
package Enums;


public enum Movimientos {
    W(1, 0), A(0, -1), S(-1, 0), D(0, 1);
    
    private final int[] valor;
    
    Movimientos(int... valor){
        this.valor = valor;
    }
    
    public int[] getValor(){
        return valor;
    }
    
    
}
