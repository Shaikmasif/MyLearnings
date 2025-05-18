package com.replacetext.PDFTextReplace;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.TextPosition;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PDFTextReplace1 {

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

    @SuppressWarnings("deprecation")
	private static void replaceText(PDDocument document, String searchText, String replacementText) throws IOException {
        for (int pageNumber = 0; pageNumber < document.getNumberOfPages(); pageNumber++) {
            PDPage page = document.getPage(pageNumber);

            CustomPDFTextStripper stripper = new CustomPDFTextStripper();
            stripper.setStartPage(pageNumber + 1);
            stripper.setEndPage(pageNumber + 1);
            stripper.getText(document); // Populate the positions list

            PDPageContentStream contentStream = new PDPageContentStream(document, page, PDPageContentStream.AppendMode.APPEND, true, true);

            for (TextPosition position : stripper.getPositions()) {
                float x = position.getXDirAdj();
                float y = position.getYDirAdj();
                float width = position.getWidthDirAdj();
                float height = position.getHeightDir();
                PDRectangle pageSize = page.getMediaBox();
                float pageHeight = pageSize.getHeight();

                // Draw a white rectangle over the old text to "erase" it
                contentStream.setNonStrokingColor(255, 255, 255); // White color
                contentStream.addRect(x, pageHeight - y, width, height);
                contentStream.fill();

                // Draw the new text
                contentStream.beginText();
                contentStream.setFont(PDType1Font.HELVETICA_BOLD, 12);
                contentStream.newLineAtOffset(x, pageHeight - y);
                contentStream.showText(replacementText);
                contentStream.endText();
            }

            contentStream.close();
        }
    }

    static class CustomPDFTextStripper extends PDFTextStripper {
        private List<TextPosition> positions = new ArrayList<>();

        public CustomPDFTextStripper() throws IOException {
        }

        @Override
        protected void writeString(String string, List<TextPosition> textPositions) throws IOException {
            if (string.contains("Employee Name")) {
                for (TextPosition text : textPositions) {
                    if (text.getUnicode().equals("Employee Name".substring(0, text.getUnicode().length()))) {
                        positions.add(text);
                    }
                }
            }
            super.writeString(string, textPositions);
        }

        public List<TextPosition> getPositions() {
            return positions;
        }
    }
}
