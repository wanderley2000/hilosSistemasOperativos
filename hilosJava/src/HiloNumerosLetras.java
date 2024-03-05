public class HiloNumerosLetras implements Runnable{
    private int tipo;
    public HiloNumerosLetras(int tipo) {
        this.tipo = tipo;
    }

    @Override
    public void run() {
        //bucle  que toma una desición de acuerdo al caso:
        while (true){
            switch (tipo){
                case 1:
                    for (int i = 1; i < 31; i++) {
                        System.out.println(i);
                    }
                    break;
                case 2:
                    for (char y = 'a'; y < 'z'; y++) {
                        System.out.println(y);
                    }
                    break;
            }
        }
    }
}
