package juegoViborita;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class PantallaPerdedor extends Pantalla {
	


	public PantallaPerdedor(int ancho, int largo,String resource, int nivel) {
		super(ancho, largo, resource);
	
		
	}
	
	 public void dibujarse(Graphics graphics) {
	        super.dibujarse(graphics);
	        mostrarMensaje (graphics); 
	        
	 }
	 
	 private void mostrarMensaje(Graphics g) {
	    	g.setColor(Color.GREEN);
			g.setFont(new Font("Impact", Font.BOLD, 50));
			g.drawString("GAME OVER",300,300);
			g.setFont(new Font("Impact", Font.BOLD, 30));
			g.drawString("Press spacebar to Restart",280,340);
	    }

}