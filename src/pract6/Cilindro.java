package pract6;

/**
 * ARTURO POLANCO CARRILLO
 * 01200720
 * 2/28/14
 */
class Cilindro {
	private static final float PI = 3.1415926535897932384626433832795f;
	private float areaBase;
	private float altura;
	private float radio;
	private float volumen;

	/*Constructors*/

	public Cilindro() {
		setRadio( 0 );
		calcularArea( radio );
		setAltura( 0 );
		setVolumen( calcularVolumen( this.getAreaBase(), this.getAltura() ) );
	}

	public Cilindro( float radio, float altura ) {
		if ( radio < 0 ) {
			radio = -radio;
		}
		if ( altura < 0 ) {
			altura = -altura;
		}
		setRadio( radio );
		calcularArea( radio );
		setAltura( altura );
		setVolumen( calcularVolumen( this.getAreaBase(), this.getAltura() ) );
	}

	public Cilindro( Cilindro cilindro ) {
		this.setRadio( cilindro.getRadio() );
		this.setAltura( cilindro.getAltura() );
		this.setAreaBase( cilindro.getAreaBase() );
		this.setVolumen( cilindro.getVolumen() );
	}

	/*Setters*/

	/*Calculate values*/
	private void calcularArea( float radio ) {
		areaBase = (float) ( PI * Math.pow( radio, 2 ) );
	}

	private float calcularVolumen( float areaBase, float altura ) {
		volumen = areaBase * altura;
		return volumen;
	}

	public String determinarCilindroMasGrande( Cilindro cilindro ) {
		if ( cilindro.getVolumen() > this.getVolumen() ) {
			return "El cilindro 2 es mas grande";
		}
		else if ( cilindro.getVolumen() != this.getVolumen() ) {
			return "El cilindro 1 es mas grande";
		}
		else {
			return "Son iguales!!";
		}
	}

	public float getAltura() {
		return altura;
	}

	/*Getters*/

	private void setAltura( float altura ) {
		if ( altura < 0 ) {
			altura = -altura;
		}
		this.altura = altura;
	}

	public float getAreaBase() {
		return areaBase;
	}

	private void setAreaBase( float areaBase ) {
		this.areaBase = areaBase;
	}

	public float getRadio() {
		return radio;
	}

	private void setRadio( float radio ) {
		if ( radio < 0 ) {
			radio = -radio;
		}
		this.radio = radio;
		setAreaBase( this.radio );
	}

	public float getVolumen() {
		return volumen;
	}

	private void setVolumen( float volumen ) {
		this.volumen = volumen;
	}
}