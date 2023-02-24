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
        return 0
    }

    @Override
    double div(double x, double y) {
        return 0
    }

    @Override
    double mult(double x, double y) {
        return 0
    }

    double sqrt(double value) {
        return Math.sqrt(value)
    }
}
