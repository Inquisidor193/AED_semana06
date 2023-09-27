package semana_06;

public class ArregloTemperaturas {
	
	private double[] temperatura;
    private int indice;

    public ArregloTemperaturas() {
        temperatura = new double[10];
        indice = 0;
    }

    public int tamanio() {
        return indice;
    }
    
    public int obtener(int t) {
		return (int) temperatura[t];
	}

	public void adicionar(double d) {
		if (indice == temperatura.length)
			ampliarArreglo();
		temperatura[indice] = d;
		indice++;
	}

	public void eliminarAlFinal() {
		indice--;
	}

	public void eliminarTodo() {
		indice = 0;
	}
	
	private void ampliarArreglo() {
	    double[] aux = temperatura;
		temperatura = new double[indice + 10];
		for (int i = 0; i < indice; i++)
			temperatura[i] = aux[i];
	}
	
	public int temperaturaMenor() {
		int menor = 1;
		for (double valor : temperatura) {
			if (menor < valor) {
				menor = (int) valor;
			}
		}
		return menor;
	}

	public int posPrimeraTemperaturaNormal() {
		int i = 0;
		for (double valor : temperatura) {
			if (valor >= 36.1 && valor <= 37.2) {
				return i;
			}
			i++;
		}
		return -1;
	}
	
	public void remplazarPrimeraTemperaturaNormal() {
		int pos = posPrimeraTemperaturaNormal();
		if (pos != -1) {
			temperatura[pos] = temperaturaMenor();
		}
	}
	
	public void incrementarTemperaturas() {
        for (int i = 0; i < indice; i++) {
            temperatura[i] += 0.2;
        }
    }
}
