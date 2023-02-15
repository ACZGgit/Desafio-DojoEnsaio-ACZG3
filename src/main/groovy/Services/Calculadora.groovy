package Services

import Interfaces.CalculadoraI

class Calculadora implements CalculadoraI{

    private double lastResult;


    double getLastResult(){
        return this.lastResult
    }

    void setLastResult(double lastResult){
        this.lastResult = lastResult
    }

    @Override
    public double sum(double x, double y){
        return x + y
    }

    @Override
    double sub(double x, double y) {
        return x - y
    }

    @Override
    double div(double x, double y) {
        return 0
    }

    @Override
    double mult(double x, double y) {
        return 0
    }

    double raizQuadrada(int i) {
        return Math.sqrt(i)
    }

    double potencia(double base, double potencia){
        return Math.pow(base, potencia)
    }
}
