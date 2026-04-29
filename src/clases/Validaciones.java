package clases;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class Validaciones {
	public static boolean validarCampoDecimal(JTextField campo, JLabel lblError) {
	    String texto = campo.getText();
	    String textoSinEspacios = texto.trim(); //"123 4" -> "1234"

	    try {
	        if (texto.isEmpty()) {
	        	//campo esta vacio
	            throw new Exception("Campo vacío");
	        }

	        if (textoSinEspacios.isEmpty()) {
	            throw new Exception("Ingrese un número válido");
	        }

	        Double.parseDouble(textoSinEspacios); //1234

	        if (texto.contains(" ")) {
	            throw new Exception("Ingrese un número válido");
	        }

	        campo.setBackground(Color.WHITE);
	        lblError.setVisible(false);
	        return true;

	    } catch (NumberFormatException ex) {
	        lblError.setText("Ingrese un número válido");
	        lblError.setVisible(true);
	        campo.setBackground(new Color(255, 200, 200));
	        return false;

	    } catch (Exception ex) {
	        lblError.setText(ex.getMessage());
	        lblError.setVisible(true);
	        campo.setBackground(new Color(255, 200, 200));
	        return false;
	    }
	}

	public static boolean validarCampoEntero(JTextField campo, JLabel lblError) {
	    String texto = campo.getText();
	    String textoSinEspacios = texto.trim();

	    try {
	        if (texto.isEmpty()) {
	            throw new Exception("Campo vacío");
	        }

	        if (textoSinEspacios.isEmpty()) {
	            throw new Exception("Ingrese un número válido");
	        }

	        Integer.parseInt(textoSinEspacios);

	        if (texto.contains(" ")) {
	            throw new Exception("Ingrese un número válido");
	        }

	        if (texto.contains(".")) {
	            throw new Exception("Ingrese un número entero");
	        }

	        campo.setBackground(Color.WHITE);
	        lblError.setVisible(false);
	        return true;

	    } catch (NumberFormatException ex) {
	        lblError.setText("Ingrese un número entero");
	        lblError.setVisible(true);
	        campo.setBackground(new Color(255, 200, 200));
	        return false;

	    } catch (Exception ex) {
	        lblError.setText(ex.getMessage());
	        lblError.setVisible(true);
	        campo.setBackground(new Color(255, 200, 200));
	        return false;
	    }
	}
	
	public static boolean validarCampoTexto(JTextField campo, JLabel lblError, int maxCaracteres) {
	    String texto = campo.getText();
	    String textoSinEspacios = texto.trim();

	    try {
	        if (texto.isEmpty()) {
	            throw new Exception("Campo vacío");
	        }

	        if (textoSinEspacios.isEmpty()) {
	            throw new Exception("Ingrese un texto");
	        }

	        if (textoSinEspacios.length() > maxCaracteres) {
	            throw new Exception("Máx. " + maxCaracteres + " caracteres");
	        }

	        campo.setBackground(Color.WHITE);
	        lblError.setVisible(false);
	        return true;

	    } catch (Exception ex) {
	        lblError.setText(ex.getMessage());
	        lblError.setVisible(true);
	        campo.setBackground(new Color(255, 200, 200));
	        return false;
	    }
	}
}
