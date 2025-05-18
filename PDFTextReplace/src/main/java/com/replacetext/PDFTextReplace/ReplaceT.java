package com.replacetext.PDFTextReplace;
import org.apache.pdfbox.cos.COSArray;
import org.apache.pdfbox.cos.COSString;
import org.apache.pdfbox.pdfparser.PDFStreamParser;
import org.apache.pdfbox.contentstream.operator.Operator;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.util.Matrix;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ReplaceT {
    public static void main(String[] args) {
        try {
            // Load the PDF document
            File file = new File("C:\\\\Users\\\\shaik\\\\OneDrive\\\\Desktop\\\\Pdf programs\\\\Humera resume.pdf");
            PDDocument document = PDDocument.load(file);

            // Iterate over each page
            for (PDPage page : document.getPages()) {
                PDFStreamParser parser = new PDFStreamParser(page);
                parser.parse();
                List<Object> tokens = parser.getTokens();

                for (int i = 0; i < tokens.size(); i++) {
                    Object token = tokens.get(i);
                    if (token instanceof COSString) {
                        COSString cosString = (COSString) token;
                        String string = cosString.getString();
                        string = string.replace("Employee Name", "Adam");
                        cosString.setValue(string.getBytes());
                    }
                }

                PDPageContentStream contentStream = new PDPageContentStream(document, page, PDPageContentStream.AppendMode.OVERWRITE, true);
                for (Object token : tokens) {
                    if (token instanceof COSString) {
                    	contentStream.beginText();
                        contentStream.showText(((COSString) token).getString());
                    } else if (token instanceof Operator) {
                        Operator operator = (Operator) token;
                        contentStream.appendRawCommands(operator.getName());
                    } else if (token instanceof Matrix) {
                        contentStream.transform((Matrix) token);
                    } else if (token instanceof COSArray) {
                        for (int j = 0; j < ((COSArray) token).size(); j++) {
                            Object element = ((COSArray) token).getObject(j);
                            if (element instanceof COSString) {
                            	contentStream.beginText();
                            	contentStream.showText(((COSString) element).getString());
                            }
                        }
                    }
                }
                contentStream.close();
            }

            // Save the modified document
            document.save("Updated1_Humera_resume.pdf");
            document.close();

            System.out.println("Text replaced and new PDF created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
