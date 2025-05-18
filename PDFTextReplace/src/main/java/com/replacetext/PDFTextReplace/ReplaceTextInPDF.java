package com.replacetext.PDFTextReplace;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.PDPageTree;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ReplaceTextInPDF {
    public static void main(String[] args) {
        try {
            // Load the PDF document
            File file = new File("C:\\Users\\shaik\\OneDrive\\Desktop\\Pdf programs\\Humera resume.pdf");
            PDDocument document = PDDocument.load(file);

            // Extract the text from the PDF
            PDFTextStripper pdfStripper = new PDFTextStripper();
            String text = pdfStripper.getText(document);

            // Replace "Employee Name" with "Adam"
            text = text.replace("Employee Name", "Adam");

            // Create a new document with the replaced text
            PDDocument newDocument = new PDDocument();
            PDFTextStripperByArea stripper = new PDFTextStripperByArea();
            PDPageTree pages = document.getPages();
            for (PDPage page : pages) {
                PDPage newPage = new PDPage();
                newDocument.addPage(newPage);

                PDPageContentStream contentStream = new PDPageContentStream(newDocument, newPage);

                String[] lines = text.split("\r\n|\r|\n");
                contentStream.beginText();
                contentStream.setFont(PDType1Font.HELVETICA, 12);
                contentStream.newLineAtOffset(25, 700);

                for (String line : lines) {
                    contentStream.showText(line);
                    contentStream.newLineAtOffset(0, -15); // Move to the next line
                }

                contentStream.endText();
                contentStream.close();

            }

            // Save the new document
            newDocument.save("C:\\\\Users\\\\shaik\\\\OneDrive\\\\Desktop\\\\Pdf programs\\\\Updated_Humera_resume.pdf");

            // Close the documents
            document.close();
            newDocument.close();

            System.out.println("Text replaced and new PDF created successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
