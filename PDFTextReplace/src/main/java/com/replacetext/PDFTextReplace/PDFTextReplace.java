package com.replacetext.PDFTextReplace;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.List;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.PDResources;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType0Font;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType0Font;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.text.PDFTextStripper;

import java.io.File;
import java.io.IOException;

public class PDFTextReplace {

    public static void main(String[] args) throws IOException {
        String filePath = "C:\\Users\\shaik\\OneDrive\\Desktop\\Pdf programs\\Humera resume.pdf";
        String searchText = "Employee Name";
        String replacementText = "Adam";

        PDDocument document = PDDocument.load(new File(filePath));

        // Replace text
        replaceText(document, searchText, replacementText);

        document.save("C:\\Users\\shaik\\OneDrive\\Desktop\\Pdf programs\\Humera resume1.pdf");
        document.close();
    }

    private static void replaceText(PDDocument document, String searchText, String replacementText) throws IOException {
        // Iterate through each page
        for (int pageNumber = 0; pageNumber < document.getNumberOfPages(); pageNumber++) {
            PDPage page = document.getPage(pageNumber);

            // Use PDFTextStripper to extract text from the page
            PDFTextStripper textStripper = new PDFTextStripper();
            String pageText = textStripper.getText(document);

            // Replace text in the extracted text
            if (pageText.contains(searchText)) {
                // Create a content stream to write to the page
                PDPageContentStream contentStream = new PDPageContentStream(document, page, PDPageContentStream.AppendMode.APPEND, true, true);
                contentStream.beginText();
                contentStream.setFont(PDType1Font.HELVETICA_BOLD, 12);
                contentStream.newLineAtOffset(100, 700); // Adjust position as needed
                contentStream.showText(replacementText);
                contentStream.endText();
                contentStream.close();
            }
        }
    }
}
