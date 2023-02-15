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
        try {
            return x / y
        } catch (Exception error) {
            println("Erro!")
        }

    }

    @Override
    double mult(double x, double y) {
        return x * y
    }

    double raizQuadrada(int i) {
        return Math.sqrt(i)
    }

    double potencia(double base, double potencia){
        return Math.pow(base, potencia)
    }

    double media(List listaNumeros){
        return listaNumeros.sum() / listaNumeros.size()
    }

    double porcentagem(double value, double percent) {
        percent /= 100; // percent = percent / 100
        return value * percent
    }

    int fatorial(int n) {
        if (n == 1) {
            return 1
        }

        return  fatorial(n - 1) * n
    }
}
