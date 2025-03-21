package mastermind;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class GestorIO {

    private static BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

    public String inString() {
        String entrada = null;
        try {
            entrada = b.readLine();
        } catch (Exception e) {
            this.salir();
        }
        return entrada;
    }

    public int inInt() {
        int entrada = 0;
        try {
            entrada = Integer.parseInt(this.inString());
        } catch (Exception e) {
            this.salir();
        }
        return entrada;
    }

    public float inFloat() {
        float entrada = 0;
        try {
            entrada = Float.parseFloat(this.inString());
        } catch (Exception e) {
            this.salir();
        }
        return entrada;
    }

    public double inDouble() {
        double entrada = 0.0;
        try {
            entrada = Double.parseDouble(this.inString());
        } catch (Exception e) {
            this.salir();
        }
        return entrada;
    }

    public long inLong() {
        long entrada = 0;
        try {
            entrada = Long.parseLong(this.inString());
        } catch (Exception e) {
            this.salir();
        }
        return entrada;
    }

    public byte inByte() {
        byte entrada = 0;
        try {
            entrada = Byte.parseByte(this.inString());
        } catch (Exception e) {
            this.salir();
        }
        return entrada;
    }

    public short inShort() {
        short entrada = 0;
        try {
            entrada = Short.parseShort(this.inString());
        } catch (Exception e) {
            this.salir();
        }
        return entrada;
    }

    public char inChar() {
        char caracter = ' ';
        String entrada = this.inString();
        if (entrada.length() > 1) {
            this.salir();
        } else
            caracter = entrada.charAt(0);
        return caracter;
    }

    public boolean inBoolean() {
        boolean entradaLogica = true;
        String entrada = this.inString();
        if (entrada.equalsIgnoreCase("true") || entrada.equalsIgnoreCase("false"))
            entradaLogica = Boolean.valueOf(entrada).booleanValue();
        else {
            this.salir();
        }
        return entradaLogica;
    }

    public void out(String salida) {
        System.out.print(salida);
    }

    public void out(int salida) {
        System.out.print(salida);
    }

    public void out(float salida) {
        System.out.print(salida);
    }

    public void out(double salida) {
        System.out.print(salida);
    }

    public void out(long salida) {
        System.out.print(salida);
    }

    public void out(byte salida) {
        System.out.print(salida);
    }

    public void out(Short salida) {
        System.out.print(salida);
    }

    public void out(char salida) {
        System.out.print(salida);
    }

    public void out(boolean salida) {
        System.out.print(salida);
    }

    public void lineSeparator() {
        System.out.print(System.lineSeparator());
    }

    private void salir() {
        System.out.println("ERROR de entrada/salida");
        System.exit(0);
    }
}
