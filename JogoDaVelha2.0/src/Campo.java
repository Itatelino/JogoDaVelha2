public class Campo {
    private char simbolo;

    public Campo() {
        this.simbolo = ' ';
    }

    public char getSimbolo() {
        return this.simbolo;
    }

    public void getSimbolo(char simbolo) {
        if (this.simbolo == ' ') {
            this.simbolo = simbolo;
        } else {
            System.out.print("Campo ja usado");
        }
    }

    public void setSimbolo(char simboloAtual) {
    }
}
