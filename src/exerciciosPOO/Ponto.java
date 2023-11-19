package exerciciosPOO;

class Ponto {
    int x;
    int y;

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void trocarValores(Ponto outroPonto) {
        int tempX = this.x;
        int tempY = this.y;

        this.x = outroPonto.x;
        this.y = outroPonto.y;

        outroPonto.x = tempX;
        outroPonto.y = tempY;
    }
}
