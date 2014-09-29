package pract6;

import java.util.Arrays;

/**
 * Created by ArtofWack on 3/14/14.
 */
public abstract class ArrayUtil {
	public static double[]   arreglo = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
	public static double[][] matriz  = { { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 },
	                                     { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 },
	                                     { 5, 4, 3, 2, 1, 6, 7, 8, 9, 10 },
	                                     { 6, 7, 8, 9, 10, 5, 4, 3, 2, 1 }
	};

	/*Suma*/
	public static double suma( double[] arreglo ) {
		double sum = 0;
		for ( double num : arreglo ) {
			sum += num;
		}
		return sum;
	}

	public static double suma( int[] arreglo ) {
		double sum = 0;
		for ( int num : arreglo ) {
			sum += num;
		}
		return sum;
	}

	public static double suma( double[][] matriz ) {
		double sum = 0;
		for ( int i = 0; i < matriz.length; i++ ) {
			for ( int j = 0; j < matriz[i].length; j++ ) {
				sum += matriz[i][j];
			}
		}
		return sum;
	}

	public static double suma( int[][] matriz ) {
		double sum = 0;
		for ( int i = 0; i < matriz.length; i++ ) {
			for ( int j = 0; j < matriz[i].length; j++ ) {
				sum += matriz[i][j];
			}
		}
		return sum;
	}

	/*Max*/

	public static double max( double[] arreglo ) {
		double max = arreglo[0];
		for ( int i = 0; i < arreglo.length; i++ ) {
			if ( max < arreglo[i] )
				max = arreglo[i];
		}
		return max;
	}

	public static double max( int[] arreglo ) {
		double max = arreglo[0];
		for ( int i = 0; i < arreglo.length; i++ ) {
			if ( max < arreglo[i] )
				max = arreglo[i];
		}
		return max;
	}

	public static double max( double[][] matriz ) {
		double max = matriz[0][0];
		for ( int i = 0; i < matriz.length; i++ ) {
			for ( int j = 0; j < matriz[i].length; j++ )
				if ( max < matriz[i][j] )
					max = matriz[i][j];
		}
		return max;
	}

	public static double max( int[][] matriz ) {
		double max = matriz[0][0];
		for ( int i = 0; i < matriz.length; i++ ) {
			for ( int j = 0; j < matriz[i].length; j++ )
				if ( max < matriz[i][j] )
					max = matriz[i][j];
		}
		return max;
	}

	/*Compara*/
	public static boolean compara( double[] arreglo1, double[] arreglo2 ) {
		if ( Arrays.equals( arreglo1, arreglo2 ) )
			return true;
		return false;
	}

	public static boolean compara( int[] arreglo1, int[] arreglo2 ) {
		if ( Arrays.equals( arreglo1, arreglo2 ) )
			return true;
		return false;
	}

	public static boolean compara( double[][] matriz1, double[][] matriz2 ) {
		return Arrays.deepEquals( matriz2, matriz1 );
	}

	public static boolean compara( int[][] matriz1, int[][] matriz2 ) {
		if ( Arrays.deepEquals( matriz2, matriz1 ) )
			return true;
		return false;
	}
}