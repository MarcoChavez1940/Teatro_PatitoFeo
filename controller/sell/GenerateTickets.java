/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.sell;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import model.Function;
import persistencia.FunctionDAO;
import persistencia.SeatDAO;
import persistencia.ShowDAO;

/**
 *
 * @author marco
 */
public class GenerateTickets {
    
    public ArrayList<Image> generateTickets(ArrayList<String> numberSeats, int idFunction) throws IOException, BadElementException{
        
        ArrayList<Image> tickets = new ArrayList<>();
        ShowDAO showBD = new ShowDAO();
        FunctionDAO functionBD = new FunctionDAO();
        SeatDAO seatBD = new SeatDAO();
        Function function = functionBD.getOneFunction(idFunction);
        String showName = showBD.getShowName(function.getIdShow());
          
        for (String numberSeat : numberSeats) {
            BufferedImage image = ImageIO.read(new File("../PatitoFeo/src/view/sell/ticket.jpg"));    
            Graphics g = image.getGraphics();
            g.setFont(new Font("TimesRoman", Font.PLAIN, 16));
            g.setColor(Color.BLACK);
            
            g.drawString("Folio: " + seatBD.getIdSeat(numberSeat, idFunction), 100, 55);
            g.drawString("Asiento: " + numberSeat, 220, 55);
            g.drawString("Obra: " + showName, 55, 100);
            g.drawString("Fecha de funcion: " + function.getDate().toString(), 100, 130);
            g.drawString("Hora de comienzo: " + function.getStartTime().toString(), 100, 155);

            g.dispose();
            
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(image, "png", baos);
            Image iTextImage = Image.getInstance(baos.toByteArray());
            
            tickets.add(iTextImage);
        }
        
        return tickets;       
        //ImageIO.write(image, "png", new File("../PatitoFeo/src/view/sell/test.png"));
 
    }
    
    public void generatePDF(ArrayList<Image> tickets, String direction, String nameFile) throws FileNotFoundException, DocumentException{
        Document document = new Document(PageSize.A4, 20, 20, 20, 20);
        PdfWriter.getInstance(document, new FileOutputStream(direction + "/" + nameFile + ".pdf"));
        document.open();
        
        for (Image ticket : tickets) {
            document.add(ticket);
        }
        document.close();
    }
}
