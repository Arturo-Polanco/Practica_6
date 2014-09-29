package pract6;

/**
 * ARTURO POLANCO CARRILLO
 * 01200720
 * 2/28/14
 */

public class NumeroComplejo {
	private static final float PI = 3.1415926535897932384626433832795f;
	private float real;
	private float imag;
	private float[] numeroComplejo = new float[2];
	private float polarAngle;
	private float polarRadius;

	/*Constructors*/
	public NumeroComplejo() {
		setReal(0);
		setImag(0);
		calcularPolar();
	}

	public NumeroComplejo(float real, float imag) {
		setReal(real);
		setImag(imag);
		calcularPolar();
	}

	public NumeroComplejo(NumeroComplejo numeroComplejo) {
		setReal(numeroComplejo.getReal());
		setImag(numeroComplejo.getImag());
		calcularPolar();
	}

	/*Setters*/

	public void setReal(float real) {
		this.real = real;
		this.numeroComplejo[0] = real;
	}

	public void setImag(float imag) {
		this.imag = imag;
		this.numeroComplejo[1] = imag;
	}

	public void setNumeroComplejo(float[] numeroComplejo) {
		this.numeroComplejo = numeroComplejo;
		setReal(numeroComplejo[0]);
		setImag(numeroComplejo[1]);
	}

	public void setPolarAngle(float polar) {
		this.polarAngle = polar;
	}

	public void setPolarRadius(float polarRadius) {
		this.polarRadius = polarRadius;
	}

	/*Getters*/

	public float getReal() {
		return real;
	}

	public float getImag() {
		return imag;
	}

	public float getPolarAngle() {
		return polarAngle;
	}

	public float getPolarRadius() {
		return polarRadius;
	}

	public String getStringNumeroComplejo(float[] numeroComplejo) {
		return "" + numeroComplejo[0] + " + " + numeroComplejo[1] + "i";
	}

	/*Calc*/

	private void calcularPolar() {
		setPolarAngle(180 * ((float)Math.atan2(imag, real)) / PI);
		setPolarRadius((float)Math.sqrt(Math.pow(real, 2) + Math.pow(imag, 2)));
	}

	public float[] multiplicarNumerosComplejos(NumeroComplejo numeroComplejo) {
		float[] producto = new float[2];
		producto[0] = this.getReal() * numeroComplejo.getReal() - this.getImag() * numeroComplejo.getImag();
		producto[1] = this.getReal() * numeroComplejo.getImag() + this.getImag() * numeroComplejo.getReal();
		return producto;
	}

	public float[] sumarNumerosComplejos(NumeroComplejo numeroComplejo1) {
		float[] suma = new float[2];
		suma[0] = this.numeroComplejo[0] + numeroComplejo1.numeroComplejo[0];
		suma[1] = this.numeroComplejo[1] + numeroComplejo1.numeroComplejo[1];
		return suma;
	}

	public float[] sumarNumerosComplejos(float real, float imag) {
		float[] suma = new float[2];
		suma[0] = this.numeroComplejo[0] + real;
		suma[1] = this.numeroComplejo[1] + imag;
		return suma;
	}

	public float[] sumarNumerosComplejos(int real, int imag) {
		float[] suma = new float[2];
		suma[0] = this.numeroComplejo[0] + real;
		suma[1] = this.numeroComplejo[1] + imag;
		return suma;
	}
}
